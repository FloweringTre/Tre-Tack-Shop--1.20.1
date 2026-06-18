package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.*;
import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
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

/// ════════════════════════════════════ SINGLE ITEMS ════════════════════════════════════ ///
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
    public static final RegistryObject<Item> PAW_PRINT;
    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;

/// ════════════════════════════════════ ONE OFF TACK PIECES ════════════════════════════════════ ///
    public static final RegistryObject<TackItem> PELHAM_BRIDLE_BLACK;
    public static final RegistryObject<TackItem> PELHAM_BRIDLE_BROWN;
    public static final RegistryObject<TackItem> MOON_BRIDLE_DOUBLE;
    public static final RegistryObject<TackItem> MEDIEVAL_BRIDLE_BLACK;
    public static final RegistryObject<TackItem> MEDIEVAL_BRIDLE_BROWN;

    public static final RegistryObject<TackItem> BITLESS_BRIDLE;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_MOON;
    public static final RegistryObject<TackItem> BAREBACK_BLANKET;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_MOON;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_BROWN;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BROWN_MOON;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_BROWN_MOON;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_BEIGE;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BEIGE_MOON;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_BEIGE_MOON;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_WHITE;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_BLACK_MOON;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_WHITE_MOON;

    public static final RegistryObject<TackItem> DRESSAGE_SADDLE;
    public static final RegistryObject<TackItem> DRESSAGE_BLANKET;
    public static final RegistryObject<TackItem> DRESSAGE_GIRTH_STRAP;

    public static final RegistryObject<TackItem> RACING_SADDLE_BROWN;
    public static final RegistryObject<TackItem> RACING_SADDLE_BLACK;

    public static final RegistryObject<TackItem> HUNTER_BLANKET;

    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_TRANS;
    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_TRANS;
    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_TRANS;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_TRANS;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_TRANS;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_TRANS;

/// ════════════════════════════════════ ONE OFF AWARD PIECES ════════════════════════════════════ ///
    public static final RegistryObject<Item> MEDAL_1;
    public static final RegistryObject<Item> MEDAL_2;
    public static final RegistryObject<Item> MEDAL_3;

    public static  final RegistryObject<Item> SIGN_COVER_GRAND;
    public static  final RegistryObject<Item> SIGN_COVER_RESERVE;

    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;

    public static final RegistryObject<Item> FIRST_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> FIRST_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> FIRST_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> FIRST_ROSETTE;
    public static final RegistryObject<Item> SECOND_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> SECOND_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> SECOND_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> SECOND_ROSETTE;
    public static final RegistryObject<Item> THIRD_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> THIRD_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> THIRD_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> THIRD_ROSETTE;

    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> FLORAL_GOLD;
    public static final RegistryObject<Item> FLORAL_SILVER;
    public static final RegistryObject<Item> FLORAL_BRONZE;
    public static final RegistryObject<Item> SUN_TROPHY;
    public static final RegistryObject<Item> MOON_TROPHY;

    public static  final RegistryObject<Item> SIGN_COVER_HEART_RED;
    public static  final RegistryObject<Item> SIGN_COVER_HEART_PINK;
    public static  final RegistryObject<Item> SIGN_COVER_HEART_BLUE;
    public static  final RegistryObject<Item> SIGN_COVER_SNOWFLAKE;

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
    public static final RegistryObject<Item> FLAG_MORPHO;

    public static  final RegistryObject<Item> SIGN_COVER_MORPHO;
    public static final RegistryObject<Item> RILEY_SIGN_COVER_MORPHO;
    public static final RegistryObject<Item> FABRIC_SIGN_COVER_MORPHO;

    public static final RegistryObject<Item> MORPHO_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MORPHO_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MORPHO_ROSETTE;

    public static final RegistryObject<TackItem> HALTER_MORPHO;
    public static final RegistryObject<TackItem> FLYMASK_MORPHO;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_MORPHO;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_MORPHO;
    public static final RegistryObject<TackItem> CLOTH_HORSE_ARMOR_MORPHO;
    public static final RegistryObject<TackItem> AMETHYST_HORSE_ARMOR_MORPHO;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_BLANKET_MORPHO;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_BLANKET_MORPHO;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_MORPHO;
    public static final RegistryObject<TackItem> QUARTER_SHEET_MORPHO;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_MORPHO;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_MORPHO;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_MORPHO;
    public static final RegistryObject<TackItem> BAREBACK_BLANKET_MORPHO;

/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
    public static final RegistryObject<Item> FLAG_MONARCH;

    public static  final RegistryObject<Item> SIGN_COVER_MONARCH;
    public static final RegistryObject<Item> RILEY_SIGN_COVER_MONARCH;
    public static final RegistryObject<Item> FABRIC_SIGN_COVER_MONARCH;

    public static final RegistryObject<Item> MONARCH_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> MONARCH_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> MONARCH_ROSETTE;

    public static final RegistryObject<TackItem> HALTER_MONARCH;
    public static final RegistryObject<TackItem> FLYMASK_MONARCH;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_MONARCH;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_MONARCH;
    public static final RegistryObject<TackItem> CLOTH_HORSE_ARMOR_MONARCH;
    public static final RegistryObject<TackItem> AMETHYST_HORSE_ARMOR_MONARCH;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_BLANKET_MONARCH;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_BLANKET_MONARCH;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_MONARCH;
    public static final RegistryObject<TackItem> QUARTER_SHEET_MONARCH;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_MONARCH;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_MONARCH;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_MONARCH;
    public static final RegistryObject<TackItem> BAREBACK_BLANKET_MONARCH;

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
    public static final RegistryObject<Item> FLAG_RAINBOW;

    public static final RegistryObject<Item> SIGN_COVER_RILEY_RAINBOW;
    public static final RegistryObject<Item> SIGN_COVER_FABRIC_RAINBOW;
    public static final RegistryObject<Item> SIGN_COVER_FLORAL_RAINBOW;
    public static final RegistryObject<Item> SIGN_COVER_SWIRL_RAINBOW;
    public static final RegistryObject<Item> SIGN_COVER_LOOPED_RAINBOW;
    public static final RegistryObject<Item> SIGN_COVER_CHECKERED_RAINBOW;

    public static final RegistryObject<Item> RAINBOW_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> RAINBOW_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> RAINBOW_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> RAINBOW_ROSETTE;

    public static final RegistryObject<TackItem> HALTER_RAINBOW;
    public static final RegistryObject<TackItem> FLYMASK_RAINBOW;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_RAINBOW;
    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_RAINBOW;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<TackItem> IRON_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<TackItem> AMETHYST_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_BLANKET_RAINBOW;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<TackItem> QUARTER_SHEET_BLACK_RAINBOW;
    public static final RegistryObject<TackItem> QUARTER_SHEET_WHITE_RAINBOW;
    public static final RegistryObject<TackItem> CLOTH_BITLESS_BRIDLE_RAINBOW;
    public static final RegistryObject<TackItem> BAREBACK_BLANKET_RAINBOW;


