package fr.wasstyle.riseofshinobi.buildermod.block;

import fr.wasstyle.riseofshinobi.buildermod.ROSBuilder;
import fr.wasstyle.riseofshinobi.buildermod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ROSBuilder.MODID);

    public static final RegistryObject<Block> SOUL_SOIL = registerBlock("soul_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> SMOKER =
            register("smoker", () -> new SmokerBlock(BlockBehaviour.Properties.copy(Blocks.SMOKER)));

    public static final RegistryObject<Block> SMITHING_TABLE =
            register("smithing_table", () -> new SmithingTableBlock(BlockBehaviour.Properties.copy(Blocks.SMITHING_TABLE)));

    public static final RegistryObject<Block> BARREL =
            register("barrel", () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));

    public static final RegistryObject<Block> HONEY_BLOCK =
            register("honey_block", () -> new HoneyBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK)));

    public static final RegistryObject<Block> DRIED_KELP_BLOCK =
            register("dried_kelp_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK)));

    public static final RegistryObject<Block> BAMBOO =
            register("bamboo", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO)));

    public static final RegistryObject<Block> COMPOSTER =
            register("composter", () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.COMPOSTER)));

    public static final RegistryObject<Block> BELL =
            register("bell", () -> new BellBlock(BlockBehaviour.Properties.copy(Blocks.BELL)));

    public static final RegistryObject<Block> BLAST_FURNACE =
            register("blast_furnace", () -> new BlastFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.BLAST_FURNACE)));

    public static final RegistryObject<Block> MOSS_CARPET =
            register("moss_carpet", () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_CARPET)));

    public static final RegistryObject<Block> MOSS_BLOCK =
            register("moss_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<Block> DEAD_TUBE_CORAL_FAN =
            BLOCKS.register("dead_tube_coral_fan",
                    () -> new CoralFanBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_TUBE_CORAL_FAN)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG =
            register("stripped_dark_oak_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG =
            register("stripped_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG =
            register("stripped_jungle_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG =
            register("stripped_birch_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG =
            register("stripped_acacia_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG)));

    public static final RegistryObject<Block> ANDESITE_STAIRS =
            register("andesite_stairs", stairsLike(Blocks.ANDESITE.defaultBlockState(), Blocks.ANDESITE_STAIRS));

    public static final RegistryObject<Block> POLISHED_ANDESITE_STAIRS =
            register("polished_andesite_stairs", stairsLike(Blocks.POLISHED_ANDESITE.defaultBlockState(), Blocks.POLISHED_ANDESITE_STAIRS));

    public static final RegistryObject<Block> AMETHYST_BLOCK =
            register("amethyst_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> BEEHIVE =
            register("beehive", () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)));

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR =
            register("dark_oak_trapdoor", trapdoorLike(BlockSetType.DARK_OAK, Blocks.DARK_OAK_TRAPDOOR));

    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL =
            register("polished_andesite_wall", wallLike(Blocks.POLISHED_ANDESITE_WALL));

    public static final RegistryObject<Block> BAMBOO_STAIRS =
            register("bamboo_stairs", stairsLike(Blocks.BAMBOO_PLANKS.defaultBlockState(), Blocks.BAMBOO_STAIRS));

    public static final RegistryObject<Block> LOOM =
            register("loom", () -> new LoomBlock(BlockBehaviour.Properties.copy(Blocks.LOOM)));

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR =
            register("spruce_trapdoor", trapdoorLike(BlockSetType.SPRUCE, Blocks.SPRUCE_TRAPDOOR));

    public static final RegistryObject<Block> BAMBOO_DOOR =
            register("bamboo_door", doorLike(BlockSetType.BAMBOO, Blocks.BAMBOO_DOOR));

    public static final RegistryObject<Block> LANTERN =
            register("lantern", () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)));

    public static final RegistryObject<Block> BAMBOO_MOSAIC =
            register("bamboo_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC)));

    public static final RegistryObject<Block> MUD_BRICKS =
            register("mud_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR =
            register("jungle_trapdoor", trapdoorLike(BlockSetType.JUNGLE, Blocks.JUNGLE_TRAPDOOR));

    // LIGHT_00 ... LIGHT_15 (un seul “Light Block” en vanilla, mais on reproduit les intensités)
    public static final RegistryObject<Block> LIGHT_00 = register("light_00", light(0));
    public static final RegistryObject<Block> LIGHT_01 = register("light_01", light(1));
    public static final RegistryObject<Block> LIGHT_02 = register("light_02", light(2));
    public static final RegistryObject<Block> LIGHT_03 = register("light_03", light(3));
    public static final RegistryObject<Block> LIGHT_04 = register("light_04", light(4));
    public static final RegistryObject<Block> LIGHT_05 = register("light_05", light(5));
    public static final RegistryObject<Block> LIGHT_06 = register("light_06", light(6));
    public static final RegistryObject<Block> LIGHT_07 = register("light_07", light(7));
    public static final RegistryObject<Block> LIGHT_08 = register("light_08", light(8));
    public static final RegistryObject<Block> LIGHT_09 = register("light_09", light(9));
    public static final RegistryObject<Block> LIGHT_10 = register("light_10", light(10));
    public static final RegistryObject<Block> LIGHT_11 = register("light_11", light(11));
    public static final RegistryObject<Block> LIGHT_12 = register("light_12", light(12));
    public static final RegistryObject<Block> LIGHT_13 = register("light_13", light(13));
    public static final RegistryObject<Block> LIGHT_14 = register("light_14", light(14));
    public static final RegistryObject<Block> LIGHT_15 = register("light_15", light(15));

    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES =
            register("flowering_azalea_leaves", leavesLike(Blocks.FLOWERING_AZALEA_LEAVES));

    public static final RegistryObject<Block> BIRCH_TRAPDOOR =
            register("birch_trapdoor", trapdoorLike(BlockSetType.BIRCH, Blocks.BIRCH_TRAPDOOR));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL =
            register("smooth_sandstone_wall", wallLike(Blocks.SMOOTH_SANDSTONE_WALL));

    public static final RegistryObject<Block> ACACIA_TRAPDOOR =
            register("acacia_trapdoor", trapdoorLike(BlockSetType.ACACIA, Blocks.ACACIA_TRAPDOOR));

    public static final RegistryObject<Block> RAW_GOLD_BLOCK =
            register("raw_gold_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)));

    public static final RegistryObject<Block> BRAIN_CORAL_FAN =
            register("brain_coral_fan", () -> new CoralFanBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_FAN)));
    public static final RegistryObject<Block> BRAIN_CORAL_BLOCK =
            register("brain_coral_block", () -> new CoralBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL_BLOCK)));
    public static final RegistryObject<Block> BRAIN_CORAL =
            register("brain_coral", () -> new CoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.BRAIN_CORAL)));

    public static final RegistryObject<Block> BUBBLE_CORAL_BLOCK =
            register("bubble_coral_block", () -> new CoralBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_BLOCK)));
    public static final RegistryObject<Block> FIRE_CORAL_BLOCK =
            register("fire_coral_block", () -> new CoralBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_BLOCK)));
    public static final RegistryObject<Block> FIRE_CORAL_FAN =
            register("fire_coral_fan", () -> new CoralFanBlock(BlockBehaviour.Properties.copy(Blocks.FIRE_CORAL_FAN)));
    public static final RegistryObject<Block> BUBBLE_CORAL_FAN =
            register("bubble_coral_fan", () -> new CoralFanBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL_FAN)));
    public static final RegistryObject<Block> BUBBLE_CORAL =
            register("bubble_coral", () -> new CoralPlantBlock(BlockBehaviour.Properties.copy(Blocks.BUBBLE_CORAL)));

    public static final RegistryObject<Block> CHERRY_LEAVES =
            register("cherry_leaves", leavesLike(Blocks.CHERRY_LEAVES));

    public static final RegistryObject<Block> CRIMSON_ROOTS =
            register("crimson_roots", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS)));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL =
            register("smooth_quartz_wall", wallLike(Blocks.SMOOTH_QUARTZ));

    public static final RegistryObject<Block> CRIMSON_HYPHAE =
            register("crimson_hyphae", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> SOUL_LANTERN =
            register("soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)));

    public static final RegistryObject<Block> COPPER_BLOCK =
            register("copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> MANGROVE_TRAPDOOR =
            register("mangrove_trapdoor", trapdoorLike(BlockSetType.MANGROVE, Blocks.MANGROVE_TRAPDOOR));

    public static final RegistryObject<Block> RAW_COPPER_BLOCK =
            register("raw_copper_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    public static final RegistryObject<Block> RAW_IRON_BLOCK =
            register("raw_iron_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> POLISHED_DIORITE_WALL =
            register("polished_diorite_wall", wallLike(Blocks.POLISHED_DIORITE_WALL));
    public static final RegistryObject<Block> DIORITE_WALL =
            register("diorite_wall", wallLike(Blocks.DIORITE_WALL));

    public static final RegistryObject<Block> DEEPSLATE_BRICK_STAIRS =
            register("deepslate_brick_stairs", stairsLike(Blocks.DEEPSLATE_BRICKS.defaultBlockState(), Blocks.DEEPSLATE_BRICK_STAIRS)));

    public static final RegistryObject<Block> LODESTONE =
            register("lodestone", () -> new LodestoneBlock(BlockBehaviour.Properties.copy(Blocks.LODESTONE)));

    public static final RegistryObject<Block> DEEPSLATE_BRICKS =
            register("deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> TARGET_BLOCK =
            register("target_block", () -> new TargetBlock(BlockBehaviour.Properties.copy(Blocks.TARGET)));

    public static final RegistryObject<Block> SCAFFOLDING =
            register("scaffolding", () -> new ScaffoldingBlock(BlockBehaviour.Properties.copy(Blocks.SCAFFOLDING)));

    public static final RegistryObject<Block> WITHER_ROSE =
            register("wither_rose", () -> new WitherRoseBlock(MobEffects.WITHER, BlockBehaviour.Properties.copy(Blocks.WITHER_ROSE)));

    public static final RegistryObject<Block> CHAIN =
            register("chain", () -> new ChainBlock(BlockBehaviour.Properties.copy(Blocks.CHAIN)));

    public static final RegistryObject<Block> GRINDSTONE =
            register("grindstone", () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.GRINDSTONE)));

    public static final RegistryObject<Block> SPORE_BLOSSOM =
            register("spore_blossom", () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)));

    public static final RegistryObject<Block> LIGHTNING_ROD =
            register("lightning_rod", () -> new LightningRodBlock(BlockBehaviour.Properties.copy(Blocks.LIGHTNING_ROD)));

    public static final RegistryObject<Block> SOUL_TORCH =
            register("soul_torch", () -> new SoulTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH), ParticleTypes.SOUL_FIRE_FLAME));

    public static final RegistryObject<Block> BLUE_ICE =
            register("blue_ice", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE)));

    public static final RegistryObject<Block> TURTLE_EGG =
            register("turtle_egg", () -> new TurtleEggBlock(BlockBehaviour.Properties.copy(Blocks.TURTLE_EGG)));

    public static final RegistryObject<Block> SEAGRASS =
            register("seagrass", () -> new SeagrassBlock(BlockBehaviour.Properties.copy(Blocks.SEAGRASS)));

    public static final RegistryObject<Block> DECORATED_POT =
            register("decorated_pot", () -> new DecoratedPotBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT)));

    public static final RegistryObject<Block> CAMPFIRE =
            register("campfire", () -> new CampfireBlock(false, 1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<Block> SOUL_CAMPFIRE =
            register("soul_campfire", () -> new CampfireBlock(true, 2, BlockBehaviour.Properties.copy(Blocks.SOUL_CAMPFIRE)));

    public static final RegistryObject<Block> SEA_PICKLE =
            register("sea_pickle", () -> new SeaPickleBlock(BlockBehaviour.Properties.copy(Blocks.SEA_PICKLE)));

    public static final RegistryObject<Block> STONECUTTER =
            register("stonecutter", () -> new StonecutterBlock(BlockBehaviour.Properties.copy(Blocks.STONECUTTER)));

    // Candles (vanilla a déjà toutes les variantes colorées)
    public static final RegistryObject<Block> CANDLE =
            register("candle", () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)));
    public static final RegistryObject<Block> WHITE_CANDLE =
            register("white_candle", () -> new ColoredCandleBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_CANDLE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CANDLE =
            register("light_gray_candle", () -> new ColoredCandleBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CANDLE)));
    public static final RegistryObject<Block> GRAY_CANDLE =
            register("gray_candle", () -> new ColoredCandleBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_CANDLE)));
    public static final RegistryObject<Block> BLACK_CANDLE =
            register("black_candle", () -> new ColoredCandleBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_CANDLE)));
    public static final RegistryObject<Block> BROWN_CANDLE =
            register("brown_candle", () -> new ColoredCandleBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_CANDLE)));
    public static final RegistryObject<Block> RED_CANDLE =
            register("red_candle", () -> new ColoredCandleBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_CANDLE)));
    public static final RegistryObject<Block> ORANGE_CANDLE =
            register("orange_candle", () -> new ColoredCandleBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_CANDLE)));
    public static final RegistryObject<Block> YELLOW_CANDLE =
            register("yellow_candle", () -> new ColoredCandleBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_CANDLE)));
    public static final RegistryObject<Block> LIME_CANDLE =
            register("lime_candle", () -> new ColoredCandleBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_CANDLE)));
    public static final RegistryObject<Block> GREEN_CANDLE =
            register("green_candle", () -> new ColoredCandleBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_CANDLE)));
    public static final RegistryObject<Block> CYAN_CANDLE =
            register("cyan_candle", () -> new ColoredCandleBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_CANDLE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CANDLE =
            register("light_blue_candle", () -> new ColoredCandleBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CANDLE)));
    public static final RegistryObject<Block> BLUE_CANDLE =
            register("blue_candle", () -> new ColoredCandleBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_CANDLE)));
    public static final RegistryObject<Block> PURPLE_CANDLE =
            register("purple_candle", () -> new ColoredCandleBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_CANDLE)));
    public static final RegistryObject<Block> MAGENTA_CANDLE =
            register("magenta_candle", () -> new ColoredCandleBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CANDLE)));
    public static final RegistryObject<Block> PINK_CANDLE =
            register("pink_candle", () -> new ColoredCandleBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_CANDLE)));

    public static final RegistryObject<Block> CHISELED_BOOKSHELF =
            register("chiseled_bookshelf", () -> new ChiseledBookShelfBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_BOOKSHELF)));

    public static final RegistryObject<Block> SOUL_FIRE =
            register("soul_fire", () -> new SoulFireBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_FIRE)));

    public static final RegistryObject<Block> SOUL_SOIL =
            register("soul_soil", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)));

    // Azalea (les “arbustes”)
    public static final RegistryObject<Block> AZALEA =
            register("azalea", () -> new AzaleaBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA)));
    public static final RegistryObject<Block> FLOWERING_AZALEA =
            register("flowering_azalea", () -> new AzaleaBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA)));

    // Amethyst buds / cluster
    public static final RegistryObject<Block> SMALL_AMETHYST_BUD =
            register("small_amethyst_bud", () -> new AmethystClusterBlock(3, 3, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)));
    public static final RegistryObject<Block> MEDIUM_AMETHYST_BUD =
            register("medium_amethyst_bud", () -> new AmethystClusterBlock(4, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)));
    public static final RegistryObject<Block> LARGE_AMETHYST_BUD =
            register("large_amethyst_bud", () -> new AmethystClusterBlock(5, 5, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
    public static final RegistryObject<Block> AMETHYST_CLUSTER =
            register("amethyst_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));

    // NOTE: à partir de 1.13+, les slabs n’ont plus de “double slab block” séparé : c’est un state du même SlabBlock.
    // On remplace donc les paires *_slab_double / *_slab_half par UN unique SlabBlock.
    public static final RegistryObject<Block> CHERRY_SLAB =
            register("cherry_slab", slabLike(Blocks.CHERRY_SLAB));
    public static final RegistryObject<Block> MANGROVE_SLAB =
            register("mangrove_slab", slabLike(Blocks.MANGROVE_SLAB));
    public static final RegistryObject<Block> BAMBOO_SLAB =
            register("bamboo_slab", slabLike(Blocks.BAMBOO_SLAB));
    public static final RegistryObject<Block> WARPED_SLAB =
            register("warped_slab", slabLike(Blocks.WARPED_SLAB));
    public static final RegistryObject<Block> CRIMSON_SLAB =
            register("crimson_slab", slabLike(Blocks.CRIMSON_SLAB));
    public static final RegistryObject<Block> STONE_SLAB =
            register("stone_slab", slabLike(Blocks.STONE_SLAB));
    public static final RegistryObject<Block> ANDESITE_SLAB =
            register("andesite_slab", slabLike(Blocks.ANDESITE_SLAB));
    public static final RegistryObject<Block> POLISHED_ANDESITE_SLAB =
            register("polished_andesite_slab", slabLike(Blocks.POLISHED_ANDESITE_SLAB));
    public static final RegistryObject<Block> DIORITE_SLAB =
            register("diorite_slab", slabLike(Blocks.DIORITE_SLAB));
    public static final RegistryObject<Block> POLISHED_DIORITE_SLAB =
            register("polished_diorite_slab", slabLike(Blocks.POLISHED_DIORITE_SLAB));
    public static final RegistryObject<Block> GRANITE_SLAB =
            register("granite_slab", slabLike(Blocks.GRANITE_SLAB));
    public static final RegistryObject<Block> POLISHED_GRANITE_SLAB =
            register("polished_granite_slab", slabLike(Blocks.POLISHED_GRANITE_SLAB));
    public static final RegistryObject<Block> MOSSY_STONE_BRICK_SLAB =
            register("mossy_stone_brick_slab", slabLike(Blocks.MOSSY_STONE_BRICK_SLAB));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_SLAB =
            register("mossy_cobblestone_slab", slabLike(Blocks.MOSSY_COBBLESTONE_SLAB));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_SLAB =
            register("smooth_sandstone_slab", slabLike(Blocks.SMOOTH_SANDSTONE_SLAB));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_SLAB =
            register("smooth_red_sandstone_slab", slabLike(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_SLAB =
            register("smooth_quartz_slab", slabLike(Blocks.SMOOTH_QUARTZ_SLAB));
    public static final RegistryObject<Block> RED_NETHER_BRICK_SLAB =
            register("red_nether_brick_slab", slabLike(Blocks.RED_NETHER_BRICK_SLAB));
    public static final RegistryObject<Block> END_STONE_BRICK_SLAB =
            register("end_stone_brick_slab", slabLike(Blocks.END_STONE_BRICK_SLAB));
    public static final RegistryObject<Block> DEEPSLATE_SLAB =
            register("deepslate_slab", slabLike(Blocks.DEEPSLATE));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_SLAB =
            register("polished_deepslate_slab", slabLike(Blocks.POLISHED_DEEPSLATE_SLAB));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_SLAB =
            register("deepslate_brick_slab", slabLike(Blocks.DEEPSLATE_BRICK_SLAB));
    public static final RegistryObject<Block> DEEPSLATE_TILE_SLAB =
            register("deepslate_tile_slab", slabLike(Blocks.DEEPSLATE_TILE_SLAB));
    public static final RegistryObject<Block> BLACKSTONE_SLAB =
            register("blackstone_slab", slabLike(Blocks.BLACKSTONE_SLAB));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_SLAB =
            register("polished_blackstone_brick_slab", slabLike(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_SLAB =
            register("polished_blackstone_slab", slabLike(Blocks.POLISHED_BLACKSTONE_SLAB));
    public static final RegistryObject<Block> PRISMARINE_SLAB =
            register("prismarine_slab", slabLike(Blocks.PRISMARINE_SLAB));
    public static final RegistryObject<Block> DARK_PRISMARINE_SLAB =
            register("dark_prismarine_slab", slabLike(Blocks.DARK_PRISMARINE_SLAB));
    public static final RegistryObject<Block> PRISMARINE_BRICKS_SLAB =
            register("prismarine_bricks_slab", slabLike(Blocks.PRISMARINE_BRICK_SLAB));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_SLAB =
            register("exposed_cut_copper_slab", slabLike(Blocks.EXPOSED_CUT_COPPER_SLAB));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_SLAB =
            register("oxidized_cut_copper_slab", slabLike(Blocks.OXIDIZED_CUT_COPPER_SLAB));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_SLAB =
            register("weathered_cut_copper_slab", slabLike(Blocks.WEATHERED_CUT_COPPER_SLAB));
    public static final RegistryObject<Block> CUT_COPPER_SLAB =
            register("cut_copper_slab", slabLike(Blocks.CUT_COPPER_SLAB));

    // Walls manquantes dans ton extrait (exemples)
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_WALL =
            register("polished_blackstone_wall", wallLike(Blocks.POLISHED_BLACKSTONE_WALL));
    public static final RegistryObject<Block> GRANITE_WALL =
            register("granite_wall", wallLike(Blocks.GRANITE_WALL));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static Supplier<Block> stairsLike(BlockState base, Block copyFrom) {
        return () -> new StairBlock(() -> base, BlockBehaviour.Properties.copy(copyFrom));
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<Block> trapdoorLike(BlockSetType setType, Block copyFrom) {
        return () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(copyFrom), setType);
    }

    private static Supplier<Block> doorLike(BlockSetType setType, Block copyFrom) {
        return () -> new DoorBlock(BlockBehaviour.Properties.copy(copyFrom), setType);
    }

    private static Supplier<Block> light(int lvl) {
        return () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT)
                .lightLevel(s -> lvl)
                .noOcclusion());
    }

    private static Supplier<Block> slabLike(Block copyFrom) {
        return () -> new SlabBlock(BlockBehaviour.Properties.copy(copyFrom));
    }

    private static Supplier<Block> wallLike(Block copyFrom) {
        return () -> new WallBlock(BlockBehaviour.Properties.copy(copyFrom));
    }

    private static Supplier<Block> leavesLike(Block copyFrom) {
        return () -> new LeavesBlock(BlockBehaviour.Properties.copy(copyFrom));
    }
}
