package com.kyraltre.tretackshop.config;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

//@Mod.EventBusSubscriber(modid = TreTackShop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TackShopCommonConfigs {
//    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
//    public static final ForgeConfigSpec SPEC;
//
//    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ADVENTURE_TACK_SETS;
//    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_WESTERN_TACK_SETS;
//    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ENGLISH_TACK_SETS;
//    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_PADDOCK_TACK_SETS;
//    public static final ForgeConfigSpec.ConfigValue<Integer> AWARD_ARMOR_EXTRAS_TACK_SETS;
//
//    static {
//        BUILDER.push("Award Tack Set Configs for Tre's Tack Shop");
//        AWARD_ADVENTURE_TACK_SETS = BUILDER.comment(new String[]{"This is for setting how many award tack sets are loaded in to be used. This must be the same for both client and server to properly display the tack items.",
//                        "\nThe max value all sets is 48. The default is 14 (the original value loaded).",
//                        "Tack sets include the saddle, bridle, saddle pad/blanket, breast collar, leg wraps, and girth straps.",
//                        "\n~~~~ADVENTURE TACK~~~~"})
//                .defineInRange("adventureTackSetsLoaded", 14, 0, 48);
//        AWARD_ARMOR_EXTRAS_TACK_SETS = BUILDER.comment(new String[]{"\n~~~~CLOTH ARMOR & SADDLE BAGS~~~~~", "Separated from the Adventure Tack loading for tailored loaded"})
//                .defineInRange("armorNSaddlebagsTackSetsLoaded", 14, 0, 48);
//        AWARD_WESTERN_TACK_SETS = BUILDER.comment(new String[]{"\n~~~~WESTERN TACK~~~~~"})
//                .defineInRange("westernTackSetsLoaded", 14, 0, 48);
//        AWARD_ENGLISH_TACK_SETS = BUILDER.comment(new String[]{"\n~~~~ENGLISH TACK~~~~~"})
//                .defineInRange("englishTackSetsLoaded", 14, 0, 48);
//        AWARD_PADDOCK_TACK_SETS = BUILDER.comment(new String[]{"\n~~~~PADDOCK TACK~~~~~",
//                        "These sets include the fly mask, halter, quarter sheets, and both normal and armored pasture blankets"})
//                .defineInRange("paddockTackSetsLoaded", 14, 0, 48);
//        BUILDER.pop();
//        SPEC = BUILDER.build();
//    }
//
//    public static int adventureTackSetsLoaded;
//    public static int armorNSaddlebagsTackSetsLoaded;
//    public static int westernTackSetsLoaded;
//    public static int englishTackSetsLoaded;
//    public static int paddockTackSetsLoaded;
//
//    @SubscribeEvent
//    static void Loading(final ModConfigEvent event) {
//        adventureTackSetsLoaded = AWARD_ADVENTURE_TACK_SETS.get();
//        armorNSaddlebagsTackSetsLoaded = AWARD_ARMOR_EXTRAS_TACK_SETS.get();
//        westernTackSetsLoaded = AWARD_WESTERN_TACK_SETS.get();
//        englishTackSetsLoaded = AWARD_ENGLISH_TACK_SETS.get();
//        paddockTackSetsLoaded = AWARD_PADDOCK_TACK_SETS.get();
//
//    }
}