/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
    public static final RegistryObject<Item> FLAG_HOUND;

    public static final RegistryObject<Item> RILEY_SIGN_COVER_HOUND;
    public static final RegistryObject<Item> FABRIC_SIGN_COVER_HOUND;

    public static final RegistryObject<Item> HOUND_RIBBON_THREE_TAILS;
    public static final RegistryObject<Item> HOUND_RIBBON_TWO_TAILS;
    public static final RegistryObject<Item> HOUND_RIBBON_ONE_TAIL;
    public static final RegistryObject<Item> HOUND_ROSETTE;

    public static final RegistryObject<TackItem> HALTER_HOUND;
    public static final RegistryObject<TackItem> FLYMASK_HOUND;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_HOUND;
    public static final RegistryObject<TackItem> PASTURE_BLANKET_HOUND_ARMORED;
    public static final RegistryObject<TackItem> ADVENTURE_SADDLE_HOUND;
    public static final RegistryObject<TackItem> ADVENTURE_BRIDLE_HOUND;
    public static final RegistryObject<TackItem> ADVENTURE_BREAST_COLLAR_HOUND;
    public static final RegistryObject<TackItem> ADVENTURE_GIRTH_STRAP_HOUND;
    public static final RegistryObject<TackItem> ADVENTURE_BLANKET_HOUND;
    public static final RegistryObject<TackItem> ADVENTURE_LEG_WRAPS_HOUND;
    public static final RegistryObject<TackItem> CLOTH_HORSE_ARMOR_HOUND;
    public static final RegistryObject<TackItem> AMETHYST_HORSE_ARMOR_HOUND;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_HOUND;
    public static final RegistryObject<TackItem> WESTERN_SADDLE_HOUND;
    public static final RegistryObject<TackItem> WESTERN_BRIDLE_HOUND;
    public static final RegistryObject<TackItem> WESTERN_BREAST_COLLAR_HOUND;
    public static final RegistryObject<TackItem> WESTERN_GIRTH_STRAP_HOUND;
    public static final RegistryObject<TackItem> WESTERN_BLANKET_HOUND;
    public static final RegistryObject<TackItem> WESTERN_LEG_WRAPS_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_SADDLE_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_BRIDLE_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_BREAST_COLLAR_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_GIRTH_STRAP_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_BLANKET_HOUND;
    public static final RegistryObject<TackItem> ENGLISH_LEG_WRAPS_HOUND;
    public static final RegistryObject<TackItem> QUARTER_SHEET_HOUND;
    public static final RegistryObject<TackItem> BAREBACK_SADDLE_HOUND;
    public static final RegistryObject<TackItem> BITLESS_BRIDLE_HOUND;
    public static final RegistryObject<TackItem> BAREBACK_GIRTH_STRAP_HOUND;
    public static final RegistryObject<TackItem> BAREBACK_BLANKET_HOUND;


/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
    public static final List<RegistryObject<Item>> DYES;
    public static final List<RegistryObject<Item>> FLAGS;
    public static final List<RegistryObject<Item>> FLAGS_BUTTERFLY;

    public static final List<RegistryObject<Item>> SIGN_COVERS_RILEY;
    public static final List<RegistryObject<Item>> SIGN_COVERS_FABRIC;
    public static final List<RegistryObject<Item>> SIGN_COVERS_FLORAL;
    public static final List<RegistryObject<Item>> SIGN_COVERS_SWIRL;
    public static final List<RegistryObject<Item>> SIGN_COVERS_LOOPED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_CHECKERED;

    public static final List<RegistryObject<Item>> TRE_RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> TRE_RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> TRE_ROSETTE;

    public static final List<RegistryObject<Item>> EGG_TROPHY_THICK;
    public static final List<RegistryObject<Item>> EGG_TROPHY_THIN;
    public static final List<RegistryObject<Item>> EGG_TROPHY_CHEVRON;

    public static final List<RegistryObject<TackItem>> HALTERS;
    public static final List<RegistryObject<TackItem>> FLYMASKS;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<TackItem>> PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_SADDLES;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BRIDLES;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<TackItem>> ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> CLOTH_HORSE_ARMORS;
//    public static final List<RegistryObject<TackItem>> AMETHYST_HORSE_ARMORS;
    public static final List<RegistryObject<SaddlebagItem>> SADDLE_BAGS;
    public static final List<RegistryObject<TackItem>> WESTERN_SADDLES;
    public static final List<RegistryObject<TackItem>> WESTERN_BRIDLES;
    public static final List<RegistryObject<TackItem>> WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> WESTERN_BLANKETS;
    public static final List<RegistryObject<TackItem>> WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BLACK;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BROWN;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BLACK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BROWN;
    public static final List<RegistryObject<TackItem>> CLOTH_BRIDLES;
    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BLACK;
    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BROWN;
    public static final List<RegistryObject<TackItem>> CLOTH_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BLACK;
    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BROWN;
    public static final List<RegistryObject<TackItem>> CLOTH_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<TackItem>> ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> QUARTER_SHEETS;
    public static final List<RegistryObject<TackItem>> BAREBACK_SADDLES;
    public static final List<RegistryObject<TackItem>> CLOTH_BITLESS_BRIDLES;
    public static final List<RegistryObject<TackItem>> BAREBACK_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> BAREBACK_BLANKETS;

/// ════════════════════════════════════ CRAFTABLE DYED (SWEM Colors) ════════════════════════════════════ ///
    public static final List<RegistryObject<Item>> FLAGS_DYED;

    public static final List<RegistryObject<Item>> SIGN_COVERS_RILEY_DYED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_FABRIC_DYED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_FLORAL_DYED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_SWIRL_DYED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_LOOPED_DYED;
    public static final List<RegistryObject<Item>> SIGN_COVERS_CHECKERED_DYED;

    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;

    public static final List<RegistryObject<Item>> EGG_TROPHY_THICK_DYED;
    public static final List<RegistryObject<Item>> EGG_TROPHY_THIN_DYED;
    public static final List<RegistryObject<Item>> EGG_TROPHY_CHEVRON_DYED;

    public static final List<RegistryObject<TackItem>> FLYMASKS_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_SADDLES_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BRIDLES_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BREAST_COLLARS_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_GIRTH_STRAPS_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_BLANKETS_DYED;
    public static final List<RegistryObject<TackItem>> ADVENTURE_LEG_WRAPS_DYED;
    public static final List<RegistryObject<TackItem>> CLOTH_HORSE_ARMORS_DYED;
