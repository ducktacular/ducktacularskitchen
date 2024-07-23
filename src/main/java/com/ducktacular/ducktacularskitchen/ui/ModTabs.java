package com.ducktacular.ducktacularskitchen.ui;

import com.ducktacular.ducktacularskitchen.block.ModBlocks;
import com.ducktacular.ducktacularskitchen.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.ducktacular.ducktacularskitchen.main.DucktacularsKitchen.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DUCKTACULARS_KITCHEN =
            CREATIVE_TABS.register("kitchenitems", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.ducktacularskitchen"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.OAK_DRAWER.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ORANGE.get());

                        output.accept(ModBlocks.BLENDER.get());

                        output.accept(ModBlocks.OAK_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.OAK_TILE.get());
                        output.accept(ModBlocks.OAK_COUNTER.get());
                        output.accept(ModBlocks.OAK_DRAWER.get());
                        output.accept(ModBlocks.OAK_CABINET.get());

                        output.accept(ModBlocks.SPRUCE_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.SPRUCE_TILE.get());
                        output.accept(ModBlocks.SPRUCE_COUNTER.get());
                        output.accept(ModBlocks.SPRUCE_DRAWER.get());
                        output.accept(ModBlocks.SPRUCE_CABINET.get());

                        output.accept(ModBlocks.BIRCH_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.BIRCH_COUNTER.get());
                        output.accept(ModBlocks.BIRCH_DRAWER.get());
                        output.accept(ModBlocks.BIRCH_CABINET.get());

                        output.accept(ModBlocks.JUNGLE_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.JUNGLE_COUNTER.get());
                        output.accept(ModBlocks.JUNGLE_DRAWER.get());
                        output.accept(ModBlocks.JUNGLE_CABINET.get());

                        output.accept(ModBlocks.ACACIA_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.ACACIA_COUNTER.get());
                        output.accept(ModBlocks.ACACIA_DRAWER.get());
                        output.accept(ModBlocks.ACACIA_CABINET.get());

                        output.accept(ModBlocks.DARK_OAK_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.DARK_OAK_COUNTER.get());
                        output.accept(ModBlocks.DARK_OAK_DRAWER.get());
                        output.accept(ModBlocks.DARK_OAK_CABINET.get());

                        output.accept(ModBlocks.MANGROVE_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.MANGROVE_COUNTER.get());
                        output.accept(ModBlocks.MANGROVE_DRAWER.get());
                        output.accept(ModBlocks.MANGROVE_CABINET.get());

                        output.accept(ModBlocks.CHERRY_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.CHERRY_COUNTER.get());
                        output.accept(ModBlocks.CHERRY_DRAWER.get());
                        output.accept(ModBlocks.CHERRY_CABINET.get());

                        output.accept(ModBlocks.BAMBOO_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.BAMBOO_COUNTER.get());
                        output.accept(ModBlocks.BAMBOO_DRAWER.get());
                        output.accept(ModBlocks.BAMBOO_CABINET.get());

                        output.accept(ModBlocks.CRIMSON_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.CRIMSON_COUNTER.get());
                        output.accept(ModBlocks.CRIMSON_DRAWER.get());
                        output.accept(ModBlocks.CRIMSON_CABINET.get());

                        output.accept(ModBlocks.WARPED_PLANKS_MOSAIC.get());
                        output.accept(ModBlocks.WARPED_COUNTER.get());
                        output.accept(ModBlocks.WARPED_DRAWER.get());
                        output.accept(ModBlocks.WARPED_CABINET.get());
                    }).build());
}
