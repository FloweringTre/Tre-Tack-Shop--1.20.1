package com.kyraltre.tretackshop;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
//@Mod.EventBusSubscriber(modid = TreTackShop.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class Config {
//    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
//
//    public static final ForgeConfigSpec.IntValue AWARD_ADVENTURE_TACK_SETS = BUILDER
//            .comment(new String[]{"TRE'S TACK SHOP AWARD TACK SET CONFIGURATION",
//                    "This is for setting how many award tack sets are loaded in to be used. This must be the same for both client and server to properly display the tack items.",
//                    "\nThe max value all sets is 48. The default is 14 (the original value loaded).",
//                    "Tack sets include the saddle, bridle, saddle pad/blanket, breast collar, leg wraps, and girth straps.",
//                    "\n~~~~ADVENTURE TACK~~~~"})
//            .defineInRange("adventureTackSetsLoaded", 14, 0, 48);
//
//    public static final ForgeConfigSpec.IntValue AWARD_ARMOR_EXTRAS_TACK_SETS = BUILDER
//            .comment(new String[]{"\n~~~~CLOTH ARMOR & SADDLE BAGS~~~~~", "Separated from the Adventure Tack loading for tailored loaded"})
//            .defineInRange("armorNSaddlebagsTackSetsLoaded", 14, 1, 48);
//
//    public static final ForgeConfigSpec.IntValue AWARD_WESTERN_TACK_SETS = BUILDER
//            .comment(new String[]{"\n~~~~WESTERN TACK~~~~~"})
//            .defineInRange("westernTackSetsLoaded", 14, 0, 48);
//
//    public static final ForgeConfigSpec.IntValue AWARD_ENGLISH_TACK_SETS = BUILDER
//            .comment(new String[]{"\n~~~~ENGLISH TACK~~~~~"})
//            .defineInRange("englishTackSetsLoaded", 14, 0, 48);
//
//    public static final ForgeConfigSpec.IntValue AWARD_PADDOCK_TACK_SETS = BUILDER
//            .comment(new String[]{"\n~~~~PADDOCK TACK~~~~~",
//                    "These sets include the fly mask, halter, quarter sheets, and both normal and armored pasture blankets"})
//            .defineInRange("paddockTackSetsLoaded", 14, 0, 48);

//    private static final ForgeConfigSpec.IntValue MAGIC_NUMBER = BUILDER
//            .comment("A magic number")
//            .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);
//
//    public static final ForgeConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION = BUILDER
//            .comment("What you want the introduction message to be for the magic number")
//            .define("magicNumberIntroduction", "The magic number is... ");
//
//    // a list of strings that are treated as resource locations for items
//    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
//            .comment("A list of items to log on common setup.")
//            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

//    static final ForgeConfigSpec SPEC = BUILDER.build();
//
//    public static int adventureTackSetsLoaded;
//    public static int armorNSaddlebagsTackSetsLoaded;
//    public static int westernTackSetsLoaded;
//    public static int englishTackSetsLoaded;
//    public static int paddockTackSetsLoaded;
//    public static int magicNumber;
//    public static String magicNumberIntroduction;
//    public static Set<Item> items;

//    private static boolean validateItemName(final Object obj)
//    {
//        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
//    }

//    @SubscribeEvent
//    static void onLoad(final ModConfigEvent event) {
//        adventureTackSetsLoaded = AWARD_ADVENTURE_TACK_SETS.get();
//        armorNSaddlebagsTackSetsLoaded = AWARD_ARMOR_EXTRAS_TACK_SETS.get();
//        westernTackSetsLoaded = AWARD_WESTERN_TACK_SETS.get();
//        englishTackSetsLoaded = AWARD_ENGLISH_TACK_SETS.get();
//        paddockTackSetsLoaded = AWARD_PADDOCK_TACK_SETS.get();

//        magicNumber = MAGIC_NUMBER.get();
//        magicNumberIntroduction = MAGIC_NUMBER_INTRODUCTION.get();
//
//        // convert the list of strings into a set of items
//        items = ITEM_STRINGS.get().stream()
//                .map(itemName -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)))
//                .collect(Collectors.toSet());
//    }
//}