//    public static final List<RegistryObject<TackItem>> AMETHYST_HORSE_ARMORS_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BLACK_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_SADDLES_BROWN_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BLACK_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_BRIDLES_BROWN_DYED;
    public static final List<RegistryObject<TackItem>> CLOTH_BRIDLES_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BLACK_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_BREAST_COLLARS_BROWN_DYED;
    public static final List<RegistryObject<TackItem>> CLOTH_BREAST_COLLARS_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BLACK_DYED;
    public static final List<RegistryObject<TackItem>> ENGLISH_GIRTH_STRAPS_BROWN_DYED;
    public static final List<RegistryObject<TackItem>> CLOTH_GIRTH_STRAPS_DYED;
    public static final List<RegistryObject<TackItem>> QUARTER_SHEETS_DYED;
    public static final List<RegistryObject<TackItem>> BAREBACK_SADDLES_DYED;
    public static final List<RegistryObject<TackItem>> CLOTH_BITLESS_BRIDLES_DYED;
    public static final List<RegistryObject<TackItem>> BAREBACK_GIRTH_STRAPS_DYED;
    public static final List<RegistryObject<TackItem>> BAREBACK_BLANKETS_DYED;

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");

/// ════════════════════════════════════ SINGLE ITEMS ════════════════════════════════════ ///
        BUTTERFLY = REGISTRY.register("butterfly",
                () -> new Item(new Item.Properties()));
        BUTTERFLY_MONARCH = REGISTRY.register("butterfly_monarch",
                () -> new Item(new Item.Properties()));
        PAW_PRINT = REGISTRY.register("paw_print",
                () -> new Item(new Item.Properties()));
        RAINBOW_INA_BOTTLE = REGISTRY.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties()));

