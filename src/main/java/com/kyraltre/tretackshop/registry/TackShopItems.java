package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.blocks.TackBoxBlock;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.*;
import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import software.bernie.geckolib.core.object.Color;

public class TackShopItems {
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

    // THIS IS FOR TACK REGISTRY THAT __CAN__ BE CRAFTED
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
    public static final RegistryObject<Item> PAW_PRINT;
    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;

    // TACK ITEMS


//    //ONE OFF TACK
//    public static final RegistryObject<TackItem> PELHAM_BRIDLE_BLACK;
//    public static final RegistryObject<TackItem> PELHAM_BRIDLE_BROWN;
//    public static final RegistryObject<TackItem> MEDIEVAL_BRIDLE_BLACK;
//    public static final RegistryObject<TackItem> MEDIEVAL_BRIDLE_BROWN;
//    public static final RegistryObject<TackItem> MOON_BRIDLE_DOUBLE;
//    public static final RegistryObject<TackItem> BITLESS_BRIDLE;
//    public static final RegistryObject<TackItem> BAREBACK_SADDLE;
//    public static final RegistryObject<TackItem> BAREBACK_BLANKET;
//    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP;
//    public static final RegistryObject<TackItem> BITLESS_BRIDLE_BROWN;
//    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BROWN;
//    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_BROWN;
//    public static final RegistryObject<TackItem> BITLESS_BRIDLE_BEIGE;
//    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BEIGE;
//    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_BEIGE;
//    public static final RegistryObject<TackItem> HUNTER_BLANKET;
//    public static final RegistryObject<TackItem> BITLESS_BRIDLE_WHITE;
//    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BLACK;
//    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_WHITE;
//
//    public static final RegistryObject<TackItem> DRESSAGE_SADDLE;
//    public static final RegistryObject<TackItem> DRESSAGE_BLANKET;
//    public static final RegistryObject<TackItem> DRESSAGE_GIRTH_STRAP;
//    public static final RegistryObject<TackItem> RACING_SADDLE_BROWN;
//    public static final RegistryObject<TackItem> RACING_SADDLE_BLACK;
//
//    // RAINBOW TACK
//    public static final RegistryObject<TackItem> HALTER_RAINBOW;
//    public static final RegistryObject<TackItem> PASTURE_BLANKET_RAINBOW;
//    public static final RegistryObject<TackItem> PASTURE_BLANKET_RAINBOW_ARMORED;
//    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_BLANKET_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_BLANKET_RAINBOW;
//    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_RAINBOW;
//    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_SADDLE_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_SADDLE_RAINBOW;
//    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_RAINBOW;
//    public static final RegistryObject<TackItem> QUARTER_SHEET_BLACK_RAINBOW;
//    public static final RegistryObject<TackItem> QUARTER_SHEET_WHITE_RAINBOW;
//    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_BRIDLE_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_RAINBOW;
//    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_RAINBOW;
//    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_RAINBOW;
//    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_RAINBOW;
//    public static final RegistryObject<TackItem> AMETHYST_HORSE_ARMOR_RAINBOW;
//    public static final RegistryObject<TackItem> IRON_HORSE_ARMOR_RAINBOW;
//    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_RAINBOW;
//    public static final RegistryObject<TackItem> BAREBACK_BLANKET_RAINBOW;
//    public static final RegistryObject<TackItem> CLOTH_BITLESS_BRIDLE_RAINBOW;
//
//    // TRANSPARENT 'BAREBACK/LIBERTY' TACK
//    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_TRANS;
//    public static final RegistryObject<TackItem> ENGLISH_BLANKET_TRANS;
//    public static final RegistryObject<TackItem> WESTERN_BLANKET_TRANS;
//    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_TRANS;
//    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_TRANS;
//    public static final RegistryObject<TackItem> WESTERN_SADDLE_TRANS;
//    public static final RegistryObject<TackItem> ENGLISH_SADDLE_TRANS;
//    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_TRANS;
//    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_TRANS;
//    public static final RegistryObject<TackItem> WESTERN_BRIDLE_TRANS;
//    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_TRANS;
//    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_TRANS;
//    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_TRANS;
//    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_TRANS;
//
//    // CRAFTABLE NUMBERED TACK
//    public static final List<RegistryObject<TackItem>> HALTERS;
//    public static final List<RegistryObject<TackItem>> FLYMASKS;
//    public static final List<RegistryObject<TackItem>> PASTURE_BLANKETS;
//    public static final List<RegistryObject<TackItem>> PASTURE_BLANKETS_ARMORED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BLANKETS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKETS;
//    public static final List<RegistryObject<TackItem>> WESTERN_BLANKETS;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_LEG_WRAPS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS;
//    public static final List<RegistryObject<TackItem>> WESTERN_LEG_WRAPS;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_SADDLES;
//    public static final List<RegistryObject<TackItem>> WESTERN_SADDLES;
//    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES;
//    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_OTHER;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BREAST_COLLARS;
//    public static final List<RegistryObject<TackItem>> WESTERN_BREAST_COLLARS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_OTHER;
//    public static final List<RegistryObject<TackItem>> CLOTH_BREAST_COLLARS;
//    public static final List<RegistryObject<TackItem>> QUARTER_SHEETS_NUMBERED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BRIDLES;
//    public static final List<RegistryObject<TackItem>> WESTERN_BRIDLES;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_OTHER;
//    public static final List<RegistryObject<TackItem>> CLOTH_BRIDLES;
//    public static final List<RegistryObject<TackItem>> CLOTH_BITLESS_BRIDLES;
//    public static final List<RegistryObject<TackItem>> BAREBACK_BLANKETS;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_GIRTH_STRAPS;
//    public static final List<RegistryObject<TackItem>> WESTERN_GIRTH_STRAPS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS;
//    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_OTHER;
//    public static final List<RegistryObject<TackItem>> CLOTH_GIRTH_STRAPS;
//    public static final List<RegistryObject<SaddlebagItem>> SADDLE_BAGS;
//    public static final List<RegistryObject<TackItem>> CLOTH_ARMOR;
//
//    // CRAFTABLE TACK IN THE 16 DYEABLE COLORS
//    public static final List<RegistryObject<TackItem>> CLOTH_BITLESS_BRIDLES_DYED;
//    public static final List<RegistryObject<TackItem>> BAREBACK_BLANKETS_DYED;
//    public static final List<RegistryObject<TackItem>> FLYMASKS_DYED;
//    public static final List<RegistryObject<TackItem>> QUARTER_SHEETS_DYED;
//    public static final List<RegistryObject<TackItem>> CLOTH_ARMOR_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_GIRTH_STRAPS_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BRIDLES_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BREAST_COLLARS_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_SADDLES_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_LEG_WRAPS_DYED;
//    public static final List<RegistryObject<TackItem>> ADVENTURE_BLANKETS_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BLACK_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BLACK_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BLACK_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BLACK_DYED;
//    public static final List<RegistryObject<TackItem>> CLOTH_GIRTH_STRAPS_DYED;
//    public static final List<RegistryObject<TackItem>> CLOTH_BRIDLES_DYED;
//    public static final List<RegistryObject<TackItem>> CLOTH_BREAST_COLLARS_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BROWN_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BROWN_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BROWN_DYED;
//    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BROWN_DYED;
//
//
//    public static final List<RegistryObject<TackBoxBlock>> TACKBOXES;

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        BUTTERFLY = REGISTRY.register("butterfly",
                () -> new Item(new Item.Properties()));
        BUTTERFLY_MONARCH = REGISTRY.register("butterfly_monarch",
                () -> new Item(new Item.Properties()));
        PAW_PRINT = REGISTRY.register("paw_print",
                () -> new Item(new Item.Properties()));
        RAINBOW_INA_BOTTLE = REGISTRY.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties()));
        // This is what we use to make the rainbow tack

