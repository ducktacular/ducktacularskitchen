package com.ducktacular.ducktacularskitchen.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.ducktacular.ducktacularskitchen.main.DucktacularsKitchen.MODID;
import com.ducktacular.ducktacularskitchen.block.Counter;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> BLENDER = BLOCKS.register("blender", Blender::new);

    public static final DeferredBlock<Block> OAK_TILE = BLOCKS.register("oak_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> SPRUCE_TILE = BLOCKS.register("spruce_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<Block> BIRCH_TILE = BLOCKS.register("birch_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<Block> JUNGLE_TILE = BLOCKS.register("jungle_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<Block> ACACIA_TILE = BLOCKS.register("acacia_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<Block> DARK_OAK_TILE = BLOCKS.register("dark_oak_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<Block> MANGROVE_TILE = BLOCKS.register("mangrove_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<Block> CHERRY_TILE = BLOCKS.register("cherry_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<Block> BAMBOO_TILE = BLOCKS.register("bamboo_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final DeferredBlock<Block> CRIMSON_TILE = BLOCKS.register("crimson_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));
    public static final DeferredBlock<Block> WARPED_TILE = BLOCKS.register("warped_tile", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)));

    public static final DeferredBlock<Block> OAK_PLANKS_MOSAIC = BLOCKS.register("oak_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_MOSAIC = BLOCKS.register("spruce_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_MOSAIC = BLOCKS.register("birch_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_MOSAIC = BLOCKS.register("jungle_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS)));
    public static final DeferredBlock<Block> ACACIA_PLANKS_MOSAIC = BLOCKS.register("acacia_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_MOSAIC = BLOCKS.register("dark_oak_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_MOSAIC = BLOCKS.register("mangrove_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_MOSAIC = BLOCKS.register("cherry_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_MOSAIC = BLOCKS.register("bamboo_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS)));
    public static final DeferredBlock<Block> WARPED_PLANKS_MOSAIC = BLOCKS.register("warped_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_MOSAIC = BLOCKS.register("crimson_planks_mosaic", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));

    public static final BlockBehaviour.Properties OakCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties SpruceCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.PODZOL).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties BirchCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.SAND).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties JungleCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.DIRT).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties AcaciaCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties DarkOakCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties MangroveCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_RED).sound(SoundType.WOOD).strength(2f);
    public static final BlockBehaviour.Properties CherryCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD).strength(2f);
    public static final BlockBehaviour.Properties BambooCounterProps = BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD).strength(2f);
    public static final BlockBehaviour.Properties CrimsonCounterProps = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.WOOD).sound(SoundType.NETHER_WOOD).strength(2f);
    public static final BlockBehaviour.Properties WarpedCounterProps = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.WOOD).sound(SoundType.NETHER_WOOD).strength(2f);
    public static final BlockBehaviour.Properties StoneCounterProps = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE).sound(SoundType.STONE).strength(2f);

    public static final DeferredBlock<Block> OAK_COUNTER = BLOCKS.register("oak_counter", () -> new Counter(OakCounterProps));
    public static final DeferredBlock<Block> OAK_DRAWER = BLOCKS.register("oak_drawer", () -> new Drawer(OakCounterProps));
    public static final DeferredBlock<Block> OAK_CABINET = BLOCKS.register("oak_cabinet", () -> new Cabinet(OakCounterProps));
    public static final DeferredBlock<Block> SPRUCE_COUNTER = BLOCKS.register("spruce_counter", () -> new Counter(SpruceCounterProps));
    public static final DeferredBlock<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer", () -> new Drawer(SpruceCounterProps));
    public static final DeferredBlock<Block> SPRUCE_CABINET = BLOCKS.register("spruce_cabinet", () -> new Cabinet(SpruceCounterProps));
    public static final DeferredBlock<Block> BIRCH_COUNTER = BLOCKS.register("birch_counter", () -> new Counter(BirchCounterProps));
    public static final DeferredBlock<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer", () -> new Drawer(BirchCounterProps));
    public static final DeferredBlock<Block> BIRCH_CABINET = BLOCKS.register("birch_cabinet", () -> new Cabinet(BirchCounterProps));
    public static final DeferredBlock<Block> JUNGLE_COUNTER = BLOCKS.register("jungle_counter", () -> new Counter(JungleCounterProps));
    public static final DeferredBlock<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer", () -> new Drawer(JungleCounterProps));
    public static final DeferredBlock<Block> JUNGLE_CABINET = BLOCKS.register("jungle_cabinet", () -> new Cabinet(JungleCounterProps));
    public static final DeferredBlock<Block> ACACIA_COUNTER = BLOCKS.register("acacia_counter", () -> new Counter(AcaciaCounterProps));
    public static final DeferredBlock<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer", () -> new Drawer(AcaciaCounterProps));
    public static final DeferredBlock<Block> ACACIA_CABINET = BLOCKS.register("acacia_cabinet", () -> new Cabinet(AcaciaCounterProps));
    public static final DeferredBlock<Block> DARK_OAK_COUNTER = BLOCKS.register("dark_oak_counter", () -> new Counter(DarkOakCounterProps));
    public static final DeferredBlock<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer", () -> new Drawer(DarkOakCounterProps));
    public static final DeferredBlock<Block> DARK_OAK_CABINET = BLOCKS.register("dark_oak_cabinet", () -> new Cabinet(DarkOakCounterProps));
    public static final DeferredBlock<Block> MANGROVE_COUNTER = BLOCKS.register("mangrove_counter", () -> new Counter(MangroveCounterProps));
    public static final DeferredBlock<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer", () -> new Drawer(MangroveCounterProps));
    public static final DeferredBlock<Block> MANGROVE_CABINET = BLOCKS.register("mangrove_cabinet", () -> new Cabinet(MangroveCounterProps));
    public static final DeferredBlock<Block> CHERRY_COUNTER = BLOCKS.register("cherry_counter", () -> new Counter(CherryCounterProps));
    public static final DeferredBlock<Block> CHERRY_DRAWER = BLOCKS.register("cherry_drawer", () -> new Drawer(CherryCounterProps));
    public static final DeferredBlock<Block> CHERRY_CABINET = BLOCKS.register("cherry_cabinet", () -> new Cabinet(CherryCounterProps));
    public static final DeferredBlock<Block> BAMBOO_COUNTER = BLOCKS.register("bamboo_counter", () -> new Counter(BambooCounterProps));
    public static final DeferredBlock<Block> BAMBOO_DRAWER = BLOCKS.register("bamboo_drawer", () -> new Drawer(BambooCounterProps));
    public static final DeferredBlock<Block> BAMBOO_CABINET = BLOCKS.register("bamboo_cabinet", () -> new Cabinet(BambooCounterProps));
    public static final DeferredBlock<Block> CRIMSON_COUNTER = BLOCKS.register("crimson_counter", () -> new Counter(CrimsonCounterProps));
    public static final DeferredBlock<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer", () -> new Drawer(CrimsonCounterProps));
    public static final DeferredBlock<Block> CRIMSON_CABINET = BLOCKS.register("crimson_cabinet", () -> new Cabinet(CrimsonCounterProps));
    public static final DeferredBlock<Block> WARPED_COUNTER = BLOCKS.register("warped_counter", () -> new Counter(WarpedCounterProps));
    public static final DeferredBlock<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer", () -> new Drawer(WarpedCounterProps));
    public static final DeferredBlock<Block> WARPED_CABINET = BLOCKS.register("warped_cabinet", () -> new Cabinet(WarpedCounterProps));
    public static final DeferredBlock<Block> STONE_COUNTER = BLOCKS.register("stone_counter", () -> new Counter(StoneCounterProps));
    public static final DeferredBlock<Block> STONE_DRAWER = BLOCKS.register("stone_drawer", () -> new Drawer(StoneCounterProps));
    public static final DeferredBlock<Block> STONE_CABINET = BLOCKS.register("stone_cabinet", () -> new Cabinet(StoneCounterProps));
}
