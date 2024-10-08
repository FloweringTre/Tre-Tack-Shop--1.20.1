package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.kyraltre.tretackshop.config.TackShopCommonConfigs;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib.core.object.Color;

import java.util.ArrayList;
import java.util.List;

import static com.kyraltre.tretackshop.config.TackShopCommonConfigs.*;


public class AwardShopItems {
    public static final DeferredRegister<Item> REGISTRY;

    static int [][] tretackcolors= { // A collection of RGB colors to reference for blanket racks
            { 236, 226, 226 }, // "tre and moon white" [0]
            //pastel tones [1] - [6]
            { 255, 202, 242 }, {255, 178, 177}, {255, 243, 173}, {188, 255, 188}, {162, 237, 255}, {201, 177, 255},
            // jewel tones [7] - [12]
            {143, 48, 116}, {136, 39, 50}, {221, 153, 52}, {43, 100, 93}, {19, 67, 133}, {72, 20, 58},
            // orange tones [13] - [14]
            {243, 162, 109}, {206, 114, 62},
            {34, 34, 34}, // "tre black" [15]
            {56, 29, 10}, // "tre coffee brown" [16]
            {189, 138, 89}, // "tre latte brown" [17]
            {254, 140, 3}, // "monarch yellow" [18]
            {16, 190, 234}, // "morpho blue" [19]
            {43, 39, 39}, // "moon black" [20]
            {67, 56, 50}, // "moon brown" [21]
            {166, 153, 145} // "moon beige" [22]
    };


// THIS IS FOR AWARD ITEMS THAT CAN NOT BE CRAFTED
    public static final List<RegistryObject<Item>> AWARD_FLAGS;
    public static final RegistryObject<Item> FLAG_MONARCH;
    public static final RegistryObject<Item> FLAG_MORPHO;

    // BUTTERFLY TACK ITEMS - MORPHO
    public static final RegistryObject<HalterItem> HALTER_MORPHO;
    public static final RegistryObject<HalterItem> FLYMASK_MORPHO;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_MORPHO;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_MORPHO;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_MORPHO;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_MORPHO;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_MORPHO;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_MORPHO;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> QUARTER_SHEET_MORPHO;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_MORPHO;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_MORPHO;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<SWEMHorseArmorItem> CLOTH_HORSE_ARMOR_MORPHO;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MORPHO;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_MORPHO;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_MORPHO;
    

    // BUTTERFLY TACK ITEMS - MONARCH
    public static final RegistryObject<HalterItem> HALTER_MONARCH;
    public static final RegistryObject<HalterItem> FLYMASK_MONARCH;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_MONARCH;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_MONARCH;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_MONARCH;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_MONARCH;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_MONARCH;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_MONARCH;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> QUARTER_SHEET_MONARCH;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_MONARCH;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_MONARCH;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<SWEMHorseArmorItem> CLOTH_HORSE_ARMOR_MONARCH;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MONARCH;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_MONARCH;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_MONARCH;

    // TACK ITEMS
    public static final List<RegistryObject<HalterItem>> AWARD_HALTERS;
    public static final List<RegistryObject<HalterItem>> AWARD_FLYMASKS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<AdventureBlanketItem>> AWARD_ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> AWARD_ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> AWARD_WESTERN_BLANKETS;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<AdventureSaddleItem>> AWARD_ADVENTURE_SADDLES;
    public static final List<RegistryObject<WesternSaddleItem>> AWARD_WESTERN_SADDLES;
    public static final List<RegistryObject<EnglishSaddleItem>> AWARD_ENGLISH_SADDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_QUARTER_SHEETS;
    public static final List<RegistryObject<AdventureBridleItem>> AWARD_ADVENTURE_BRIDLES;
    public static final List<RegistryObject<WesternBridleItem>> AWARD_WESTERN_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> AWARD_ENGLISH_BRIDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<SaddlebagItem>> AWARD_SADDLE_BAGS;
    public static final List<RegistryObject<SWEMHorseArmorItem>> AWARD_CLOTH_ARMOR;


// AWARD RIBBONS AND TROPHIES
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final List<RegistryObject<Item>> TRE_RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> TRE_ROSETTE;

