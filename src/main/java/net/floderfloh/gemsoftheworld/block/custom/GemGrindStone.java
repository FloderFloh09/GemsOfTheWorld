package net.floderfloh.gemsoftheworld.block.custom;

import com.mojang.serialization.MapCodec;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class GemGrindStone extends HorizontalDirectionalBlock {
    public static final MapCodec<GemGrindStone> CODEC = simpleCodec(GemGrindStone::new);
    public static final VoxelShape SHAPE = Block.box(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<AttachFace> FACE = BlockStateProperties.ATTACH_FACE;

    private static final Map<RegistryObject<Item>, RegistryObject<Item>> GRINDING_RECIPES = new HashMap<>();
    private static final Map<Item, Item> VANILLA_GRINDING_RECIPES = new HashMap<>();

    static {
        GRINDING_RECIPES.put(ModItems.BONDED_RUBY, ModItems.RUBY_SHARD);
        GRINDING_RECIPES.put(ModItems.BONDED_SAPPHIRE, ModItems.SAPPHIRE);
        GRINDING_RECIPES.put(ModItems.BONDED_ALEXANDRITE, ModItems.RAW_ALEXANDRITE);
        GRINDING_RECIPES.put(ModItems.BONDED_PINK_GARNET, ModItems.RAW_PINK_GARNET);
        GRINDING_RECIPES.put(ModItems.BONDED_GREEN_GARNET, ModItems.RAW_GREEN_GARNET);
        GRINDING_RECIPES.put(ModItems.BONDED_RED_GARNET, ModItems.RAW_RED_GARNET);
        GRINDING_RECIPES.put(ModItems.BONDED_YELLOW_GARNET, ModItems.RAW_YELLOW_GARNET);
        GRINDING_RECIPES.put(ModItems.BONDED_TANZANITE, ModItems.TANZANITE);
        GRINDING_RECIPES.put(ModItems.BONDED_PARAIBA_TOURMALINE, ModItems.PARAIBA_TOURMALINE);

    }

    public GemGrindStone(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, net.minecraft.core.Direction.NORTH));
    }

    private static final Map<AttachFace, VoxelShape> SHAPES = new EnumMap<>(AttachFace.class);
    static {
        SHAPES.put(AttachFace.FLOOR, Block.box(0, 0, 0, 16, 8, 16));
        SHAPES.put(AttachFace.WALL, Block.box(0, 0, 0, 16, 16, 8));
        SHAPES.put(AttachFace.CEILING, Block.box(0, 8, 0, 16, 16, 16));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state.getValue(FACE));
    }




    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }


    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        AttachFace face;

        if (direction == Direction.DOWN) {
            face = AttachFace.CEILING;
        } else if (direction == Direction.UP) {
            face = AttachFace.FLOOR;
        } else {
            face = AttachFace.WALL;
        }

        return this.defaultBlockState()
                .setValue(FACE, face)
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }






    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }


    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hitResult) {
        ItemStack heldStack = player.getItemInHand(player.getUsedItemHand());
        Item heldItem = heldStack.getItem();

        System.out.println("Held item: " + heldItem);
        System.out.println("Is it BONDED_DIAMOND? " + (heldItem == ModItems.BONDED_DIAMOND.get()));

        Item outputItem = getOutputItem(heldItem);
        System.out.println("Output item: " + outputItem);

        if (outputItem != null) {
            processConversion(world, pos, player, heldStack, outputItem);
            if (!world.isClientSide() && player instanceof ServerPlayer serverPlayer) {
                ResourceLocation advancementID = ResourceLocation.parse("gemsoftheworld:grinding");
                AdvancementHolder advancementHolder = serverPlayer.server.getAdvancements().get(advancementID);
                serverPlayer.getAdvancements().award(advancementHolder, "grinding");
            }
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    private void processConversion(Level world, BlockPos pos, Player player, ItemStack inputStack, Item outputItem) {
        world.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1f, 1f);

        // 30% Wahrscheinlichkeit, dass die Verarbeitung fehlschlägt
        if (RandomSource.create().nextFloat() < 0.3f) {
            return; // Keine Items werden ausgegeben
        }

        // Erstes Ausgabeitem
        ItemEntity firstItem = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(),
                new ItemStack(outputItem, 1));
        world.addFreshEntity(firstItem);

        // Zweites Ausgabeitem: Minerals (immer hinzugefügt)
        ItemEntity secondItem = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(),
                new ItemStack(ModItems.MINERALS.get(), 1));
        world.addFreshEntity(secondItem);

        // Reduziere den Eingabestack um 1
        inputStack.shrink(1);
    }

    private Item getOutputItem(Item input) {
        System.out.println("Searching for output item for: " + input);

        // Zuerst in GRINDING_RECIPES suchen
        for (Map.Entry<RegistryObject<Item>, RegistryObject<Item>> entry : GRINDING_RECIPES.entrySet()) {
            if (entry.getKey().get() == input) {
                System.out.println("Found in GRINDING_RECIPES: " + entry.getValue().get());
                return entry.getValue().get();
            }
        }

        // Dann in VANILLA_GRINDING_RECIPES suchen
        Item result = VANILLA_GRINDING_RECIPES.get(input);
        System.out.println("Found in VANILLA_GRINDING_RECIPES: " + result);
        return result;
    }
    public static void initializeRecipes() {
        VANILLA_GRINDING_RECIPES.put(ModItems.BONDED_DIAMOND.get(), Items.DIAMOND);
        System.out.println("VANILLA_GRINDING_RECIPES initialized with: " + VANILLA_GRINDING_RECIPES);
    }





}



