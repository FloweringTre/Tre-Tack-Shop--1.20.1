package com.kyraltre.tretackshop.registry;

import com.kyraltre.tretackshop.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = TreTackShop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MissingMappingHandler {

    @SubscribeEvent
    public static void onMissingMappings(MissingMappingsEvent event) {

        for (MissingMappingsEvent.Mapping<Item> mapping :
                event.getMappings(Registries.ITEM, TreTackShop.MOD_ID)) {

            String path = mapping.getKey().getPath();

            switch (path) {
                case "english_saddle_1" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(0).get());
                case "english_saddle_2" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(1).get());
                case "english_saddle_3" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(2).get());
                case "english_saddle_4" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(3).get());
                case "english_saddle_5" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(4).get());
                case "english_saddle_6" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(5).get());
                case "english_saddle_7" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(6).get());
                case "english_saddle_8" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(7).get());
                case "english_saddle_9" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(8).get());
                case "english_saddle_10" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(9).get());
                case "english_saddle_11" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(10).get());
                case "english_saddle_12" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(11).get());
                case "english_saddle_13" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(12).get());
                case "english_saddle_14" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BLACK.get(13).get());
                case "english_saddle_other_1" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(0).get());
                case "english_saddle_other_2" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(1).get());
                case "english_saddle_other_3" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(2).get());
                case "english_saddle_other_4" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(3).get());
                case "english_saddle_other_5" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(4).get());
                case "english_saddle_other_6" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(5).get());
                case "english_saddle_other_7" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(6).get());
                case "english_saddle_other_8" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(7).get());
                case "english_saddle_other_9" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(8).get());
                case "english_saddle_other_10" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(9).get());
                case "english_saddle_other_11" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(10).get());
                case "english_saddle_other_12" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(11).get());
                case "english_saddle_other_13" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(12).get());
                case "english_saddle_other_14" ->
                        mapping.remap(TackShopItems.ENGLISH_SADDLES_BROWN.get(13).get());


                case "english_bridle_1" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(0).get());
                case "english_bridle_2" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(1).get());
                case "english_bridle_3" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(2).get());
                case "english_bridle_4" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(3).get());
                case "english_bridle_5" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(4).get());
                case "english_bridle_6" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(5).get());
                case "english_bridle_7" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(6).get());
                case "english_bridle_8" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(7).get());
                case "english_bridle_9" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(8).get());
                case "english_bridle_10" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(9).get());
                case "english_bridle_11" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(10).get());
                case "english_bridle_12" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(11).get());
                case "english_bridle_13" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(12).get());
                case "english_bridle_14" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BLACK.get(13).get());
                case "english_bridle_other_1" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(0).get());
                case "english_bridle_other_2" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(1).get());
                case "english_bridle_other_3" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(2).get());
                case "english_bridle_other_4" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(3).get());
                case "english_bridle_other_5" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(4).get());
                case "english_bridle_other_6" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(5).get());
                case "english_bridle_other_7" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(6).get());
                case "english_bridle_other_8" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(7).get());
                case "english_bridle_other_9" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(8).get());
                case "english_bridle_other_10" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(9).get());
                case "english_bridle_other_11" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(10).get());
                case "english_bridle_other_12" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(11).get());
                case "english_bridle_other_13" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(12).get());
                case "english_bridle_other_14" ->
                        mapping.remap(TackShopItems.ENGLISH_BRIDLES_BROWN.get(13).get());

                case "english_breast_collar_1" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(0).get());
                case "english_breast_collar_2" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(1).get());
                case "english_breast_collar_3" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(2).get());
                case "english_breast_collar_4" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(3).get());
                case "english_breast_collar_5" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(4).get());
                case "english_breast_collar_6" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(5).get());
                case "english_breast_collar_7" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(6).get());
                case "english_breast_collar_8" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(7).get());
                case "english_breast_collar_9" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(8).get());
                case "english_breast_collar_10" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(9).get());
                case "english_breast_collar_11" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(10).get());
                case "english_breast_collar_12" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(11).get());
                case "english_breast_collar_13" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(12).get());
                case "english_breast_collar_14" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BLACK.get(13).get());
                case "english_breast_collar_other_1" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(0).get());
                case "english_breast_collar_other_2" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(1).get());
                case "english_breast_collar_other_3" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(2).get());
                case "english_breast_collar_other_4" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(3).get());
                case "english_breast_collar_other_5" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(4).get());
                case "english_breast_collar_other_6" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(5).get());
                case "english_breast_collar_other_7" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(6).get());
                case "english_breast_collar_other_8" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(7).get());
                case "english_breast_collar_other_9" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(8).get());
                case "english_breast_collar_other_10" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(9).get());
                case "english_breast_collar_other_11" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(10).get());
                case "english_breast_collar_other_12" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(11).get());
                case "english_breast_collar_other_13" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(12).get());
                case "english_breast_collar_other_14" ->
                        mapping.remap(TackShopItems.ENGLISH_BREAST_COLLARS_BROWN.get(13).get());

                case "english_girth_strap_1" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(0).get());
                case "english_girth_strap_2" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(1).get());
                case "english_girth_strap_3" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(2).get());
                case "english_girth_strap_4" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(3).get());
                case "english_girth_strap_5" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(4).get());
                case "english_girth_strap_6" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(5).get());
                case "english_girth_strap_7" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(6).get());
                case "english_girth_strap_8" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(7).get());
                case "english_girth_strap_9" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(8).get());
                case "english_girth_strap_10" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(9).get());
                case "english_girth_strap_11" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(10).get());
                case "english_girth_strap_12" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(11).get());
                case "english_girth_strap_13" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(12).get());
                case "english_girth_strap_14" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BLACK.get(13).get());
                case "english_girth_strap_other_1" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(0).get());
                case "english_girth_strap_other_2" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(1).get());
                case "english_girth_strap_other_3" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(2).get());
                case "english_girth_strap_other_4" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(3).get());
                case "english_girth_strap_other_5" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(4).get());
                case "english_girth_strap_other_6" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(5).get());
                case "english_girth_strap_other_7" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(6).get());
                case "english_girth_strap_other_8" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(7).get());
                case "english_girth_strap_other_9" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(8).get());
                case "english_girth_strap_other_10" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(9).get());
                case "english_girth_strap_other_11" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(10).get());
                case "english_girth_strap_other_12" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(11).get());
                case "english_girth_strap_other_13" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(12).get());
                case "english_girth_strap_other_14" ->
                        mapping.remap(TackShopItems.ENGLISH_GIRTH_STRAPS_BROWN.get(13).get());

                case "western_saddle_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_SADDLE_TRANS.get());
                case "western_bridle_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_BRIDLE_TRANS.get());
                case "western_girth_strap_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_GIRTH_STRAP_TRANS.get());
                case "western_blanket_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_BLANKET_TRANS.get());
                case "english_saddle_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_SADDLE_TRANS.get());
                case "english_bridle_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_BRIDLE_TRANS.get());
                case "english_girth_strap_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_GIRTH_STRAP_TRANS.get());
                case "english_blanket_trans" ->
                        mapping.remap(TackShopItems.ADVENTURE_BLANKET_TRANS.get());

                case "e_g_g_trophy_thick_1" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THICK.get(0).get().asItem());
                case "e_g_g_trophy_thick_2" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THICK.get(1).get().asItem());
                case "e_g_g_trophy_thick_3" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THICK.get(12).get().asItem());
                case "e_g_g_trophy_thin_1" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THIN.get(2).get().asItem());
                case "e_g_g_trophy_thin_2" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THIN.get(3).get().asItem());
                case "e_g_g_trophy_thin_3" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_THIN.get(5).get().asItem());
                case "e_g_g_trophy_chev_1" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_CHEVRON.get(2).get().asItem());
                case "e_g_g_trophy_chev_2" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_CHEVRON.get(3).get().asItem());
                case "e_g_g_trophy_chev_3" ->
                        mapping.remap(TackShopBlockRegistry.EGG_TROPHY_CHEVRON.get(4).get().asItem());
            }
        }
    }
}