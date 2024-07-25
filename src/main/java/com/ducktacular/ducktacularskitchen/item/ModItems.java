package com.ducktacular.ducktacularskitchen.item;

import com.ducktacular.ducktacularskitchen.block.ModBlocks;
import com.ducktacular.ducktacularskitchen.main.DucktacularsKitchen;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DucktacularsKitchen.MODID);

    public static final DeferredItem<Item> ORANGE = ITEMS.register( "orange", () ->
            new Item(new Item.Properties().stacksTo( 19).fireResistant()));

    public static final DeferredItem<BlockItem> BLENDER = ITEMS.registerSimpleBlockItem("blender", ModBlocks.BLENDER);

    public static final DeferredItem<BlockItem> OAK_TILE = ITEMS.registerSimpleBlockItem("oak_tile", ModBlocks.OAK_TILE);
    public static final DeferredItem<BlockItem> SPRUCE_TILE = ITEMS.registerSimpleBlockItem("spruce_tile", ModBlocks.SPRUCE_TILE);
    public static final DeferredItem<BlockItem> BIRCH_TILE = ITEMS.registerSimpleBlockItem("birch_tile", ModBlocks.BIRCH_TILE);
    public static final DeferredItem<BlockItem> JUNGLE_TILE = ITEMS.registerSimpleBlockItem("jungle_tile", ModBlocks.JUNGLE_TILE);
    public static final DeferredItem<BlockItem> ACACIA_TILE = ITEMS.registerSimpleBlockItem("acacia_tile", ModBlocks.ACACIA_TILE);
    public static final DeferredItem<BlockItem> DARK_OAK_TILE = ITEMS.registerSimpleBlockItem("dark_oak_tile", ModBlocks.DARK_OAK_TILE);
    public static final DeferredItem<BlockItem> MANGROVE_TILE = ITEMS.registerSimpleBlockItem("mangrove_tile", ModBlocks.MANGROVE_TILE);
    public static final DeferredItem<BlockItem> CHERRY_TILE = ITEMS.registerSimpleBlockItem("cherry_tile", ModBlocks.CHERRY_TILE);
    public static final DeferredItem<BlockItem> BAMBOO_TILE = ITEMS.registerSimpleBlockItem("bamboo_tile", ModBlocks.BAMBOO_TILE);
    public static final DeferredItem<BlockItem> CRIMSON_TILE = ITEMS.registerSimpleBlockItem("crimson_tile", ModBlocks.CRIMSON_TILE);
    public static final DeferredItem<BlockItem> WARPED_TILE = ITEMS.registerSimpleBlockItem("warped_tile", ModBlocks.WARPED_TILE);

    public static final DeferredItem<BlockItem> OAK_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("oak_planks_mosaic", ModBlocks.OAK_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> SPRUCE_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("spruce_planks_mosaic", ModBlocks.SPRUCE_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> BIRCH_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("birch_planks_mosaic", ModBlocks.BIRCH_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> JUNGLE_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("jungle_planks_mosaic", ModBlocks.JUNGLE_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> ACACIA_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("acacia_planks_mosaic", ModBlocks.ACACIA_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> DARK_OAK_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("dark_oak_planks_mosaic", ModBlocks.DARK_OAK_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> MANGROVE_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("mangrove_planks_mosaic", ModBlocks.MANGROVE_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> CHERRY_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("cherry_planks_mosaic", ModBlocks.CHERRY_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> BAMBOO_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("bamboo_planks_mosaic", ModBlocks.BAMBOO_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> CRIMSON_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("crimson_planks_mosaic", ModBlocks.CRIMSON_PLANKS_MOSAIC);
    public static final DeferredItem<BlockItem> WARPED_PLANKS_MOSAIC = ITEMS.registerSimpleBlockItem("warped_planks_mosaic", ModBlocks.WARPED_PLANKS_MOSAIC);

    public static final DeferredItem<BlockItem> OAK_COUNTER = ITEMS.registerSimpleBlockItem("oak_counter", ModBlocks.OAK_COUNTER);
    public static final DeferredItem<BlockItem> OAK_DRAWER = ITEMS.registerSimpleBlockItem("oak_drawer", ModBlocks.OAK_DRAWER);
    public static final DeferredItem<BlockItem> OAK_CABINET = ITEMS.registerSimpleBlockItem("oak_cabinet", ModBlocks.OAK_CABINET);
    public static final DeferredItem<BlockItem> SPRUCE_COUNTER = ITEMS.registerSimpleBlockItem("spruce_counter", ModBlocks.SPRUCE_COUNTER);
    public static final DeferredItem<BlockItem> SPRUCE_DRAWER = ITEMS.registerSimpleBlockItem("spruce_drawer", ModBlocks.SPRUCE_DRAWER);
    public static final DeferredItem<BlockItem> SPRUCE_CABINET = ITEMS.registerSimpleBlockItem("spruce_cabinet", ModBlocks.SPRUCE_CABINET);
    public static final DeferredItem<BlockItem> BIRCH_COUNTER = ITEMS.registerSimpleBlockItem("birch_counter", ModBlocks.BIRCH_COUNTER);
    public static final DeferredItem<BlockItem> BIRCH_DRAWER = ITEMS.registerSimpleBlockItem("birch_drawer", ModBlocks.BIRCH_DRAWER);
    public static final DeferredItem<BlockItem> BIRCH_CABINET = ITEMS.registerSimpleBlockItem("birch_cabinet", ModBlocks.BIRCH_CABINET);
    public static final DeferredItem<BlockItem> JUNGLE_COUNTER = ITEMS.registerSimpleBlockItem("jungle_counter", ModBlocks.JUNGLE_COUNTER);
    public static final DeferredItem<BlockItem> JUNGLE_DRAWER = ITEMS.registerSimpleBlockItem("jungle_drawer", ModBlocks.JUNGLE_DRAWER);
    public static final DeferredItem<BlockItem> ACACIA_COUNTER = ITEMS.registerSimpleBlockItem("acacia_counter", ModBlocks.ACACIA_COUNTER);
    public static final DeferredItem<BlockItem> ACACIA_DRAWER = ITEMS.registerSimpleBlockItem("acacia_drawer", ModBlocks.ACACIA_DRAWER);
    public static final DeferredItem<BlockItem> ACACIA_CABINET = ITEMS.registerSimpleBlockItem("acacia_cabinet", ModBlocks.ACACIA_CABINET);
    public static final DeferredItem<BlockItem> DARK_OAK_COUNTER = ITEMS.registerSimpleBlockItem("dark_oak_counter", ModBlocks.DARK_OAK_COUNTER);
    public static final DeferredItem<BlockItem> DARK_OAK_DRAWER = ITEMS.registerSimpleBlockItem("dark_oak_drawer", ModBlocks.DARK_OAK_DRAWER);
    public static final DeferredItem<BlockItem> DARK_OAK_CABINET = ITEMS.registerSimpleBlockItem("dark_oak_cabinet", ModBlocks.DARK_OAK_CABINET);
    public static final DeferredItem<BlockItem> JUNGLE_CABINET = ITEMS.registerSimpleBlockItem("jungle_cabinet", ModBlocks.JUNGLE_CABINET);
    public static final DeferredItem<BlockItem> MANGROVE_COUNTER = ITEMS.registerSimpleBlockItem("mangrove_counter", ModBlocks.MANGROVE_COUNTER);
    public static final DeferredItem<BlockItem> MANGROVE_DRAWER = ITEMS.registerSimpleBlockItem("mangrove_drawer", ModBlocks.MANGROVE_DRAWER);
    public static final DeferredItem<BlockItem> MANGROVE_CABINET = ITEMS.registerSimpleBlockItem("mangrove_cabinet", ModBlocks.MANGROVE_CABINET);
    public static final DeferredItem<BlockItem> CHERRY_COUNTER = ITEMS.registerSimpleBlockItem("cherry_counter", ModBlocks.CHERRY_COUNTER);
    public static final DeferredItem<BlockItem> CHERRY_DRAWER = ITEMS.registerSimpleBlockItem("cherry_drawer", ModBlocks.CHERRY_DRAWER);
    public static final DeferredItem<BlockItem> CHERRY_CABINET = ITEMS.registerSimpleBlockItem("cherry_cabinet", ModBlocks.CHERRY_CABINET);
    public static final DeferredItem<BlockItem> BAMBOO_COUNTER = ITEMS.registerSimpleBlockItem("bamboo_counter", ModBlocks.BAMBOO_COUNTER);
    public static final DeferredItem<BlockItem> BAMBOO_DRAWER = ITEMS.registerSimpleBlockItem("bamboo_drawer", ModBlocks.BAMBOO_DRAWER);
    public static final DeferredItem<BlockItem> BAMBOO_CABINET = ITEMS.registerSimpleBlockItem("bamboo_cabinet", ModBlocks.BAMBOO_CABINET);
    public static final DeferredItem<BlockItem> CRIMSON_COUNTER = ITEMS.registerSimpleBlockItem("crimson_counter", ModBlocks.CRIMSON_COUNTER);
    public static final DeferredItem<BlockItem> CRIMSON_DRAWER = ITEMS.registerSimpleBlockItem("crimson_drawer", ModBlocks.CRIMSON_DRAWER);
    public static final DeferredItem<BlockItem> CRIMSON_CABINET = ITEMS.registerSimpleBlockItem("crimson_cabinet", ModBlocks.CRIMSON_CABINET);
    public static final DeferredItem<BlockItem> WARPED_COUNTER = ITEMS.registerSimpleBlockItem("warped_counter", ModBlocks.WARPED_COUNTER);
    public static final DeferredItem<BlockItem> WARPED_DRAWER = ITEMS.registerSimpleBlockItem("warped_drawer", ModBlocks.WARPED_DRAWER);
    public static final DeferredItem<BlockItem> WARPED_CABINET = ITEMS.registerSimpleBlockItem("warped_cabinet", ModBlocks.WARPED_CABINET);
}