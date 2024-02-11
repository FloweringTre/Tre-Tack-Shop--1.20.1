package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> REGISTRY;

    // THIS IS FOR TACK ITEMS THAT __CAN__ BE CRAFTED
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;
    public static final List<RegistryObject<Item>> FLAGS;
    public static final List<RegistryObject<Item>> FLAGS_BUTTERFLY;
    public static final List<RegistryObject<Item>> FLAGS_DYED;

    // TACK ITEMS

    // DYED TACK
    //public static final RegistryObject<DyedPastureBlanket> PASTURE_BLANKET_DYED;

    //ONE OFF TACK
    public static final RegistryObject<AdventureBridleItem> PELHAM_BRIDLE_BLACK;
    public static final RegistryObject<AdventureBridleItem> PELHAM_BRIDLE_BROWN;
    public static final RegistryObject<AdventureBridleItem> DOUBLE_BRIDLE;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE;
    public static final RegistryObject<WesternSaddleItem> BAREBACK_SADDLE;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET;
    public static final RegistryObject<WesternGirthStrapItem> BAREBACK_GIRTH_STRAP;
    public static final RegistryObject<WesternSaddleItem> DRESSAGE_SADDLE;
    public static final RegistryObject<WesternBlanketItem> DRESSAGE_BLANKET;
    public static final RegistryObject<EnglishSaddleItem> RACING_SADDLE_BROWN;
    public static final RegistryObject<EnglishSaddleItem> RACING_SADDLE_BLACK;

    // RAINBOW TACK
    public static final RegistryObject<HalterItem> HALTER_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_RAINBOW;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<LegWrapsItem> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<LegWrapsItem> WESTERN_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_RAINBOW;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_RAINBOW;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_BLACK_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_WHITE_RAINBOW;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_RAINBOW;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_RAINBOW;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_RAINBOW;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<SWEMHorseArmorItem> AMETHYST_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<SWEMHorseArmorItem> IRON_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_RAINBOW;

    // TRANSPARENT 'BAREBACK/LIBERTY' TACK
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_TRANS;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_TRANS;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_TRANS;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_TRANS;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_TRANS;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_TRANS;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_TRANS;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_TRANS;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_TRANS;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_TRANS;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_TRANS;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_TRANS;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_TRANS;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_TRANS;

    // CRAFTABLE NUMBERED TACK
    public static final List<RegistryObject<HalterItem>> HALTERS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<AdventureBlanketItem>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKETS;
    public static final List<RegistryObject<AdventureLegWraps>> ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<AdventureSaddleItem>> ADVENTURE_SADDLES;
    public static final List<RegistryObject<WesternSaddleItem>> WESTERN_SADDLES;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES;
    public static final List<RegistryObject<AdventureBreastCollarItem>> ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> CLOTH_BREAST_COLLARS;
    public static final List<RegistryObject<AdventureBreastCollarItem>> QUARTER_SHEETS_DYED;
    public static final List<RegistryObject<AdventureBreastCollarItem>> QUARTER_SHEETS_NUMBERED;
    public static final List<RegistryObject<AdventureBridleItem>> ADVENTURE_BRIDLES;
    public static final List<RegistryObject<WesternBridleItem>> WESTERN_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> CLOTH_BRIDLES;
    public static final List<RegistryObject<AdventureGirthStrapItem>> ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<WesternGirthStrapItem>> WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<EnglishGirthStrap>> CLOTH_GIRTH_STRAPS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS_DYED;
    public static final List<RegistryObject<SaddlebagItem>> SADDLE_BAGS;
    public static final List<RegistryObject<SWEMHorseArmorItem>> CLOTH_ARMOR;

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        BUTTERFLY = REGISTRY.register("butterfly",
                () -> new Item(new Item.Properties()));
        BUTTERFLY_MONARCH = REGISTRY.register("butterfly_monarch",
                () -> new Item(new Item.Properties()));

        RAINBOW_INA_BOTTLE = REGISTRY.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties()));
        // This is what we use to make the rainbow tack
        