    public static final RegistryObject<Item> MORPHO_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MORPHO_ROSETTE;
    public static final RegistryObject<Item> MONARCH_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MONARCH_ROSETTE;
    
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> MEDAL_1;
    public static final RegistryObject<Item> MEDAL_2;
    public static final RegistryObject<Item> MEDAL_3;
    public static final RegistryObject<Item> FLORAL_GOLD;
    public static final RegistryObject<Item> FLORAL_SILVER;
    public static final RegistryObject<Item> FLORAL_BRONZE;
    public static final RegistryObject<Item> SUN_TROPHY;
    public static final RegistryObject<Item> MOON_TROPHY;




    public AwardShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");
         
// TACK ITEMS
        // BUTTERFLY - MORPHO -- Uncraftable Blue Morpho Tack
        HALTER_MORPHO = REGISTRY.register("halter_morpho",
                () -> new HalterItem("halter_morpho", (new Item.Properties())
                        .stacksTo(16)));
        FLYMASK_MORPHO = REGISTRY.register("flymask_morpho",
                () -> new HalterItem("flymask_morpho", (new Item.Properties())
                        .stacksTo(16)));

        ADVENTURE_SADDLE_MORPHO = REGISTRY.register("adventure_saddle_morpho",
                () -> new AdventureSaddleItem("adventure_saddle_morpho", (new Item.Properties())
                        .stacksTo(1)));
        ADVENTURE_BLANKET_MORPHO = REGISTRY.register("adventure_blanket_morpho",
                () -> new AdventureBlanketItem("adventure_blanket_morpho", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_MORPHO = REGISTRY.register("adventure_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_LEG_WRAPS_MORPHO = REGISTRY.register("adventure_leg_wraps_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        ADVENTURE_BRIDLE_MORPHO = REGISTRY.register("adventure_bridle_morpho",
                () -> new AdventureBridleItem("adventure_bridle_morpho", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_MORPHO = REGISTRY.register("adventure_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));
        CLOTH_HORSE_ARMOR_MORPHO = REGISTRY.register("cloth_horse_armor_morpho",
                () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_morpho", (new Item.Properties())
                        .stacksTo(16)));
        SADDLE_BAG_MORPHO = REGISTRY.register("saddle_bag_morpho",
                () -> new SaddlebagItem("saddle_bag_morpho", (new Item.Properties())
                        .stacksTo(16)));

        WESTERN_SADDLE_MORPHO = REGISTRY.register("western_saddle_morpho",
                () -> new WesternSaddleItem("western_saddle_morpho", (new Item.Properties())
                        .stacksTo(1)));
        WESTERN_BLANKET_MORPHO = REGISTRY.register("western_blanket_morpho",
                () -> new WesternBlanketItem("western_blanket_morpho",
                        Color.ofRGB(tretackcolors[19][0], tretackcolors[19][1], tretackcolors[19][2]), (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_BREAST_COLLAR_MORPHO = REGISTRY.register("western_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_LEG_WRAPS_MORPHO = REGISTRY.register("western_leg_wraps_morpho",
                () ->  new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        WESTERN_BRIDLE_MORPHO = REGISTRY.register("western_bridle_morpho",
                () -> new WesternBridleItem("western_bridle_morpho", (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_GIRTH_STRAP_MORPHO = REGISTRY.register("western_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));

        ENGLISH_SADDLE_MORPHO = REGISTRY.register("english_saddle_morpho",
                () -> new EnglishSaddleItem("english_saddle_morpho", (new Item.Properties())
                        .stacksTo(1)));
        ENGLISH_BLANKET_MORPHO = REGISTRY.register("english_blanket_morpho",
                () -> new EnglishBlanketItem("english_blanket_morpho",
                        Color.ofRGB(tretackcolors[19][0], tretackcolors[19][1], tretackcolors[19][2]), (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_BREAST_COLLAR_MORPHO = REGISTRY.register("english_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_LEG_WRAPS_MORPHO = REGISTRY.register("english_leg_wraps_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        ENGLISH_BRIDLE_MORPHO = REGISTRY.register("english_bridle_morpho",
                () -> new EnglishBridleItem("english_bridle_morpho", (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_GIRTH_STRAP_MORPHO = REGISTRY.register("english_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));

        BITLESS_BRIDLE_MORPHO = REGISTRY.register("english_bridle_bitless_morpho",
                () -> new EnglishBridleItem("english_bridle_bitless_morpho", (new Item.Properties())
                        .stacksTo(16)));
        BAREBACK_BLANKET_MORPHO = REGISTRY.register("bareback_blanket_morpho",
                () -> new WesternBlanketItem("bareback_blanket_morpho",
                        Color.ofRGB(tretackcolors[19][0], tretackcolors[19][1], tretackcolors[19][2]), (new Item.Properties())
                        .stacksTo(16)));

        PASTURE_BLANKET_MORPHO = REGISTRY.register("pasture_blanket_morpho",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_morpho",
                        Color.ofRGB(tretackcolors[19][0], tretackcolors[19][1], tretackcolors[19][2]), new Item.Properties()
                        .stacksTo(16)));
        QUARTER_SHEET_MORPHO = REGISTRY.register("quarter_sheet_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        FLAG_MORPHO = REGISTRY.register("flag_morpho",
                () -> new Item(new Item.Properties()));

        //BUTTERFLY - MONARCH -- Uncraftable Yellow Monarch Tack
        HALTER_MONARCH = REGISTRY.register("halter_monarch",
                () -> new HalterItem("halter_monarch", (new Item.Properties())
                        .stacksTo(16)));
        FLYMASK_MONARCH = REGISTRY.register("flymask_monarch",
                () -> new HalterItem("flymask_monarch", (new Item.Properties())
                        .stacksTo(16)));

        ADVENTURE_SADDLE_MONARCH = REGISTRY.register("adventure_saddle_monarch",
                () -> new AdventureSaddleItem("adventure_saddle_monarch", (new Item.Properties())
                        .stacksTo(1)));
        ADVENTURE_BLANKET_MONARCH = REGISTRY.register("adventure_blanket_monarch",
                () -> new AdventureBlanketItem("adventure_blanket_monarch", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_BREAST_COLLAR_MONARCH = REGISTRY.register("adventure_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_LEG_WRAPS_MONARCH = REGISTRY.register("adventure_leg_wraps_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        ADVENTURE_BRIDLE_MONARCH = REGISTRY.register("adventure_bridle_monarch",
                () -> new AdventureBridleItem("adventure_bridle_monarch", (new Item.Properties())
                        .stacksTo(16)));
        ADVENTURE_GIRTH_STRAP_MONARCH = REGISTRY.register("adventure_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));
        CLOTH_HORSE_ARMOR_MONARCH = REGISTRY.register("cloth_horse_armor_monarch",
                () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_monarch", (new Item.Properties())
                        .stacksTo(16)));
        SADDLE_BAG_MONARCH = REGISTRY.register("saddle_bag_monarch",
                () -> new SaddlebagItem("saddle_bag_monarch", (new Item.Properties())
                        .stacksTo(16)));

        WESTERN_SADDLE_MONARCH = REGISTRY.register("western_saddle_monarch",
                () -> new WesternSaddleItem("western_saddle_monarch", (new Item.Properties())
                        .stacksTo(1)));
        WESTERN_BLANKET_MONARCH = REGISTRY.register("western_blanket_monarch",
                () -> new WesternBlanketItem("western_blanket_monarch",
                        Color.ofRGB(tretackcolors[18][0], tretackcolors[18][1], tretackcolors[18][2]), (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_BREAST_COLLAR_MONARCH = REGISTRY.register("western_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_LEG_WRAPS_MONARCH = REGISTRY.register("western_leg_wraps_monarch",
                () ->  new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        WESTERN_BRIDLE_MONARCH = REGISTRY.register("western_bridle_monarch",
                () -> new WesternBridleItem("western_bridle_monarch", (new Item.Properties())
                        .stacksTo(16)));
        WESTERN_GIRTH_STRAP_MONARCH = REGISTRY.register("western_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));

        ENGLISH_SADDLE_MONARCH = REGISTRY.register("english_saddle_monarch",
                () -> new EnglishSaddleItem("english_saddle_monarch", (new Item.Properties())
                        .stacksTo(1)));
        ENGLISH_BLANKET_MONARCH = REGISTRY.register("english_blanket_monarch",
                () -> new EnglishBlanketItem("english_blanket_monarch",
                        Color.ofRGB(tretackcolors[18][0], tretackcolors[18][1], tretackcolors[18][2]), (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_BREAST_COLLAR_MONARCH = REGISTRY.register("english_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_LEG_WRAPS_MONARCH = REGISTRY.register("english_leg_wraps_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                        .stacksTo(64)));
        ENGLISH_BRIDLE_MONARCH = REGISTRY.register("english_bridle_monarch",
                () -> new EnglishBridleItem("english_bridle_monarch", (new Item.Properties())
                        .stacksTo(16)));
        ENGLISH_GIRTH_STRAP_MONARCH = REGISTRY.register("english_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                        .stacksTo(16)));

        BITLESS_BRIDLE_MONARCH = REGISTRY.register("english_bridle_bitless_monarch",
                () -> new EnglishBridleItem("english_bridle_bitless_monarch", (new Item.Properties())
                        .stacksTo(16)));
        BAREBACK_BLANKET_MONARCH = REGISTRY.register("bareback_blanket_monarch",
                () -> new WesternBlanketItem("bareback_blanket_monarch",
                        Color.ofRGB(tretackcolors[18][0], tretackcolors[18][1], tretackcolors[18][2]), (new Item.Properties())
                        .stacksTo(16)));

        PASTURE_BLANKET_MONARCH = REGISTRY.register("pasture_blanket_monarch",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_monarch",
                        Color.ofRGB(tretackcolors[18][0], tretackcolors[18][1], tretackcolors[18][2]), new Item.Properties()
                        .stacksTo(16)));
        QUARTER_SHEET_MONARCH = REGISTRY.register("quarter_sheet_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                        .stacksTo(16)));

        FLAG_MONARCH = REGISTRY.register("flag_monarch",
                () -> new Item(new Item.Properties()));
        
        
    // AWARD - Uncraftable Numbered Tack Items -- 12 Count Items
        AWARD_PASTURE_BLANKETS = new ArrayList<>();
        AWARD_PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        AWARD_HALTERS = new ArrayList<>();
        AWARD_FLYMASKS = new ArrayList<>();
        AWARD_ADVENTURE_BLANKETS = new ArrayList<>();
        AWARD_WESTERN_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_LEG_WRAPS = new ArrayList<>();
        AWARD_WESTERN_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_LEG_WRAPS = new ArrayList<>();
        AWARD_ADVENTURE_SADDLES = new ArrayList<>();
        AWARD_WESTERN_SADDLES = new ArrayList<>();
        AWARD_ENGLISH_SADDLES = new ArrayList<>();
        AWARD_ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        AWARD_WESTERN_BREAST_COLLARS = new ArrayList<>();
        AWARD_ENGLISH_BREAST_COLLARS = new ArrayList<>();
        AWARD_ADVENTURE_BRIDLES = new ArrayList<>();
        AWARD_WESTERN_BRIDLES = new ArrayList<>();
        AWARD_ENGLISH_BRIDLES = new ArrayList<>();
        AWARD_ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        AWARD_WESTERN_GIRTH_STRAPS = new ArrayList<>();
        AWARD_ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        AWARD_QUARTER_SHEETS = new ArrayList<>();
        AWARD_FLAGS = new ArrayList<>();
        AWARD_SADDLE_BAGS = new ArrayList<>();
        AWARD_CLOTH_ARMOR = new ArrayList<>();
        TRE_RIBBON_THREE_TAILS = new ArrayList<>();
        TRE_RIBBON_TWO_TAILS = new ArrayList<>();
        TRE_RIBBON_ONE_TAIL = new ArrayList<>();
        TRE_ROSETTE = new ArrayList<>();

        int var543 = 14;

        //ADVENTURE TACK
        for(int var1 = 0; var543 > var1; ++var1) {
            int counter = var1+1;
            AWARD_ADVENTURE_SADDLES.add(REGISTRY.register("award_adventure_saddle_" + counter, () ->
                    new AdventureSaddleItem("award_adventure_saddle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ADVENTURE_BLANKETS.add(REGISTRY.register("award_adventure_blanket_" + counter,
                    () -> new AdventureBlanketItem("award_adventure_blanket_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ADVENTURE_BREAST_COLLARS.add(REGISTRY.register("award_adventure_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ADVENTURE_LEG_WRAPS.add(REGISTRY.register("award_adventure_leg_wraps_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
            AWARD_ADVENTURE_BRIDLES .add(REGISTRY.register("award_adventure_bridle_"+ counter,
                    () -> new AdventureBridleItem("award_adventure_bridle_"+ counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ADVENTURE_GIRTH_STRAPS .add(REGISTRY.register("award_adventure_girth_strap_"+ counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
        }


        //SADDLE BAGS AND CLOTH ARMOR
        for(int var1 = 0; var1 < var543; ++var1) {
            int counter = var1+1;
            AWARD_CLOTH_ARMOR.add(REGISTRY.register("award_cloth_horse_armor_" + counter,
                    () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "award_cloth_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_SADDLE_BAGS.add(REGISTRY.register("award_saddle_bag_" + counter, () ->
                    new SaddlebagItem("award_saddle_bag_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        //WESTERN TACK
        for(int var1 = 0; var1 < var543; ++var1) {
            int counter = var1+1;
            AWARD_WESTERN_SADDLES.add(REGISTRY.register("award_western_saddle_" + counter,
                    () -> new WesternSaddleItem("award_western_saddle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_WESTERN_BLANKETS.add(REGISTRY.register("award_western_blanket_" + counter,
                    () -> new WesternBlanketItem("award_western_blanket_" + counter, Color.WHITE, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_WESTERN_BREAST_COLLARS.add(REGISTRY.register("award_western_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_WESTERN_LEG_WRAPS.add(REGISTRY.register("award_western_leg_wraps_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
            AWARD_WESTERN_BRIDLES.add(REGISTRY.register("award_western_bridle_" + counter,
                    () -> new WesternBridleItem("award_western_bridle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_WESTERN_GIRTH_STRAPS.add(REGISTRY.register("award_western_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        //ENGLISH TACK
        for(int var1 = 0; var1 < var543; ++var1) {
            int counter = var1+1;
            AWARD_ENGLISH_SADDLES.add(REGISTRY.register("award_english_saddle_" + counter,
                    () -> new EnglishSaddleItem("award_english_saddle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ENGLISH_BLANKETS.add(REGISTRY.register("award_english_blanket_" + counter,
                    () -> new EnglishBlanketItem("award_english_blanket_" + counter, Color.WHITE, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ENGLISH_BREAST_COLLARS.add(REGISTRY.register("award_english_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ENGLISH_LEG_WRAPS.add(REGISTRY.register("award_english_leg_wraps_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).build(), (new Item.Properties())
                            .stacksTo(64))
            ));
            AWARD_ENGLISH_BRIDLES.add(REGISTRY.register("award_english_bridle_" + counter,
                    () -> new EnglishBridleItem("award_english_bridle_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_ENGLISH_GIRTH_STRAPS.add(REGISTRY.register("award_english_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
        }

        //PADDOCK TACK
        for(int var1 = 0; var1 < var543; ++var1) {
            int counter = var1 + 1;
            AWARD_HALTERS.add(REGISTRY.register("award_halter_" + counter,
                    () -> new HalterItem("award_halter_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_FLYMASKS.add(REGISTRY.register("award_flymask_" + counter,
                    () -> new HalterItem("award_flymask_" + counter, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_QUARTER_SHEETS.add(REGISTRY.register("award_quarter_sheet_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).build(), (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS.add(REGISTRY.register("award_pasture_blanket_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "award_pasture_blanket_" + counter, Color.WHITE, (new Item.Properties())
                            .stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS_ARMORED.add(REGISTRY.register("award_pasture_blanket_" + counter + "_armored",
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                            "award_pasture_blanket_" + counter + "_armored", Color.WHITE, (new Item.Properties())
                            .stacksTo(16))
            ));
        }



        // FLAGS
        for(int var1 = 1; var1 < 15; ++var1) {
            AWARD_FLAGS.add(REGISTRY.register("award_flag_" + var1, () ->
                    new Item((new Item.Properties()))));
        }

// AWARD ITEMS
        MORPHO_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_ROSETTE = REGISTRY.register("rosette_morpho",
                () -> new Item(new Item.Properties()));

        MONARCH_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_ROSETTE = REGISTRY.register("rosette_monarch",
                () -> new Item(new Item.Properties()));

        // RIBBONS IN MY COLORS
        for(int var21 = 1; var21 < 15; ++var21) {
            TRE_RIBBON_THREE_TAILS.add(REGISTRY.register("ribbon_three_tails_" + var21, () ->
                    new Item(new Item.Properties())
            ));
            TRE_RIBBON_TWO_TAILS.add(REGISTRY.register("ribbon_two_tails_" + var21, () ->
                    new Item(new Item.Properties())
            ));
            TRE_RIBBON_ONE_TAIL.add(REGISTRY.register("ribbon_one_tail_" + var21, () ->
                    new Item(new Item.Properties())
            ));
            TRE_ROSETTE.add(REGISTRY.register("rosette_" + var21, () ->
                    new Item(new Item.Properties())
            ));
        }
        
    // Dye Color number items
        RIBBON_THREE_TAILS = new ArrayList<>();
        RIBBON_TWO_TAILS = new ArrayList<>();
        RIBBON_ONE_TAIL = new ArrayList<>();
        ROSETTE = new ArrayList<>();
        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for(int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
             RIBBON_THREE_TAILS.add( REGISTRY.register("ribbon_three_tails_" + color.getName(), () ->
                     new Item(new Item.Properties() )
             ));
             RIBBON_TWO_TAILS.add( REGISTRY.register("ribbon_two_tails_" + color.getName(), () ->
                     new Item(new Item.Properties() )
             ));
             RIBBON_ONE_TAIL.add( REGISTRY.register("ribbon_one_tail_" + color.getName(), () ->
                     new Item(new Item.Properties() )
             ));
             ROSETTE.add( REGISTRY.register("rosette_" + color.getName(), () ->
                     new Item(new Item.Properties() )
             ));
         }

    // One off award items
        RIBBON_THREE_TAILS_GRAND =  REGISTRY.register("ribbon_three_tails_grand",
                () -> new Item(new Item.Properties() ));
        RIBBON_THREE_TAILS_RESERVE =  REGISTRY.register("ribbon_three_tails_reserve",
                () -> new Item(new Item.Properties() ));
        TROPHY_1 =  REGISTRY.register("trophy_1",
                () -> new Item(new Item.Properties() ));
        TROPHY_2 =  REGISTRY.register("trophy_2",
                () -> new Item(new Item.Properties() ));
        TROPHY_3 =  REGISTRY.register("trophy_3",
                () -> new Item(new Item.Properties() ));
        FLORAL_GOLD = REGISTRY.register("floral_gold",
                () -> new Item(new Item.Properties()));
        FLORAL_SILVER = REGISTRY.register("floral_silver",
                () -> new Item(new Item.Properties()));
        FLORAL_BRONZE = REGISTRY.register("floral_bronze",
                () -> new Item(new Item.Properties()));
        SUN_TROPHY = REGISTRY.register("sun_trophy",
                () -> new Item(new Item.Properties()));
        MOON_TROPHY = REGISTRY.register("moon_trophy",
                () -> new Item(new Item.Properties()));


        MEDAL_1 =  REGISTRY.register("medal_1",
                () -> new Item(new Item.Properties() ));
        MEDAL_2 =  REGISTRY.register("medal_2",
                () -> new Item(new Item.Properties() ));
        MEDAL_3 =  REGISTRY.register("medal_3",
                () -> new Item(new Item.Properties() ));
    }
}
