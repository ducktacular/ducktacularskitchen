package com.ducktacular.ducktacularskitchen.main;

import com.ducktacular.ducktacularskitchen.block.ModBlocks;
import com.ducktacular.ducktacularskitchen.item.ModItems;
import com.ducktacular.ducktacularskitchen.ui.ModTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(DucktacularsKitchen.MODID)
public class DucktacularsKitchen
{
    public static final String MODID = "ducktacularskitchen";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DucktacularsKitchen(IEventBus modEventBus)
    {
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTabs.CREATIVE_TABS.register(modEventBus);
    }
}