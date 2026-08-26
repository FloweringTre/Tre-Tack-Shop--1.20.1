package com.kyraltre.tretackshop;

import com.kyraltre.tretackshop.item.AwardShopCreativeModTab;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.*;
//import com.kyraltre.tretackshop.compat.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TreTackShop.MOD_ID)
public class TreTackShop {
    public static final String MOD_ID = "tretackshop";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation resloc(String name) {
        return new ResourceLocation("tretackshop", name);
    }

    public static ResourceLocation swresloc(String name) {
        return new ResourceLocation("swem", name);
    }

    public TreTackShop() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TackShopCreativeModTab.init(modEventBus);
        AwardShopCreativeModTab.init(modEventBus);

        TackShopBlockRegistry.init(modEventBus);
        TackShopItems.init(modEventBus);
        AwardShopBlockRegistry.init(modEventBus);
        AwardShopItems.init(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

//        if (ModList.get().isLoaded("ssedeco")) {
//            SSECCompat.init(modEventBus);
//        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Tre says plant a tree <3");
        LOGGER.info(24 + " Award Sets Loaded.");
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
            event.enqueueWork(() -> {
                TackShopBlockRegistry.WEB_GUARD_CARES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                TackShopBlockRegistry.WEB_GUARD_HORSES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                TackShopBlockRegistry.WEB_GUARD_RIDERS.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                TackShopBlockRegistry.PASTURE_GATE_CARES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                TackShopBlockRegistry.PASTURE_GATE_HORSES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );
                AwardShopBlockRegistry.AWARD_WEB_GUARD_CARES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                AwardShopBlockRegistry.AWARD_WEB_GUARD_HORSES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                AwardShopBlockRegistry.AWARD_WEB_GUARD_RIDERS.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                AwardShopBlockRegistry.AWARD_PASTURE_GATE_CARES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );

                AwardShopBlockRegistry.AWARD_PASTURE_GATE_HORSES.forEach(
                        block -> ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout())
                );
            });
        }
    }

}