// TACK ITEMS

        // Dyed Items

        // ONE OFF TACK
        PELHAM_BRIDLE_BLACK = REGISTRY.register("pelham_bridle_black",
                () -> new AdventureBridleItem("pelham_bridle_black", "pelham_bridle_black", (new Item.Properties())
                        .stacksTo(16)));
        PELHAM_BRIDLE_BROWN = REGISTRY.register("pelham_bridle_brown",
                () -> new AdventureBridleItem("pelham_bridle_brown", "pelham_bridle_brown", (new Item.Properties())
                        .stacksTo(16)));
        DOUBLE_BRIDLE = REGISTRY.register("double_bridle",
                () -> new AdventureBridleItem("double_bridle", "double_bridle", (new Item.Properties())
                        .stacksTo(16)));
        BITLESS_BRIDLE = REGISTRY.register("english_bridle_bitless",
                () -> new EnglishBridleItem("english_bridle_bitless", (new Item.Properties())
                        .stacksTo(16)));
        BAREBACK_SADDLE = REGISTRY.register("bareback_saddle",
                () -> new WesternSaddleItem("bareback_saddle", (new Item.Properties())
                        .stacksTo(1)));
        BAREBACK_BLANKET = REGISTRY.register("bareback_blanket",
                () -> new WesternBlanketItem("bareback_blanket", (new Item.Properties())
                        .stacksTo(16)));
        BAREBACK_GIRTH_STRAP = REGISTRY.register("bareback_girth_strap",
                () -> new WesternGirthStrapItem("bareback_girth_strap", (new Item.Properties())
                        .stacksTo(16)));

        DRESSAGE_SADDLE = REGISTRY.register("dressage_saddle",
                () -> new WesternSaddleItem("dressage_saddle", (new Item.Properties())
                        .stacksTo(1)));
        DRESSAGE_BLANKET = REGISTRY.register("dressage_blanket",
                () -> new WesternBlanketItem("dressage_blanket", (new Item.Properties())
                        .stacksTo(16)));
        RACING_SADDLE_BROWN = REGISTRY.register("racing_saddle_brown",
                () -> new EnglishSaddleItem("racing_saddle_brown", (new Item.Properties())
                        .stacksTo(1)));
        RACING_SADDLE_BLACK = REGISTRY.register("racing_saddle_black",
                () -> new EnglishSaddleItem("racing_saddle_black", (new Item.Properties())
                        .stacksTo(1)));


        // Rainbow Tack
        HALTER_RAINBOW =  REGISTRY.register("halter_rainbow",
                () -> new HalterItem("halter_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        ADVENTURE_SADDLE_RAINBOW =  REGISTRY.register("adventure_saddle_rainbow",
                () -> new AdventureSaddleItem("adventure_saddle_rainbow", (new Item.Properties())
                         .stacksTo(1)));
        ADVENTURE_BLANKET_RAINBOW =  REGISTRY.register("adventure_blanket_rainbow",
                () -> new AdventureBlanketItem("adventure_blanket_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_RAINBOW =  REGISTRY.register("adventure_breast_collar_rainbow",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        ADVENTURE_LEG_WRAPS_RAINBOW =  REGISTRY.register("adventure_leg_wraps_rainbow",
                () -> new AdventureLegWraps("adventure_leg_wraps_rainbow", (new Item.Properties())
                         .stacksTo(64)));
        ADVENTURE_BRIDLE_RAINBOW = REGISTRY.register("adventure_bridle_rainbow",
                () -> new AdventureBridleItem("adventure_bridle_rainbow", "adventure_bridle_rainbow", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = REGISTRY.register("adventure_girth_strap_rainbow",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_rainbow", (new Item.Properties())
                        .stacksTo(16)));
        SADDLE_BAG_RAINBOW = REGISTRY.register("saddle_bag_rainbow", () ->
                new SaddlebagItem("saddle_bag_rainbow", (new Item.Properties()).stacksTo(16)));
        AMETHYST_HORSE_ARMOR_RAINBOW = REGISTRY.register("amethyst_horse_armor_rainbow", () ->
                new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.AMETHYST, 50,
                        "amethyst_rainbow", (new Item.Properties()).stacksTo(1)));
        IRON_HORSE_ARMOR_RAINBOW = REGISTRY.register("iron_horse_armor_rainbow", () ->
                new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.IRON, 30,
                        "iron_rainbow", (new Item.Properties()).stacksTo(1)));

        WESTERN_SADDLE_RAINBOW =  REGISTRY.register("western_saddle_rainbow",
                () -> new WesternSaddleItem("western_saddle_rainbow", (new Item.Properties())
                         .stacksTo(1)));
        WESTERN_BLANKET_RAINBOW =  REGISTRY.register("western_blanket_rainbow",
                () -> new WesternBlanketItem("western_blanket_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        WESTERN_BREAST_COLLAR_RAINBOW =  REGISTRY.register("western_breast_collar_rainbow",
                () -> new WesternBreastCollarItem("western_breast_collar_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        WESTERN_LEG_WRAPS_RAINBOW =  REGISTRY.register("western_leg_wraps_rainbow",
                () ->  new WesternLegWraps("western_leg_wraps_rainbow", (new Item.Properties())
                         .stacksTo(64)));
        WESTERN_BRIDLE_RAINBOW = REGISTRY.register("western_bridle_rainbow",
                () -> new WesternBridleItem("western_bridle_rainbow", (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_GIRTH_STRAP_RAINBOW = REGISTRY.register("western_girth_strap_rainbow",
                () -> new WesternGirthStrapItem("western_girth_strap_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        ENGLISH_SADDLE_RAINBOW =  REGISTRY.register("english_saddle_rainbow",
                () -> new EnglishSaddleItem("english_saddle_rainbow", (new Item.Properties())
                         .stacksTo(1)));
        ENGLISH_BLANKET_RAINBOW =  REGISTRY.register("english_blanket_rainbow",
                () -> new EnglishBlanketItem("english_blanket_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        ENGLISH_BREAST_COLLAR_RAINBOW =  REGISTRY.register("english_breast_collar_rainbow",
                () -> new EnglishBreastCollar("english_breast_collar_rainbow", (new Item.Properties())
                         .stacksTo(16)));
        ENGLISH_LEG_WRAPS_RAINBOW =  REGISTRY.register("english_leg_wraps_rainbow",
                () -> new EnglishLegWraps("english_leg_wraps_rainbow", (new Item.Properties())
                         .stacksTo(64)));
        ENGLISH_BRIDLE_RAINBOW = REGISTRY.register("english_bridle_rainbow",
                () -> new EnglishBridleItem("english_bridle_rainbow", (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_GIRTH_STRAP_RAINBOW = REGISTRY.register("english_girth_strap_rainbow",
                () -> new EnglishGirthStrap("english_girth_strap_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        PASTURE_BLANKET_RAINBOW =  REGISTRY.register("pasture_blanket_rainbow",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_rainbow", new Item.Properties()
                         .stacksTo(16)));
        PASTURE_BLANKET_RAINBOW_ARMORED =  REGISTRY.register("pasture_blanket_rainbow_armored",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored", (new Item.Properties())
                         .stacksTo(16)));
        QUARTER_SHEET_BLACK_RAINBOW = REGISTRY.register("quarter_sheet_black_rainbow",
                () -> new AdventureBreastCollarItem("quarter_sheet_black_rainbow", (new Item.Properties())
                        .stacksTo(16)));
        QUARTER_SHEET_WHITE_RAINBOW = REGISTRY.register("quarter_sheet_white_rainbow",
                () -> new AdventureBreastCollarItem("quarter_sheet_white_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        // TRANSPARENT 'BAREBACK/LIBERTY' TACK
        ADVENTURE_SADDLE_TRANS = REGISTRY.register("adventure_saddle_trans",
                () -> new AdventureSaddleItem("adventure_saddle_trans", (new Item.Properties())
                        .stacksTo(1)));
        ADVENTURE_BLANKET_TRANS = REGISTRY.register("adventure_blanket_trans",
                () -> new AdventureBlanketItem("adventure_blanket_trans", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_TRANS = REGISTRY.register("adventure_breast_collar_trans",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_trans", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_LEG_WRAPS_TRANS = REGISTRY.register("adventure_leg_wraps_trans",
                () -> new AdventureLegWraps("adventure_leg_wraps_trans", (new Item.Properties())
                        .stacksTo(64)));
        ADVENTURE_BRIDLE_TRANS = REGISTRY.register("adventure_bridle_trans",
                () -> new AdventureBridleItem("adventure_bridle_trans", "adventure_trans", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_TRANS = REGISTRY.register("adventure_girth_strap_trans",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_trans", (new Item.Properties())
                        .stacksTo(16)));

        WESTERN_SADDLE_TRANS = REGISTRY.register("western_saddle_trans",
                () -> new WesternSaddleItem("western_saddle_trans", (new Item.Properties())
                        .stacksTo(1)));
        WESTERN_BLANKET_TRANS = REGISTRY.register("western_blanket_trans",
                () -> new WesternBlanketItem("western_blanket_trans", (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_BRIDLE_TRANS = REGISTRY.register("western_bridle_trans",
                () -> new WesternBridleItem("western_bridle_trans", (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_GIRTH_STRAP_TRANS = REGISTRY.register("western_girth_strap_trans",
                () -> new WesternGirthStrapItem("western_girth_strap_trans", (new Item.Properties())
                        .stacksTo(16)));

        ENGLISH_SADDLE_TRANS = REGISTRY.register("english_saddle_trans",
                () -> new EnglishSaddleItem("english_saddle_trans", (new Item.Properties())
                        .stacksTo(1)));
        ENGLISH_BLANKET_TRANS = REGISTRY.register("english_blanket_trans",
                () -> new EnglishBlanketItem("english_blanket_trans", (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_BRIDLE_TRANS = REGISTRY.register("english_bridle_trans",
                () -> new EnglishBridleItem("english_bridle_trans", (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_GIRTH_STRAP_TRANS = REGISTRY.register("english_girth_strap_trans",
                () -> new EnglishGirthStrap("english_girth_strap_trans", (new Item.Properties())
                        .stacksTo(16)));

        // Craftable Numbered Tack Items -- 12 Count Items
        PASTURE_BLANKETS = new ArrayList<>();
        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        HALTERS = new ArrayList<>();
        FLYMASKS = new ArrayList<>();
        ADVENTURE_BLANKETS = new ArrayList<>();
        WESTERN_BLANKETS = new ArrayList<>();
        ENGLISH_BLANKETS = new ArrayList<>();
        ENGLISH_LEG_WRAPS = new ArrayList<>();
        WESTERN_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_SADDLES = new ArrayList<>();
        WESTERN_SADDLES = new ArrayList<>();
        ENGLISH_SADDLES = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        WESTERN_BREAST_COLLARS = new ArrayList<>();
        ENGLISH_BREAST_COLLARS = new ArrayList<>();
        CLOTH_BREAST_COLLARS = new ArrayList<>();
        ADVENTURE_BRIDLES = new ArrayList<>();
        WESTERN_BRIDLES = new ArrayList<>();
        ENGLISH_BRIDLES = new ArrayList<>();
        CLOTH_BRIDLES = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        WESTERN_GIRTH_STRAPS = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        CLOTH_GIRTH_STRAPS = new ArrayList<>();
        QUARTER_SHEETS_NUMBERED = new ArrayList<>();
        FLAGS = new ArrayList<>();
        FLAGS_BUTTERFLY = new ArrayList<>();
        SADDLE_BAGS = new ArrayList<>();
        CLOTH_ARMOR = new ArrayList<>();

        int var1 = 15;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
            HALTERS.add( REGISTRY.register("halter_" + counter, () ->
                    new HalterItem("halter_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            FLYMASKS.add( REGISTRY.register("flymask_" + counter, () ->
                    new HalterItem("flymask_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));

            ADVENTURE_SADDLES.add( REGISTRY.register("adventure_saddle_" + counter, () ->
                    new AdventureSaddleItem("adventure_saddle_" + counter, (new Item.Properties())
                             .stacksTo(1))
            ));
            ADVENTURE_BLANKETS.add( REGISTRY.register("adventure_blanket_" + counter, () ->
                    new AdventureBlanketItem("adventure_blanket_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            ADVENTURE_BREAST_COLLARS.add( REGISTRY.register("adventure_breast_collar_" + counter, () ->
                    new AdventureBreastCollarItem("adventure_breast_collar_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            ADVENTURE_LEG_WRAPS.add( REGISTRY.register("adventure_leg_wraps_" + counter, () ->
                    new AdventureLegWraps("adventure_leg_wraps_" + counter, (new Item.Properties())
                             .stacksTo(64))
            ));
            ADVENTURE_BRIDLES.add(REGISTRY.register("adventure_bridle_" + counter,
                    () -> new AdventureBridleItem("adventure_bridle_" + counter, "adventure_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            ADVENTURE_GIRTH_STRAPS.add(REGISTRY.register("adventure_girth_strap_" + counter,
                    () -> new AdventureGirthStrapItem("adventure_girth_strap_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            CLOTH_ARMOR.add(REGISTRY.register("cloth_horse_armor_" + counter,
                    () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            SADDLE_BAGS.add(REGISTRY.register("saddle_bag_" + counter, () ->
                    new SaddlebagItem("saddle_bag_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));

            WESTERN_SADDLES.add( REGISTRY.register("western_saddle_" + counter, () ->
                    new WesternSaddleItem("western_saddle_" + counter, (new Item.Properties())
                             .stacksTo(1))
            ));
            WESTERN_BLANKETS.add( REGISTRY.register("western_blanket_" + counter, () ->
                    new WesternBlanketItem("western_blanket_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            WESTERN_BREAST_COLLARS.add( REGISTRY.register("western_breast_collar_" + counter, () ->
                    new WesternBreastCollarItem("western_breast_collar_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            WESTERN_LEG_WRAPS.add( REGISTRY.register("western_leg_wraps_" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_" + counter, (new Item.Properties())
                             .stacksTo(64))
            ));
            WESTERN_BRIDLES.add(REGISTRY.register("western_bridle_" + counter,
                    () -> new WesternBridleItem("western_bridle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            WESTERN_GIRTH_STRAPS.add(REGISTRY.register("western_girth_strap_" + counter,
                    () -> new WesternGirthStrapItem("western_girth_strap_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));

            ENGLISH_SADDLES.add( REGISTRY.register("english_saddle_" + counter, () ->
                    new EnglishSaddleItem("english_saddle_" + counter, (new Item.Properties())
                             .stacksTo(1))
            ));
            ENGLISH_BLANKETS.add( REGISTRY.register("english_blanket_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            ENGLISH_BREAST_COLLARS.add( REGISTRY.register("english_breast_collar_" + counter, () ->
                    new EnglishBreastCollar("english_breast_collar_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            ENGLISH_LEG_WRAPS.add( REGISTRY.register("english_leg_wraps_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_" + counter, (new Item.Properties())
                             .stacksTo(64))
            ));
            ENGLISH_BRIDLES.add(REGISTRY.register("english_bridle_" + counter,
                    () -> new EnglishBridleItem("english_bridle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            ENGLISH_GIRTH_STRAPS.add(REGISTRY.register("english_girth_strap_" + counter,
                    () -> new EnglishGirthStrap("english_girth_strap_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));

            CLOTH_BREAST_COLLARS.add(REGISTRY.register("cloth_breast_collar_" + counter, () ->
                    new EnglishBreastCollar("cloth_breast_collar_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            CLOTH_BRIDLES.add(REGISTRY.register("cloth_bridle_" + counter,
                    () -> new EnglishBridleItem("cloth_bridle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            CLOTH_GIRTH_STRAPS.add(REGISTRY.register("cloth_girth_strap_" + counter,
                    () -> new EnglishGirthStrap("cloth_girth_strap_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));

            PASTURE_BLANKETS.add( REGISTRY.register("pasture_blanket_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            PASTURE_BLANKETS_ARMORED.add( REGISTRY.register("pasture_blanket_" + counter + "_armored", () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                            "pasture_blanket_" + counter + "_armored", (new Item.Properties())
                             .stacksTo(16))
            ));
            QUARTER_SHEETS_NUMBERED.add(REGISTRY.register("quarter_sheet_" + counter, () ->
                    new AdventureBreastCollarItem("quarter_sheet_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            FLAGS.add(REGISTRY.register("flag_" + counter, () ->
                    new Item((new Item.Properties()))));
            FLAGS_BUTTERFLY.add(REGISTRY.register("flag_butterfly_" + counter, () ->
                    new Item((new Item.Properties()))));

            ++rContext.var2;
        }
        
        //DYED TACK ITEMS - Craftable still :3
        QUARTER_SHEETS_DYED = new ArrayList<>();
        FLYMASKS_DYED = new ArrayList<>();
        FLAGS_DYED = new ArrayList<>();

        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for (int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
            QUARTER_SHEETS_DYED.add(REGISTRY.register("quarter_sheet_" + color.getName(), () ->
                    new AdventureBreastCollarItem("quarter_sheet_" + color.getName(), (new Item.Properties())
                            .stacksTo(16))
            ));
            FLYMASKS.add( REGISTRY.register("flymask_" + color.getName(), () ->
                    new HalterItem("flymask_" + color.getName(), (new Item.Properties())
                            .stacksTo(16))
            ));
            FLAGS_DYED.add(REGISTRY.register("flag_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
        }
    }
}
