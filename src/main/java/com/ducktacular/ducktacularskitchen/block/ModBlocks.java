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

    public static final DeferredBlock<Block> OAK_COUNTER = BLOCKS.register("oak_counter", Counter::new);
    public static final DeferredBlock<Block> OAK_DRAWER = BLOCKS.register("oak_drawer", Drawer::new);
    public static final DeferredBlock<Block> OAK_CABINET = BLOCKS.register("oak_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> SPRUCE_COUNTER = BLOCKS.register("spruce_counter", Counter::new);
    public static final DeferredBlock<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer", Drawer::new);
    public static final DeferredBlock<Block> BIRCH_COUNTER = BLOCKS.register("birch_counter", Counter::new);
    public static final DeferredBlock<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer", Drawer::new);
    public static final DeferredBlock<Block> BIRCH_CABINET = BLOCKS.register("birch_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> JUNGLE_COUNTER = BLOCKS.register("jungle_counter", Counter::new);
    public static final DeferredBlock<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer", Drawer::new);
    public static final DeferredBlock<Block> JUNGLE_CABINET = BLOCKS.register("jungle_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> ACACIA_COUNTER = BLOCKS.register("acacia_counter", Counter::new);
    public static final DeferredBlock<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer", Drawer::new);
    public static final DeferredBlock<Block> ACACIA_CABINET = BLOCKS.register("acacia_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> DARK_OAK_COUNTER = BLOCKS.register("dark_oak_counter", Counter::new);
    public static final DeferredBlock<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer", Drawer::new);
    public static final DeferredBlock<Block> DARK_OAK_CABINET = BLOCKS.register("dark_oak_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> SPRUCE_CABINET = BLOCKS.register("spruce_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> MANGROVE_COUNTER = BLOCKS.register("mangrove_counter", Counter::new);
    public static final DeferredBlock<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer", Drawer::new);
    public static final DeferredBlock<Block> MANGROVE_CABINET = BLOCKS.register("mangrove_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> CHERRY_COUNTER = BLOCKS.register("cherry_counter", Counter::new);
    public static final DeferredBlock<Block> CHERRY_DRAWER = BLOCKS.register("cherry_drawer", Drawer::new);
    public static final DeferredBlock<Block> CHERRY_CABINET = BLOCKS.register("cherry_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> BAMBOO_COUNTER = BLOCKS.register("bamboo_counter", Counter::new);
    public static final DeferredBlock<Block> BAMBOO_DRAWER = BLOCKS.register("bamboo_drawer", Drawer::new);
    public static final DeferredBlock<Block> BAMBOO_CABINET = BLOCKS.register("bamboo_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> CRIMSON_COUNTER = BLOCKS.register("crimson_counter", Counter::new);
    public static final DeferredBlock<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer", Drawer::new);
    public static final DeferredBlock<Block> CRIMSON_CABINET = BLOCKS.register("crimson_cabinet", Cabinet::new);
    public static final DeferredBlock<Block> WARPED_COUNTER = BLOCKS.register("warped_counter", Counter::new);
    public static final DeferredBlock<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer", Drawer::new);
    public static final DeferredBlock<Block> WARPED_CABINET = BLOCKS.register("warped_cabinet", Cabinet::new);
}