// TACK

        // Dyed Items

//        // ONE OFF TACK
//        PELHAM_BRIDLE_BLACK = REGISTRY.register("pelham_bridle_black",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        PELHAM_BRIDLE_BROWN = REGISTRY.register("pelham_bridle_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        MOON_BRIDLE_DOUBLE = REGISTRY.register("moon_bridle_double",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        MEDIEVAL_BRIDLE_BLACK = REGISTRY.register("medieval_bridle_black",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        MEDIEVAL_BRIDLE_BROWN = REGISTRY.register("medieval_bridle_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BITLESS_BRIDLE = REGISTRY.register("english_bridle_bitless",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_SADDLE_BLACK = REGISTRY.register("bareback_saddle_black",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        BAREBACK_BLANKET = REGISTRY.register("bareback_blanket",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/bareback_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/bareback_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_GIRTH_STRAP = REGISTRY.register("bareback_girth_strap",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                        new GirthStrapTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])))
//                        .rackTexture(RackType.SADDLE,
//                        ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//
//        BITLESS_BRIDLE_BROWN = REGISTRY.register("english_bridle_bitless_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_SADDLE_BROWN = REGISTRY.register("bareback_saddle_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        BAREBACK_GIRTH_STRAP_BROWN = REGISTRY.register("bareback_girth_strap_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                        new GirthStrapTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])))
//                        .rackTexture(RackType.SADDLE,
//                        ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        BITLESS_BRIDLE_BEIGE = REGISTRY.register("english_bridle_bitless_beige",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_SADDLE_BEIGE = REGISTRY.register("bareback_saddle_beige",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        BAREBACK_GIRTH_STRAP_BEIGE = REGISTRY.register("bareback_girth_strap_beige",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
//                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        BITLESS_BRIDLE_WHITE = REGISTRY.register("english_bridle_bitless_white",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE)
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_SADDLE = REGISTRY.register("bareback_saddle",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        BAREBACK_GIRTH_STRAP_WHITE = REGISTRY.register("bareback_girth_strap_white",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
//                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2])))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        DRESSAGE_SADDLE = REGISTRY.register("dressage_saddle",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        DRESSAGE_BLANKET = REGISTRY.register("dressage_blanket",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/dressage_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/dressage_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        DRESSAGE_GIRTH_STRAP = REGISTRY.register("dressage_girth_strap",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
//                                        Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        RACING_SADDLE_BROWN = REGISTRY.register("racing_saddle_brown",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2]),
//                        "english")).build(), (new Item.Properties()).stacksTo(1)));
//        RACING_SADDLE_BLACK = REGISTRY.register("racing_saddle_black",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
//                        "english")).build(), (new Item.Properties()).stacksTo(1)));
//        HUNTER_BLANKET = REGISTRY.register("hunter_blanket",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hunter_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hunter_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//
//        // Rainbow Tack
//        HALTER_RAINBOW =  REGISTRY.register("halter_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
//                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        ADVENTURE_SADDLE_RAINBOW =  REGISTRY.register("adventure_saddle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
//                        "adventure")).build(), (new Item.Properties()).stacksTo(1)));
//        ADVENTURE_BRIDLE_RAINBOW = REGISTRY.register("adventure_bridle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(true, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_BREAST_COLLAR_RAINBOW =  REGISTRY.register("adventure_breast_collar_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_GIRTH_STRAP_RAINBOW = REGISTRY.register("adventure_girth_strap_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(true, Collections.emptySet(),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_adventure.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_BLANKET_RAINBOW =  REGISTRY.register("adventure_blanket_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_adventure_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_adventure_blanket.png"))
//                        .withData(new TackTypeData(true, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_LEG_WRAPS_RAINBOW =  REGISTRY.register("adventure_leg_wraps_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(64)));
//        SADDLE_BAG_RAINBOW = REGISTRY.register("saddle_bag_rainbow",
//                () -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
//                        true, Collections.emptySet(),
//                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        AMETHYST_HORSE_ARMOR_RAINBOW = REGISTRY.register("amethyst_horse_armor_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(16)));
//        IRON_HORSE_ARMOR_RAINBOW = REGISTRY.register("iron_horse_armor_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        HorseArmorTier.IRON.getTierName())).build(), (new Item.Properties()).stacksTo(16)));
//
//        WESTERN_SADDLE_RAINBOW =  REGISTRY.register("western_saddle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        WESTERN_BRIDLE_RAINBOW = REGISTRY.register("western_bridle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        WESTERN_BREAST_COLLAR_RAINBOW =  REGISTRY.register("western_breast_collar_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        WESTERN_GIRTH_STRAP_RAINBOW = REGISTRY.register("western_girth_strap_rainbow",
//                        () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                        new GirthStrapTypeData(false, Collections.emptySet(),
//                                                ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                                ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                                .rackTexture(RackType.SADDLE,
//                                        ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_western.png")).build(),
//                                (new Item.Properties()).stacksTo(16)));
//        WESTERN_BLANKET_RAINBOW =  REGISTRY.register("western_blanket_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_western_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_western_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        WESTERN_LEG_WRAPS_RAINBOW =  REGISTRY.register("western_leg_wraps_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(64)));
//
//        ENGLISH_SADDLE_RAINBOW =  REGISTRY.register("english_saddle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
//                        "english")).build(), (new Item.Properties()).stacksTo(1)));
//        ENGLISH_BRIDLE_RAINBOW = REGISTRY.register("english_bridle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_BREAST_COLLAR_RAINBOW =  REGISTRY.register("english_breast_collar_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_GIRTH_STRAP_RAINBOW = REGISTRY.register("english_girth_strap_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_english.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_BLANKET_RAINBOW =  REGISTRY.register("english_blanket_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_english_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_english_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_LEG_WRAPS_RAINBOW =  REGISTRY.register("english_leg_wraps_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(64)));
//
//        CLOTH_BITLESS_BRIDLE_RAINBOW = REGISTRY.register("cloth_bitless_bridle_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE)
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        BAREBACK_BLANKET_RAINBOW = REGISTRY.register("bareback_blanket_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_bareback_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_bareback_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        PASTURE_BLANKET_RAINBOW =  REGISTRY.register("pasture_blanket_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
//                        new PastureBlanketTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE), false))
//                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
//                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_3_short.png"))
//                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
//                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_5_long.png"))
//                        .build(), (new Item.Properties()).stacksTo(16)));
//        PASTURE_BLANKET_RAINBOW_ARMORED =  REGISTRY.register("pasture_blanket_rainbow_armored",
//                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
//                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
//                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_3_short.png"))
//                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
//                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_5_long.png"))
//                        .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        QUARTER_SHEET_BLACK_RAINBOW = REGISTRY.register("quarter_sheet_black_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        QUARTER_SHEET_WHITE_RAINBOW = REGISTRY.register("quarter_sheet_white_rainbow",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        // TRANSPARENT 'BAREBACK/LIBERTY' TACK
//        ADVENTURE_SADDLE_TRANS = REGISTRY.register("adventure_saddle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        "adventure")).build(), (new Item.Properties()).stacksTo(1)));
//        ADVENTURE_BRIDLE_TRANS = REGISTRY.register("adventure_bridle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(true, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE)
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_BREAST_COLLAR_TRANS = REGISTRY.register("adventure_breast_collar_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_GIRTH_STRAP_TRANS = REGISTRY.register("adventure_girth_strap_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(true, Collections.emptySet(),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/trans_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_BLANKET_TRANS = REGISTRY.register("adventure_blanket_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/trans_adventure_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/trans_adventure_blanket.png"))
//                        .withData(new TackTypeData(true, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ADVENTURE_LEG_WRAPS_TRANS = REGISTRY.register("adventure_leg_wraps_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(64)));
//
//        WESTERN_SADDLE_TRANS = REGISTRY.register("western_saddle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        "western")).build(), (new Item.Properties()).stacksTo(1)));
//        WESTERN_BRIDLE_TRANS = REGISTRY.register("western_bridle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE)
//                                , "western")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        WESTERN_GIRTH_STRAP_TRANS = REGISTRY.register("western_girth_strap_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/trans_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        WESTERN_BLANKET_TRANS = REGISTRY.register("western_blanket_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/trans_western_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/trans_western_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));
//
//        ENGLISH_SADDLE_TRANS = REGISTRY.register("english_saddle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                        "english")).build(), (new Item.Properties()).stacksTo(1)));
//        ENGLISH_BRIDLE_TRANS = REGISTRY.register("english_bridle_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                        new BridleTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE)
//                                , "english")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_GIRTH_STRAP_TRANS = REGISTRY.register("english_girth_strap_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                new GirthStrapTypeData(false, Collections.emptySet(),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
//                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
//                        .rackTexture(RackType.SADDLE,
//                                ModRef.res("textures/entity/rack/saddle/trans_girth_strap.png")).build(),
//                        (new Item.Properties()).stacksTo(16)));
//        ENGLISH_BLANKET_TRANS = REGISTRY.register("english_blanket_trans",
//                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/trans_english_blanket.png"))
//                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/trans_english_blanket.png"))
//                        .withData(new TackTypeData(false, Collections.emptySet(),
//                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
//                        (new Item.Properties()).stacksTo(16)));

        // Craftable Numbered Tack Items -- 12 Count Items
//        PASTURE_BLANKETS = new ArrayList<>();
//        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
//        HALTERS = new ArrayList<>();
//        FLYMASKS = new ArrayList<>();
//        ADVENTURE_BLANKETS = new ArrayList<>();
//        WESTERN_BLANKETS = new ArrayList<>();
//        ENGLISH_BLANKETS = new ArrayList<>();
//        ENGLISH_LEG_WRAPS = new ArrayList<>();
//        WESTERN_LEG_WRAPS = new ArrayList<>();
//        ADVENTURE_LEG_WRAPS = new ArrayList<>();
//        ADVENTURE_SADDLES = new ArrayList<>();
//        WESTERN_SADDLES = new ArrayList<>();
//        ENGLISH_SADDLES = new ArrayList<>();
//        ENGLISH_SADDLES_OTHER = new ArrayList<>();
//        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
//        WESTERN_BREAST_COLLARS = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS_OTHER = new ArrayList<>();
//        CLOTH_BREAST_COLLARS = new ArrayList<>();
//        ADVENTURE_BRIDLES = new ArrayList<>();
//        WESTERN_BRIDLES = new ArrayList<>();
//        ENGLISH_BRIDLES = new ArrayList<>();
//        ENGLISH_BRIDLES_OTHER = new ArrayList<>();
//        CLOTH_BRIDLES = new ArrayList<>();
//        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
//        WESTERN_GIRTH_STRAPS = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS_OTHER = new ArrayList<>();
//        CLOTH_GIRTH_STRAPS = new ArrayList<>();
//        QUARTER_SHEETS_NUMBERED = new ArrayList<>();
//        SADDLE_BAGS = new ArrayList<>();
//        CLOTH_ARMOR = new ArrayList<>();
//        BAREBACK_BLANKETS = new ArrayList<>();
//        CLOTH_BITLESS_BRIDLES = new ArrayList<>();
//        TACKBOXES = new ArrayList<>();

//        int var1 = 15;
//
//        var rContext = new Object() {
//            int var2 = 1;
//        };
//        var rEngColor = new Object() {
//            final int varE = 1;
//        };
//        var rEngOtherColor = new Object() {
//            final int varEO = 1;
//        };
//        var rWestColor = new Object() {
//            final int varW = 1;
//        };
//
//        while (rContext.var2 < var1) {
//            int temp_english_color_value = rEngColor.varE;
//            int temp_western_color_value = rWestColor.varW;
//            int temp_english_other_color_value = rEngOtherColor.varEO;
//            int counter = rContext.var2;
//            boolean a = counter < 7;
//            boolean b = counter > 6;
//            boolean c = counter == 13;
//            boolean d = counter == 14;
//            if (a) {
//                temp_english_color_value = 15;
//                temp_western_color_value = 16;
//                temp_english_other_color_value = 16;
//            }
//            if (b) {
//                temp_english_color_value = 16;
//                temp_western_color_value = 17;
//                temp_english_other_color_value = 15;
//            }
//            if (c) {
//                temp_english_color_value = 15;
//                temp_western_color_value = 16;
//                temp_english_other_color_value = 16;
//            }
//            if (d) {
//                temp_english_color_value = 16;
//                temp_western_color_value = 17;
//                temp_english_other_color_value = 15;
//            }
//            int final_western_color_value = temp_western_color_value;
//            int final_english_color_value = temp_english_color_value;
//            int final_english_other_color_value = temp_english_other_color_value;
//            HALTERS.add( REGISTRY.register("halter_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
//                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            FLYMASKS.add( REGISTRY.register("flymask_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
//                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            ADVENTURE_SADDLES.add( REGISTRY.register("adventure_saddle_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                            "adventure")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ADVENTURE_BRIDLES.add(REGISTRY.register("adventure_bridle_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(true, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "western")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_BREAST_COLLARS.add( REGISTRY.register("adventure_breast_collar_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_GIRTH_STRAPS.add(REGISTRY.register("adventure_girth_strap_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(true, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                            Color.ofRGB(tretackcolors[17][0], tretackcolors[17][1], tretackcolors[17][2])))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_BLANKETS.add( REGISTRY.register("adventure_blanket_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
//                            .withData(new TackTypeData(true, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_LEG_WRAPS.add( REGISTRY.register("adventure_leg_wraps_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(64))
//            ));
//            CLOTH_ARMOR.add(REGISTRY.register("cloth_horse_armor_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                            HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(16))
//
//            ));
//            SADDLE_BAGS.add(REGISTRY.register("saddle_bag_" + counter, () ->
//                    new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
//                            true, Collections.emptySet(),
//                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            WESTERN_SADDLES.add( REGISTRY.register("western_saddle_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                            "western")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            WESTERN_BRIDLES.add(REGISTRY.register("western_bridle_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "western")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            WESTERN_BREAST_COLLARS.add( REGISTRY.register("western_breast_collar_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            WESTERN_GIRTH_STRAPS.add(REGISTRY.register("western_girth_strap_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                            Color.ofRGB(tretackcolors[final_western_color_value][0], tretackcolors[final_western_color_value][1], tretackcolors[final_western_color_value][2])))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            WESTERN_BLANKETS.add( REGISTRY.register("western_blanket_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_western_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_western_blanket.png"))
//                            .withData(new TackTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            WESTERN_LEG_WRAPS.add( REGISTRY.register("western_leg_wraps_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(64))
//            ));
//
//            ENGLISH_SADDLES.add( REGISTRY.register("english_saddle_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                            "english")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ENGLISH_BRIDLES.add(REGISTRY.register("english_bridle_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_BREAST_COLLARS.add( REGISTRY.register("english_breast_collar_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_GIRTH_STRAPS.add(REGISTRY.register("english_girth_strap_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                            Color.ofRGB(tretackcolors[final_english_color_value][0], tretackcolors[final_english_color_value][1], tretackcolors[final_english_color_value][2])))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_SADDLES_OTHER.add( REGISTRY.register("english_saddle_other_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                            "english")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ENGLISH_BRIDLES_OTHER.add(REGISTRY.register("english_bridle_other_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_BREAST_COLLARS_OTHER.add( REGISTRY.register("english_breast_collar_other_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_GIRTH_STRAPS_OTHER.add(REGISTRY.register("english_girth_strap_other_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                            Color.ofRGB(tretackcolors[final_english_other_color_value][0], tretackcolors[final_english_other_color_value][1], tretackcolors[final_english_other_color_value][2])))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_BLANKETS.add( REGISTRY.register("english_blanket_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_english_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_english_blanket.png"))
//                            .withData(new TackTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_LEG_WRAPS.add( REGISTRY.register("english_leg_wraps_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(64))
//            ));
//
//            CLOTH_BRIDLES.add(REGISTRY.register("cloth_bridle_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            CLOTH_BREAST_COLLARS.add(REGISTRY.register("cloth_breast_collar_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            CLOTH_GIRTH_STRAPS.add(REGISTRY.register("cloth_girth_strap_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            CLOTH_BITLESS_BRIDLES.add(REGISTRY.register("cloth_bitless_bridle_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            BAREBACK_BLANKETS.add(REGISTRY.register("bareback_blanket_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
//                            .withData(new TackTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            PASTURE_BLANKETS.add( REGISTRY.register("pasture_blanket_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
//                                    new PastureBlanketTypeData(false, Collections.emptySet(),
//                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
//                                            , false))
//                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
//                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_3_short.png"))
//                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
//                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_5_long.png"))
//                            .build(), (new Item.Properties()).stacksTo(16))
//            ));
//            PASTURE_BLANKETS_ARMORED.add( REGISTRY.register("pasture_blanket_" + counter + "_armored", () ->
//                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
//                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
//                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_3_short.png"))
//                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
//                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_5_long.png"))
//                            .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
//                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
//                                    true)).build(), (new Item.Properties()).stacksTo(16))
//            ));
//            QUARTER_SHEETS_NUMBERED.add(REGISTRY.register("quarter_sheet_" + counter, () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            ++rContext.var2;
//        }

        //DYED TACK  - Craftable still :3
//        QUARTER_SHEETS_DYED = new ArrayList<>();
//        FLYMASKS_DYED = new ArrayList<>();
//        CLOTH_BITLESS_BRIDLES_DYED = new ArrayList<>();
//        BAREBACK_BLANKETS_DYED = new ArrayList<>();
//        ADVENTURE_SADDLES_DYED = new ArrayList<>();
//        ADVENTURE_BLANKETS_DYED = new ArrayList<>();
//        ADVENTURE_BRIDLES_DYED = new ArrayList<>();
//        ADVENTURE_LEG_WRAPS_DYED  = new ArrayList<>();
//        ADVENTURE_BREAST_COLLARS_DYED = new ArrayList<>();
//        ADVENTURE_GIRTH_STRAPS_DYED = new ArrayList<>();
//        CLOTH_ARMOR_DYED = new ArrayList<>();
//        CLOTH_BREAST_COLLARS_DYED = new ArrayList<>();
//        CLOTH_BRIDLES_DYED = new ArrayList<>();
//        CLOTH_GIRTH_STRAPS_DYED = new ArrayList<>();
//        ENGLISH_BRIDLES_BLACK_DYED = new ArrayList<>();
//        ENGLISH_SADDLES_BLACK_DYED = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS_BLACK_DYED = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS_BLACK_DYED = new ArrayList<>();
//        ENGLISH_BRIDLES_BROWN_DYED = new ArrayList<>();
//        ENGLISH_SADDLES_BROWN_DYED = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS_BROWN_DYED = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS_BROWN_DYED = new ArrayList<>();

//        DyeColor[] var0 = DyeColor.values();
//        int var3 = var0.length;
//
//        for (int var2 = 0; var2 < var3; ++var2) {
//            DyeColor color = var0[var2];
//            ADVENTURE_SADDLES_DYED.add(REGISTRY.register("adventure_saddle_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
//                            "adventure")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ADVENTURE_BRIDLES_DYED.add(REGISTRY.register("adventure_bridle_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(true, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color)
//                                    , "western")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_BREAST_COLLARS_DYED.add(REGISTRY.register("adventure_breast_collar_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_GIRTH_STRAPS_DYED.add(REGISTRY.register("adventure_girth_strap_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(true, Collections.emptySet(),
//                                            ColorUtil.ofDyeColor(color),
//                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_BLANKETS_DYED.add(REGISTRY.register("adventure_blanket_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
//                            .withData(new TackTypeData(true, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ADVENTURE_LEG_WRAPS_DYED.add(REGISTRY.register("adventure_leg_wraps_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(64))
//            ));
//            CLOTH_ARMOR_DYED.add(REGISTRY.register("cloth_horse_armor_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
//                            HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(16))
//            ));
//
//            QUARTER_SHEETS_DYED.add(REGISTRY.register("quarter_sheet_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            ENGLISH_SADDLES_BLACK_DYED.add(REGISTRY.register("english_saddle_black_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
//                            "english")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ENGLISH_BREAST_COLLARS_BLACK_DYED.add(REGISTRY.register("english_breast_collar_black_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_BRIDLES_BLACK_DYED.add(REGISTRY.register("english_bridle_black_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color)
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_GIRTH_STRAPS_BLACK_DYED.add(REGISTRY.register("english_girth_strap_black_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            ColorUtil.ofDyeColor(color),
//                                            ColorUtil.ofDyeColor(DyeColor.BLACK)))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            ENGLISH_SADDLES_BROWN_DYED.add(REGISTRY.register("english_saddle_brown_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
//                            "english")).build(), (new Item.Properties()).stacksTo(1))
//            ));
//            ENGLISH_BREAST_COLLARS_BROWN_DYED.add(REGISTRY.register("english_breast_collar_brown_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_BRIDLES_BROWN_DYED.add(REGISTRY.register("english_bridle_brown_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color)
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            ENGLISH_GIRTH_STRAPS_BROWN_DYED.add(REGISTRY.register("english_girth_strap_brown_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            ColorUtil.ofDyeColor(color),
//                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//
//            CLOTH_BREAST_COLLARS_DYED.add(REGISTRY.register("cloth_breast_collar_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
//                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            CLOTH_BRIDLES_DYED.add(REGISTRY.register("cloth_bridle_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color)
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            CLOTH_GIRTH_STRAPS_DYED.add(REGISTRY.register("cloth_girth_strap_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
//                                    new GirthStrapTypeData(false, Collections.emptySet(),
//                                            ColorUtil.ofDyeColor(color),
//                                            ColorUtil.ofDyeColor(color)))
//                            .rackTexture(RackType.SADDLE,
//                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            CLOTH_BITLESS_BRIDLES.add(REGISTRY.register("cloth_bitless_bridle_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
//                            new BridleTypeData(false, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color)
//                                    , "english")).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//
//            BAREBACK_BLANKETS_DYED.add(REGISTRY.register("bareback_blanket_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
//                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
//                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
//                            .withData(new TackTypeData(false, Collections.emptySet(),
//                                    ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//            FLYMASKS.add( REGISTRY.register("flymask_" + color.getName(), () ->
//                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
//                            (false, Collections.emptySet(),  ColorUtil.ofDyeColor(color))).build(),
//                            (new Item.Properties()).stacksTo(16))
//            ));
//        }
    }
}
