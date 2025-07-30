package com.kyraltre.peachtackshop;

import com.kyraltre.peachtackshop.block.TackShopBlocks;
import com.kyraltre.peachtackshop.item.BlockShopCreativeModTab;
import com.kyraltre.peachtackshop.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

///// FRAMEWORK REMINDERS:
//  Blocks need loot table files
//  everything gets an item model file
//  everything is in lowercase
//  if something is upset spagett... remember to check the spellings

///// NEW ITEM NEEDS
// Model item file
// registery addition
// lang file addition
// if it is a block it needs blockstate, block model, and LOOT TABLE files
// add textures [block and item!]
// optional: add tag addition


// The value here should match an entry in the META-INF/mods.toml file
@Mod(PeachTackShop.MOD_ID)
public class PeachTackShop {
    public static final String MOD_ID = "peachtackshop";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation resloc(String name) {
        return new ResourceLocation("tretackshop", name);
    }

    public static ResourceLocation swresloc(String name) {
        return new ResourceLocation("swem", name);
    }

    public PeachTackShop() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockShopCreativeModTab.init(modEventBus);

        TackShopBlocks.register(modEventBus);
        TackShopBlockRegistry.init(modEventBus);
        DecorShopItems.init(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Tre says be kind to all you meet.");
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}