/// ════════════════════════════════════ ONE OFF TACK PIECES ════════════════════════════════════ ///
        PELHAM_BRIDLE_BLACK = REGISTRY.register("pelham_bridle_black",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        PELHAM_BRIDLE_BROWN = REGISTRY.register("pelham_bridle_brown",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        MOON_BRIDLE_DOUBLE = REGISTRY.register("moon_bridle_double",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        MEDIEVAL_BRIDLE_BLACK = REGISTRY.register("medieval_bridle_black",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        MEDIEVAL_BRIDLE_BROWN = REGISTRY.register("medieval_bridle_brown",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));

        BITLESS_BRIDLE = REGISTRY.register("english_bridle_bitless",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_BLACK_MOON = REGISTRY.register("bareback_saddle_black_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BAREBACK_BLANKET = REGISTRY.register("bareback_blanket",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MOON = REGISTRY.register("bareback_girth_strap_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                                        Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_BROWN = REGISTRY.register("english_bridle_bitless_brown",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_BROWN_MOON = REGISTRY.register("bareback_saddle_brown_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_BROWN_MOON = REGISTRY.register("bareback_girth_strap_brown_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_BEIGE = REGISTRY.register("english_bridle_bitless_beige",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_BEIGE_MOON = REGISTRY.register("bareback_saddle_beige_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_BEIGE_MOON = REGISTRY.register("bareback_girth_strap_beige_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2]),
                                        Color.ofRGB(tretackcolors[22][0], tretackcolors[22][1], tretackcolors[22][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_WHITE = REGISTRY.register("english_bridle_bitless_white",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_MOON = REGISTRY.register("bareback_saddle_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_WHITE_MOON = REGISTRY.register("bareback_girth_strap_white_moon",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));

        DRESSAGE_SADDLE = REGISTRY.register("dressage_saddle",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        DRESSAGE_BLANKET = REGISTRY.register("dressage_blanket",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/dressage_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/dressage_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        DRESSAGE_GIRTH_STRAP = REGISTRY.register("dressage_girth_strap",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        Color.ofRGB(tretackcolors[0][0], tretackcolors[0][1], tretackcolors[0][2]),
                                        Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2])))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));

        RACING_SADDLE_BROWN = REGISTRY.register("racing_saddle_brown",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[16][0], tretackcolors[16][1], tretackcolors[16][2]),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));
        RACING_SADDLE_BLACK = REGISTRY.register("racing_saddle_black",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[15][0], tretackcolors[15][1], tretackcolors[15][2]),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));

        HUNTER_BLANKET = REGISTRY.register("hunter_blanket",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hunter_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hunter_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));

        ADVENTURE_BRIDLE_TRANS = REGISTRY.register("adventure_bridle_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_SADDLE_TRANS = REGISTRY.register("adventure_saddle_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BLANKET_TRANS = REGISTRY.register("adventure_blanket_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/trans_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/trans_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_TRANS = REGISTRY.register("adventure_girth_strap_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/trans_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_LEG_WRAPS_TRANS = REGISTRY.register("adventure_leg_wraps_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_TRANS = REGISTRY.register("adventure_breast_collar_trans",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));


/// ════════════════════════════════════ ONE OFF AWARD PIECES ════════════════════════════════════ ///
        MEDAL_1 =  REGISTRY.register("medal_1",
                () -> new Item(new Item.Properties() ));
        MEDAL_2 =  REGISTRY.register("medal_2",
                () -> new Item(new Item.Properties() ));
        MEDAL_3 =  REGISTRY.register("medal_3",
                () -> new Item(new Item.Properties() ));

        SIGN_COVER_GRAND = REGISTRY.register("sign_cover_champ",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_RESERVE = REGISTRY.register("sign_cover_champ_res",
                () -> new Item(new Item.Properties()));

        RIBBON_THREE_TAILS_GRAND =  REGISTRY.register("ribbon_three_tails_grand",
                () -> new Item(new Item.Properties() ));
        RIBBON_THREE_TAILS_RESERVE =  REGISTRY.register("ribbon_three_tails_reserve",
                () -> new Item(new Item.Properties() ));

        FIRST_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_first",
                () -> new Item(new Item.Properties()));
        FIRST_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_first",
                () -> new Item(new Item.Properties()));
        FIRST_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_first",
                () -> new Item(new Item.Properties()));
        FIRST_ROSETTE = REGISTRY.register("rosette_first",
                () -> new Item(new Item.Properties()));
        SECOND_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_second",
                () -> new Item(new Item.Properties()));
        SECOND_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_second",
                () -> new Item(new Item.Properties()));
        SECOND_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_second",
                () -> new Item(new Item.Properties()));
        SECOND_ROSETTE = REGISTRY.register("rosette_second",
                () -> new Item(new Item.Properties()));
        THIRD_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_third",
                () -> new Item(new Item.Properties()));
        THIRD_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_third",
                () -> new Item(new Item.Properties()));
        THIRD_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_third",
                () -> new Item(new Item.Properties()));
        THIRD_ROSETTE = REGISTRY.register("rosette_third",
                () -> new Item(new Item.Properties()));

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

        SIGN_COVER_HEART_RED = REGISTRY.register("sign_cover_heart_red",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_HEART_PINK = REGISTRY.register("sign_cover_heart_pink",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_HEART_BLUE = REGISTRY.register("sign_cover_heart_blue",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_SNOWFLAKE = REGISTRY.register("sign_cover_snowflake",
                () -> new Item(new Item.Properties()));

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
        FLAG_MORPHO = REGISTRY.register("flag_morpho",
                () -> new Item(new Item.Properties()));

        SIGN_COVER_MORPHO = REGISTRY.register("sign_cover_morpho",
                () -> new Item(new Item.Properties()));
        RILEY_SIGN_COVER_MORPHO = REGISTRY.register("sign_cover_riley_morpho",
                () -> new Item(new Item.Properties()));
        FABRIC_SIGN_COVER_MORPHO = REGISTRY.register("sign_cover_fabric_morpho",
                () -> new Item(new Item.Properties()));

        MORPHO_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_morpho",
                () -> new Item(new Item.Properties()));
        MORPHO_ROSETTE = REGISTRY.register("rosette_morpho",
                () -> new Item(new Item.Properties()));

        HALTER_MORPHO = REGISTRY.register("halter_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        FLYMASK_MORPHO = REGISTRY.register("flymask_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_MORPHO = REGISTRY.register("pasture_blanket_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_morpho_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_morpho_5_long.png"))
                        .build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_SADDLE_MORPHO = REGISTRY.register("adventure_saddle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BRIDLE_MORPHO = REGISTRY.register("adventure_bridle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_MORPHO = REGISTRY.register("adventure_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_MORPHO = REGISTRY.register("adventure_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_adventure.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BLANKET_MORPHO = REGISTRY.register("adventure_blanket_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_LEG_WRAPS_MORPHO = REGISTRY.register("adventure_leg_wraps_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        CLOTH_HORSE_ARMOR_MORPHO = REGISTRY.register("cloth_horse_armor_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        AMETHYST_HORSE_ARMOR_MORPHO = REGISTRY.register("amethyst_horse_armor_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        SADDLE_BAG_MORPHO = REGISTRY.register("saddle_bag_morpho",
                () -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_SADDLE_MORPHO = REGISTRY.register("western_saddle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        WESTERN_BRIDLE_MORPHO = REGISTRY.register("western_bridle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BREAST_COLLAR_MORPHO = REGISTRY.register("western_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_GIRTH_STRAP_MORPHO = REGISTRY.register("western_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_western.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BLANKET_MORPHO = REGISTRY.register("western_blanket_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_LEG_WRAPS_MORPHO = REGISTRY.register("western_leg_wraps_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_SADDLE_MORPHO = REGISTRY.register("english_saddle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));
        ENGLISH_BRIDLE_MORPHO = REGISTRY.register("english_bridle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BREAST_COLLAR_MORPHO = REGISTRY.register("english_breast_collar_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_GIRTH_STRAP_MORPHO = REGISTRY.register("english_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/morpho_girth_strap_english.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BLANKET_MORPHO = REGISTRY.register("english_blanket_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_LEG_WRAPS_MORPHO = REGISTRY.register("english_leg_wraps_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        QUARTER_SHEET_MORPHO = REGISTRY.register("quarter_sheet_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_MORPHO = REGISTRY.register("bareback_saddle_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_MORPHO = REGISTRY.register("english_bridle_bitless_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MORPHO = REGISTRY.register("bareback_girth_strap_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_BLANKET_MORPHO = REGISTRY.register("bareback_blanket_morpho",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/morpho_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/morpho_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));


/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
        FLAG_MONARCH = REGISTRY.register("flag_monarch",
                () -> new Item(new Item.Properties()));

        SIGN_COVER_MONARCH = REGISTRY.register("sign_cover_monarch",
                () -> new Item(new Item.Properties()));
        RILEY_SIGN_COVER_MONARCH = REGISTRY.register("sign_cover_riley_monarch",
                () -> new Item(new Item.Properties()));
        FABRIC_SIGN_COVER_MONARCH = REGISTRY.register("sign_cover_fabric_monarch",
                () -> new Item(new Item.Properties()));

        MONARCH_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_monarch",
                () -> new Item(new Item.Properties()));
        MONARCH_ROSETTE = REGISTRY.register("rosette_monarch",
                () -> new Item(new Item.Properties()));

        HALTER_MONARCH = REGISTRY.register("halter_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        FLYMASK_MONARCH = REGISTRY.register("flymask_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_MONARCH = REGISTRY.register("pasture_blanket_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_monarch_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_monarch_5_long.png"))
                        .build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_SADDLE_MONARCH = REGISTRY.register("adventure_saddle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BRIDLE_MONARCH = REGISTRY.register("adventure_bridle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_MONARCH = REGISTRY.register("adventure_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_MONARCH = REGISTRY.register("adventure_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_adventure.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BLANKET_MONARCH = REGISTRY.register("adventure_blanket_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_LEG_WRAPS_MONARCH = REGISTRY.register("adventure_leg_wraps_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        CLOTH_HORSE_ARMOR_MONARCH = REGISTRY.register("cloth_horse_armor_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        AMETHYST_HORSE_ARMOR_MONARCH = REGISTRY.register("amethyst_horse_armor_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        SADDLE_BAG_MONARCH = REGISTRY.register("saddle_bag_monarch",
                () -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_SADDLE_MONARCH = REGISTRY.register("western_saddle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        WESTERN_BRIDLE_MONARCH = REGISTRY.register("western_bridle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BREAST_COLLAR_MONARCH = REGISTRY.register("western_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_GIRTH_STRAP_MONARCH = REGISTRY.register("western_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_western.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BLANKET_MONARCH = REGISTRY.register("western_blanket_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_LEG_WRAPS_MONARCH = REGISTRY.register("western_leg_wraps_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_SADDLE_MONARCH = REGISTRY.register("english_saddle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));
        ENGLISH_BRIDLE_MONARCH = REGISTRY.register("english_bridle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BREAST_COLLAR_MONARCH = REGISTRY.register("english_breast_collar_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_GIRTH_STRAP_MONARCH = REGISTRY.register("english_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/monarch_girth_strap_english.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BLANKET_MONARCH = REGISTRY.register("english_blanket_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_LEG_WRAPS_MONARCH = REGISTRY.register("english_leg_wraps_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        QUARTER_SHEET_MONARCH = REGISTRY.register("quarter_sheet_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_MONARCH = REGISTRY.register("bareback_saddle_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_MONARCH = REGISTRY.register("english_bridle_bitless_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_MONARCH = REGISTRY.register("bareback_girth_strap_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_BLANKET_MONARCH = REGISTRY.register("bareback_blanket_monarch",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/monarch_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/monarch_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));


/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
        FLAG_RAINBOW = REGISTRY.register("flag_rainbow",
                () -> new Item(new Item.Properties()));

        SIGN_COVER_RILEY_RAINBOW = REGISTRY.register("sign_cover_riley_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_FABRIC_RAINBOW = REGISTRY.register("sign_cover_fabric_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_FLORAL_RAINBOW = REGISTRY.register("sign_cover_floral_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_SWIRL_RAINBOW = REGISTRY.register("sign_cover_swirl_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_LOOPED_RAINBOW = REGISTRY.register("sign_cover_looped_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_CHECKERED_RAINBOW = REGISTRY.register("sign_cover_checkered_rainbow",
                () -> new Item(new Item.Properties()));

        RAINBOW_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_rainbow",
                () -> new Item(new Item.Properties()));
        RAINBOW_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_rainbow",
                () -> new Item(new Item.Properties()));
        RAINBOW_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_rainbow",
                () -> new Item(new Item.Properties()));
        RAINBOW_ROSETTE = REGISTRY.register("rosette_rainbow",
                () -> new Item(new Item.Properties()));

        HALTER_RAINBOW =  REGISTRY.register("halter_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        FLYMASK_RAINBOW =  REGISTRY.register("flymask_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_RAINBOW =  REGISTRY.register("pasture_blanket_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_5_long.png"))
                        .build(), (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_RAINBOW_ARMORED =  REGISTRY.register("pasture_blanket_rainbow_armored",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_rainbow_armored_5_long.png"))
                        .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_SADDLE_RAINBOW =  REGISTRY.register("adventure_saddle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "adventure")).build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BRIDLE_RAINBOW = REGISTRY.register("adventure_bridle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_RAINBOW =  REGISTRY.register("adventure_breast_collar_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = REGISTRY.register("adventure_girth_strap_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_adventure.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BLANKET_RAINBOW =  REGISTRY.register("adventure_blanket_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_LEG_WRAPS_RAINBOW =  REGISTRY.register("adventure_leg_wraps_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        SADDLE_BAG_RAINBOW = REGISTRY.register("saddle_bag_rainbow",
                () -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        (new Item.Properties()).stacksTo(64)));
        IRON_HORSE_ARMOR_RAINBOW = REGISTRY.register("iron_horse_armor_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.IRON.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        AMETHYST_HORSE_ARMOR_RAINBOW = REGISTRY.register("amethyst_horse_armor_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        WESTERN_SADDLE_RAINBOW =  REGISTRY.register("western_saddle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        WESTERN_BRIDLE_RAINBOW = REGISTRY.register("western_bridle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2])
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BREAST_COLLAR_RAINBOW =  REGISTRY.register("western_breast_collar_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[21][0], tretackcolors[21][1], tretackcolors[21][2]))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_GIRTH_STRAP_RAINBOW = REGISTRY.register("western_girth_strap_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_western.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BLANKET_RAINBOW =  REGISTRY.register("western_blanket_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_LEG_WRAPS_RAINBOW =  REGISTRY.register("western_leg_wraps_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_SADDLE_RAINBOW =  REGISTRY.register("english_saddle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));
        ENGLISH_BRIDLE_RAINBOW = REGISTRY.register("english_bridle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2])
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BREAST_COLLAR_RAINBOW =  REGISTRY.register("english_breast_collar_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_GIRTH_STRAP_RAINBOW = REGISTRY.register("english_girth_strap_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/rainbow_girth_strap_english.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BLANKET_RAINBOW =  REGISTRY.register("english_blanket_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_LEG_WRAPS_RAINBOW =  REGISTRY.register("english_leg_wraps_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        QUARTER_SHEET_BLACK_RAINBOW = REGISTRY.register("quarter_sheet_black_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]))).build(),
                        (new Item.Properties()).stacksTo(64)));
        QUARTER_SHEET_WHITE_RAINBOW = REGISTRY.register("quarter_sheet_white_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        CLOTH_BITLESS_BRIDLE_RAINBOW = REGISTRY.register("cloth_bitless_bridle_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_BLANKET_RAINBOW = REGISTRY.register("bareback_blanket_rainbow",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/rainbow_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/rainbow_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));


/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
        FLAG_HOUND = REGISTRY.register("flag_hound",
                () -> new Item(new Item.Properties()));

        RILEY_SIGN_COVER_HOUND = REGISTRY.register("sign_cover_riley_hound",
                () -> new Item(new Item.Properties()));
        FABRIC_SIGN_COVER_HOUND = REGISTRY.register("sign_cover_fabric_hound",
                () -> new Item(new Item.Properties()));

        HOUND_RIBBON_THREE_TAILS = REGISTRY.register("ribbon_three_tails_hound",
                () -> new Item(new Item.Properties()));
        HOUND_RIBBON_TWO_TAILS = REGISTRY.register("ribbon_two_tails_hound",
                () -> new Item(new Item.Properties()));
        HOUND_RIBBON_ONE_TAIL = REGISTRY.register("ribbon_one_tail_hound",
                () -> new Item(new Item.Properties()));
        HOUND_ROSETTE = REGISTRY.register("rosette_hound",
                () -> new Item(new Item.Properties()));

        HALTER_HOUND = REGISTRY.register("halter_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        FLYMASK_HOUND = REGISTRY.register("flymask_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                        (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_HOUND = REGISTRY.register("pasture_blanket_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                new PastureBlanketTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_5_long.png"))
                        .build(), (new Item.Properties()).stacksTo(64)));
        PASTURE_BLANKET_HOUND_ARMORED =  REGISTRY.register("pasture_blanket_hound_armored",
                () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                        .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_armored_3_short.png"))
                        .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                ModRef.res("textures/entity/rack/pasture_blanket/rack_pasture_blanket_hound_armored_5_long.png"))
                        .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_SADDLE_HOUND = REGISTRY.register("adventure_saddle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "adventure")).build(), (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BRIDLE_HOUND = REGISTRY.register("adventure_bridle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BREAST_COLLAR_HOUND = REGISTRY.register("adventure_breast_collar_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_GIRTH_STRAP_HOUND = REGISTRY.register("adventure_girth_strap_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(true, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_adventure.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_BLANKET_HOUND = REGISTRY.register("adventure_blanket_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_adventure_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_adventure_blanket.png"))
                        .withData(new TackTypeData(true, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ADVENTURE_LEG_WRAPS_HOUND = REGISTRY.register("adventure_leg_wraps_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        CLOTH_HORSE_ARMOR_HOUND = REGISTRY.register("cloth_horse_armor_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        AMETHYST_HORSE_ARMOR_HOUND = REGISTRY.register("amethyst_horse_armor_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                        true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64)));
        SADDLE_BAG_HOUND = REGISTRY.register("saddle_bag_hound",
                () -> new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                        true, Collections.emptySet(),
                        ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_SADDLE_HOUND = REGISTRY.register("western_saddle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        WESTERN_BRIDLE_HOUND = REGISTRY.register("western_bridle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "western")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BREAST_COLLAR_HOUND = REGISTRY.register("western_breast_collar_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_GIRTH_STRAP_HOUND = REGISTRY.register("western_girth_strap_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_western.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_BLANKET_HOUND = REGISTRY.register("western_blanket_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_western_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_western_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        WESTERN_LEG_WRAPS_HOUND = REGISTRY.register("western_leg_wraps_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_SADDLE_HOUND = REGISTRY.register("english_saddle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                        "english")).build(), (new Item.Properties()).stacksTo(64)));
        ENGLISH_BRIDLE_HOUND = REGISTRY.register("english_bridle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BREAST_COLLAR_HOUND = REGISTRY.register("english_breast_collar_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_GIRTH_STRAP_HOUND = REGISTRY.register("english_girth_strap_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/hound_girth_strap_english.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_BLANKET_HOUND = REGISTRY.register("english_blanket_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_english_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_english_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        ENGLISH_LEG_WRAPS_HOUND = REGISTRY.register("english_leg_wraps_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        QUARTER_SHEET_HOUND = REGISTRY.register("quarter_sheet_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                        false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_SADDLE_HOUND = REGISTRY.register("bareback_saddle_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                        false, Collections.emptySet(), Color.ofRGB(tretackcolors[20][0], tretackcolors[20][1], tretackcolors[20][2]),
                        "western")).build(), (new Item.Properties()).stacksTo(64)));
        BITLESS_BRIDLE_HOUND = REGISTRY.register("english_bridle_bitless_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                        new BridleTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE)
                                , "english")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_GIRTH_STRAP_HOUND = REGISTRY.register("bareback_girth_strap_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                new GirthStrapTypeData(false, Collections.emptySet(),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE),
                                        ColorUtil.ofDyeColor(DyeColor.WHITE)))
                        .rackTexture(RackType.SADDLE,
                                ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                        (new Item.Properties()).stacksTo(64)));
        BAREBACK_BLANKET_HOUND = REGISTRY.register("bareback_blanket_hound",
                () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                        .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/hound_bareback_blanket.png"))
                        .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/hound_bareback_blanket.png"))
                        .withData(new TackTypeData(false, Collections.emptySet(),
                                ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                        (new Item.Properties()).stacksTo(64)));



/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
        DYES = new ArrayList<>();
        FLAGS = new ArrayList<>();
        FLAGS_BUTTERFLY = new ArrayList<>();

        SIGN_COVERS_RILEY = new ArrayList<>();
        SIGN_COVERS_FABRIC = new ArrayList<>();
        SIGN_COVERS_FLORAL = new ArrayList<>();
        SIGN_COVERS_SWIRL = new ArrayList<>();
        SIGN_COVERS_LOOPED = new ArrayList<>();
        SIGN_COVERS_CHECKERED = new ArrayList<>();

        TRE_RIBBON_THREE_TAILS = new ArrayList<>();
        TRE_RIBBON_TWO_TAILS = new ArrayList<>();
        TRE_RIBBON_ONE_TAIL = new ArrayList<>();
        TRE_ROSETTE = new ArrayList<>();

        EGG_TROPHY_THICK = new ArrayList<>();
        EGG_TROPHY_THIN = new ArrayList<>();
        EGG_TROPHY_CHEVRON = new ArrayList<>();

        HALTERS = new ArrayList<>();
        FLYMASKS = new ArrayList<>();
        PASTURE_BLANKETS = new ArrayList<>();
        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        ADVENTURE_SADDLES = new ArrayList<>();
        ADVENTURE_BRIDLES = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        ADVENTURE_BLANKETS = new ArrayList<>();
        ADVENTURE_LEG_WRAPS = new ArrayList<>();
        CLOTH_HORSE_ARMORS = new ArrayList<>();
//        AMETHYST_HORSE_ARMORS = new ArrayList<>();
        SADDLE_BAGS = new ArrayList<>();
        WESTERN_SADDLES = new ArrayList<>();
        WESTERN_BRIDLES = new ArrayList<>();
        WESTERN_BREAST_COLLARS = new ArrayList<>();
        WESTERN_GIRTH_STRAPS = new ArrayList<>();
        WESTERN_BLANKETS = new ArrayList<>();
        WESTERN_LEG_WRAPS = new ArrayList<>();
        ENGLISH_SADDLES_BLACK = new ArrayList<>();
        ENGLISH_SADDLES_BROWN = new ArrayList<>();
        ENGLISH_BRIDLES_BLACK = new ArrayList<>();
        ENGLISH_BRIDLES_BROWN = new ArrayList<>();
        CLOTH_BRIDLES = new ArrayList<>();
        ENGLISH_BREAST_COLLARS_BLACK = new ArrayList<>();
        ENGLISH_BREAST_COLLARS_BROWN = new ArrayList<>();
        CLOTH_BREAST_COLLARS = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS_BLACK = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS_BROWN = new ArrayList<>();
        CLOTH_GIRTH_STRAPS = new ArrayList<>();
        ENGLISH_BLANKETS = new ArrayList<>();
        ENGLISH_LEG_WRAPS = new ArrayList<>();
        QUARTER_SHEETS = new ArrayList<>();
        BAREBACK_SADDLES = new ArrayList<>();
        CLOTH_BITLESS_BRIDLES = new ArrayList<>();
        BAREBACK_GIRTH_STRAPS = new ArrayList<>();
        BAREBACK_BLANKETS = new ArrayList<>();

        int var1 = 15;

        var rContext = new Object() {
            int var2 = 1;
        };
        var rEngBlackColor = new Object() {
            final int varE = 1;
        };
        var rEngBrownColor = new Object() {
            final int varEO = 1;
        };
        var rWestColor = new Object() {
            final int varW = 1;
        };

        while (rContext.var2 < var1) {
            int temp_english_black_color_value = rEngBlackColor.varE;
            int temp_western_color_value = rWestColor.varW;
            int temp_english_brown_color_value = rEngBrownColor.varEO;
            int counter = rContext.var2;
            boolean a = counter < 7;
            boolean b = counter > 6;
            boolean c = counter == 13;
            boolean d = counter == 14;
            if (a) {
                temp_english_black_color_value = 15;
                temp_western_color_value = 16;
                temp_english_brown_color_value = 16;
            }
            if (b) {
                temp_english_black_color_value = 16;
                temp_western_color_value = 17;
                temp_english_brown_color_value = 15;
            }
            if (c) {
                temp_english_black_color_value = 15;
                temp_western_color_value = 16;
                temp_english_brown_color_value = 16;
            }
            if (d) {
                temp_english_black_color_value = 16;
                temp_western_color_value = 17;
                temp_english_brown_color_value = 15;
            }
            int final_western_color_value = temp_western_color_value;
            int final_english_black_color_value = temp_english_black_color_value;
            int final_english_brown_color_value = temp_english_brown_color_value;

            DYES.add(REGISTRY.register("dye_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            FLAGS.add(REGISTRY.register("flag_" + counter, () ->
                    new Item((new Item.Properties()))));
            FLAGS_BUTTERFLY.add(REGISTRY.register("flag_butterfly_" + counter, () ->
                    new Item((new Item.Properties()))));

            SIGN_COVERS_RILEY.add(REGISTRY.register("sign_cover_riley_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_FABRIC.add(REGISTRY.register("sign_cover_fabric_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_FLORAL.add(REGISTRY.register("sign_cover_floral_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_SWIRL.add(REGISTRY.register("sign_cover_swirl_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_LOOPED.add(REGISTRY.register("sign_cover_looped_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_CHECKERED.add(REGISTRY.register("sign_cover_checkered_" + counter, () ->
                    new Item((new Item.Properties()))));

            TRE_RIBBON_THREE_TAILS.add(REGISTRY.register("ribbon_three_tails_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            TRE_RIBBON_TWO_TAILS.add(REGISTRY.register("ribbon_two_tails_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            TRE_RIBBON_ONE_TAIL.add(REGISTRY.register("ribbon_one_tail_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            TRE_ROSETTE.add(REGISTRY.register("rosette_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_THICK.add(REGISTRY.register("egg_trophy_thick_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_THIN.add(REGISTRY.register("egg_trophy_thin_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_CHEVRON.add(REGISTRY.register("egg_trophy_chevron_" + counter, () ->
                    new Item(new Item.Properties())
            ));

            HALTERS.add( REGISTRY.register("halter_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            FLYMASKS.add( REGISTRY.register("flymask_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            PASTURE_BLANKETS.add( REGISTRY.register("pasture_blanket_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                            , false))
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_5_long.png"))
                            .build(), (new Item.Properties()).stacksTo(64))
            ));
            PASTURE_BLANKETS_ARMORED.add( REGISTRY.register("pasture_blanket_" + counter + "_armored", () ->
                    new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/rack_tre_pasture_blanket_armored_5_long.png"))
                            .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                    true)).build(), (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_SADDLES.add( REGISTRY.register("adventure_saddle_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "adventure")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BRIDLES.add(REGISTRY.register("adventure_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(true, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "western")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BREAST_COLLARS.add( REGISTRY.register("adventure_breast_collar_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_GIRTH_STRAPS.add(REGISTRY.register("adventure_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(true, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[17][0], tretackcolors[17][1], tretackcolors[17][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BLANKETS.add( REGISTRY.register("adventure_blanket_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
                            .withData(new TackTypeData(true, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_LEG_WRAPS.add( REGISTRY.register("adventure_leg_wraps_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_HORSE_ARMORS.add(REGISTRY.register("cloth_horse_armor_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64))
            ));
//            AMETHYST_HORSE_ARMORS.add(REGISTRY.register("amethyst_horse_armor_" + counter,
//                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                            HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64))
//            ));
            SADDLE_BAGS.add(REGISTRY.register("saddle_bag_" + counter, () ->
                    new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                            true, Collections.emptySet(),
                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_SADDLES.add( REGISTRY.register("western_saddle_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "western")).build(), (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_BRIDLES.add(REGISTRY.register("western_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "western")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_BREAST_COLLARS.add( REGISTRY.register("western_breast_collar_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_GIRTH_STRAPS.add(REGISTRY.register("western_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_western_color_value][0], tretackcolors[final_western_color_value][1], tretackcolors[final_western_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_BLANKETS.add( REGISTRY.register("western_blanket_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_western_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_western_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            WESTERN_LEG_WRAPS.add( REGISTRY.register("western_leg_wraps_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_SADDLES_BLACK.add( REGISTRY.register("english_saddle_black_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "english")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_SADDLES_BROWN.add( REGISTRY.register("english_saddle_brown_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "english")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BRIDLES_BLACK.add(REGISTRY.register("english_bridle_black_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BRIDLES_BROWN.add(REGISTRY.register("english_bridle_brown_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BRIDLES.add(REGISTRY.register("cloth_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BLACK.add( REGISTRY.register("english_breast_collar_black_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BROWN.add( REGISTRY.register("english_breast_collar_brown_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BREAST_COLLARS.add( REGISTRY.register("cloth_breast_collar_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BLACK.add(REGISTRY.register("english_girth_strap_black_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_black_color_value][0], tretackcolors[final_english_black_color_value][1], tretackcolors[final_english_black_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BROWN.add(REGISTRY.register("english_girth_strap_brown_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_brown_color_value][0], tretackcolors[final_english_brown_color_value][1], tretackcolors[final_english_brown_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_GIRTH_STRAPS.add(REGISTRY.register("cloth_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[final_english_black_color_value][0], tretackcolors[final_english_black_color_value][1], tretackcolors[final_english_black_color_value][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BLANKETS.add( REGISTRY.register("english_blanket_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_english_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_english_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_LEG_WRAPS.add( REGISTRY.register("english_leg_wraps_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            QUARTER_SHEETS.add(REGISTRY.register("quarter_sheet_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_SADDLES.add( REGISTRY.register("bareback_saddle_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                            "western")).build(), (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BITLESS_BRIDLES.add(REGISTRY.register("cloth_bitless_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_GIRTH_STRAPS.add(REGISTRY.register("bareback_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]),
                                            Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2])))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_BLANKETS.add(REGISTRY.register("bareback_blanket_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    Color.ofRGB(tretackcolors[counter][0], tretackcolors[counter][1], tretackcolors[counter][2]))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));

            ++rContext.var2;
        }

/// ════════════════════════════════════ CRAFTABLE DYED (SWEM Colors) ════════════════════════════════════ ///
            FLAGS_DYED = new ArrayList<>();

            SIGN_COVERS_RILEY_DYED = new ArrayList<>();
            SIGN_COVERS_FABRIC_DYED = new ArrayList<>();
            SIGN_COVERS_FLORAL_DYED = new ArrayList<>();
            SIGN_COVERS_SWIRL_DYED = new ArrayList<>();
            SIGN_COVERS_LOOPED_DYED = new ArrayList<>();
            SIGN_COVERS_CHECKERED_DYED = new ArrayList<>();

            RIBBON_THREE_TAILS = new ArrayList<>();
            RIBBON_TWO_TAILS = new ArrayList<>();
            RIBBON_ONE_TAIL = new ArrayList<>();
            ROSETTE = new ArrayList<>();

            EGG_TROPHY_THICK_DYED = new ArrayList<>();
            EGG_TROPHY_THIN_DYED = new ArrayList<>();
            EGG_TROPHY_CHEVRON_DYED = new ArrayList<>();

            FLYMASKS_DYED = new ArrayList<>();
            ADVENTURE_SADDLES_DYED = new ArrayList<>();
            ADVENTURE_BRIDLES_DYED = new ArrayList<>();
            ADVENTURE_BREAST_COLLARS_DYED = new ArrayList<>();
            ADVENTURE_GIRTH_STRAPS_DYED = new ArrayList<>();
            ADVENTURE_BLANKETS_DYED = new ArrayList<>();
            ADVENTURE_LEG_WRAPS_DYED  = new ArrayList<>();
            CLOTH_HORSE_ARMORS_DYED  = new ArrayList<>();
//            AMETHYST_HORSE_ARMORS_DYED  = new ArrayList<>();
            ENGLISH_SADDLES_BLACK_DYED = new ArrayList<>();
            ENGLISH_SADDLES_BROWN_DYED = new ArrayList<>();
            ENGLISH_BRIDLES_BLACK_DYED = new ArrayList<>();
            ENGLISH_BRIDLES_BROWN_DYED = new ArrayList<>();
            CLOTH_BRIDLES_DYED = new ArrayList<>();
            ENGLISH_BREAST_COLLARS_BLACK_DYED = new ArrayList<>();
            ENGLISH_BREAST_COLLARS_BROWN_DYED = new ArrayList<>();
            CLOTH_BREAST_COLLARS_DYED = new ArrayList<>();
            ENGLISH_GIRTH_STRAPS_BLACK_DYED = new ArrayList<>();
            ENGLISH_GIRTH_STRAPS_BROWN_DYED = new ArrayList<>();
            CLOTH_GIRTH_STRAPS_DYED = new ArrayList<>();
            QUARTER_SHEETS_DYED = new ArrayList<>();
            BAREBACK_SADDLES_DYED = new ArrayList<>();
            CLOTH_BITLESS_BRIDLES_DYED = new ArrayList<>();
            BAREBACK_GIRTH_STRAPS_DYED = new ArrayList<>();
            BAREBACK_BLANKETS_DYED = new ArrayList<>();

        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        for (int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
            FLAGS_DYED.add(REGISTRY.register("flag_" + color.getName(), () ->
                    new Item((new Item.Properties()))));

            SIGN_COVERS_RILEY_DYED.add(REGISTRY.register("sign_cover_riley_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_FABRIC_DYED.add(REGISTRY.register("sign_cover_fabric_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_FLORAL_DYED.add(REGISTRY.register("sign_cover_floral_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_SWIRL_DYED.add(REGISTRY.register("sign_cover_swirl_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_LOOPED_DYED.add(REGISTRY.register("sign_cover_looped_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
            SIGN_COVERS_CHECKERED_DYED.add(REGISTRY.register("sign_cover_checkered_" + color.getName(), () ->
                    new Item((new Item.Properties()))));

            RIBBON_THREE_TAILS.add(REGISTRY.register("ribbon_three_tails_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            RIBBON_TWO_TAILS.add(REGISTRY.register("ribbon_two_tails_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            RIBBON_ONE_TAIL.add(REGISTRY.register("ribbon_one_tail_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            ROSETTE.add(REGISTRY.register("rosette_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_THICK_DYED.add(REGISTRY.register("egg_trophy_thick_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_THIN_DYED.add(REGISTRY.register("egg_trophy_thin_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));
            EGG_TROPHY_CHEVRON_DYED.add(REGISTRY.register("egg_trophy_chevron_" + color.getName(), () ->
                    new Item(new Item.Properties())
            ));

            FLYMASKS.add( REGISTRY.register("flymask_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(),  ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_SADDLES_DYED.add(REGISTRY.register("adventure_saddle_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "adventure")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BRIDLES_DYED.add(REGISTRY.register("adventure_bridle_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "western")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BREAST_COLLARS_DYED.add(REGISTRY.register("adventure_breast_collar_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_GIRTH_STRAPS_DYED.add(REGISTRY.register("adventure_girth_strap_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(true, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_BLANKETS_DYED.add(REGISTRY.register("adventure_blanket_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_adventure_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_adventure_blanket.png"))
                            .withData(new TackTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ADVENTURE_LEG_WRAPS_DYED.add(REGISTRY.register("adventure_leg_wraps_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_HORSE_ARMORS_DYED.add(REGISTRY.register("cloth_horse_armor_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64))
            ));
//            AMETHYST_HORSE_ARMORS_DYED.add(REGISTRY.register("amethyst_horse_armor_" + color.getName(),
//                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
//                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
//                            HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64))
//            ));
            ENGLISH_SADDLES_BLACK_DYED.add(REGISTRY.register("english_saddle_black_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "english")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_SADDLES_BROWN_DYED.add(REGISTRY.register("english_saddle_brown_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "english")).build(), (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BRIDLES_BLACK_DYED.add(REGISTRY.register("english_bridle_black_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BRIDLES_BROWN_DYED.add(REGISTRY.register("english_bridle_brown_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BRIDLES_DYED.add(REGISTRY.register("cloth_bridle_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BLACK_DYED.add(REGISTRY.register("english_breast_collar_black_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_BREAST_COLLARS_BROWN_DYED.add(REGISTRY.register("english_breast_collar_brown_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BREAST_COLLARS_DYED.add(REGISTRY.register("cloth_breast_collar_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BLACK_DYED.add(REGISTRY.register("english_girth_strap_black_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BLACK)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            ENGLISH_GIRTH_STRAPS_BROWN_DYED.add(REGISTRY.register("english_girth_strap_brown_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BROWN)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_GIRTH_STRAPS_DYED.add(REGISTRY.register("cloth_girth_strap_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(color)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            QUARTER_SHEETS_DYED.add(REGISTRY.register("quarter_sheet_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_SADDLES_DYED.add(REGISTRY.register("bareback_saddle_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(color),
                            "western")).build(), (new Item.Properties()).stacksTo(64))
            ));
            CLOTH_BITLESS_BRIDLES.add(REGISTRY.register("cloth_bitless_bridle_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color)
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_GIRTH_STRAPS_DYED.add(REGISTRY.register("bareback_girth_strap_" + color.getName(),
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(color),
                                            ColorUtil.ofDyeColor(DyeColor.BLACK)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/tre_girth_strap.png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            BAREBACK_BLANKETS_DYED.add(REGISTRY.register("bareback_blanket_" + color.getName(), () ->
                    new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res("textures/entity/rack/saddle/tre_bareback_blanket.png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res("textures/entity/rack/blanket_5/tre_bareback_blanket.png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(color))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
        }
    }
}