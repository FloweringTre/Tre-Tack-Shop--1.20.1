package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class AwardShopItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> BUTTERFLY;

// THIS IS FOR AWARD ITEMS THAT CAN NOT BE CRAFTED
   
// TACK ITEMS
    public static final List<RegistryObject<HalterItem>> AWARD_HALTERS;
    public static final List<RegistryObject<HalterItem>> AWARD_FLYMASKS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> AWARD_PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<AdventureBlanketItem>> AWARD_ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> AWARD_ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> AWARD_WESTERN_BLANKETS;
    public static final List<RegistryObject<AdventureLegWraps>> AWARD_ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> AWARD_ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> AWARD_WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<AdventureSaddleItem>> AWARD_ADVENTURE_SADDLES;
    public static final List<RegistryObject<WesternSaddleItem>> AWARD_WESTERN_SADDLES;
    public static final List<RegistryObject<EnglishSaddleItem>> AWARD_ENGLISH_SADDLES;
    public static final List<RegistryObject<AdventureBreastCollarItem>> AWARD_ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<WesternBreastCollarItem>> AWARD_WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> AWARD_ENGLISH_BREAST_COLLARS;


// AWARD RIBBONS AND TROPHIES
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> MEDAL_1;
    public static final RegistryObject<Item> MEDAL_2;
    public static final RegistryObject<Item> MEDAL_3;
    public static final RegistryObject<Item> PUMPKIN_GRAND;
    public static final RegistryObject<Item> PUMPKIN_RESERVE;


    public AwardShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");
        // Mod icon <3
        BUTTERFLY =  REGISTRY.register("butterfly",
                () -> new Item(new Item.Properties()));
// TACK ITEMS
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
        int var1 = 13;
        
        for(int var2 = 1; var2 < var1; ++var2) {
            int counter = var2;
            AWARD_HALTERS.add( REGISTRY.register("award_halter_" + counter,
                    () -> new HalterItem("award_halter_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_FLYMASKS.add( REGISTRY.register("award_flymask_" + counter,
                    () -> new HalterItem("award_flymask_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));

            AWARD_ADVENTURE_SADDLES.add( REGISTRY.register("award_adventure_saddle_" + counter, () ->
                    new AdventureSaddleItem("award_adventure_saddle_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ADVENTURE_BLANKETS.add( REGISTRY.register("award_adventure_blanket_" + counter,
                    () -> new AdventureBlanketItem("award_adventure_blanket_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ADVENTURE_BREAST_COLLARS.add( REGISTRY.register("award_adventure_breast_collar_" + counter,
                    () -> new AdventureBreastCollarItem("award_adventure_breast_collar_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ADVENTURE_LEG_WRAPS.add( REGISTRY.register("award_adventure_leg_wraps_" + counter,
                    () -> new AdventureLegWraps("award_adventure_leg_wraps_" + counter, (new Item.Properties())
                         .stacksTo(64))
            ));

            AWARD_WESTERN_SADDLES.add( REGISTRY.register("award_western_saddle_" + counter,
                    () -> new WesternSaddleItem("award_western_saddle_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_WESTERN_BLANKETS.add( REGISTRY.register("award_western_blanket_" + counter,
                    () -> new WesternBlanketItem("award_western_blanket_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_WESTERN_BREAST_COLLARS.add( REGISTRY.register("award_western_breast_collar_" + counter,
                    () -> new WesternBreastCollarItem("award_western_breast_collar_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_WESTERN_LEG_WRAPS.add( REGISTRY.register("award_western_leg_wraps_" + counter,
                    () -> new WesternLegWraps("award_western_leg_wraps_" + counter, (new Item.Properties())
                         .stacksTo(64))
            ));

            AWARD_ENGLISH_SADDLES.add( REGISTRY.register("award_english_saddle_" + counter,
                    () -> new EnglishSaddleItem("award_english_saddle_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ENGLISH_BLANKETS.add( REGISTRY.register("award_english_blanket_" + counter,
                    () -> new EnglishBlanketItem("award_english_blanket_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ENGLISH_BREAST_COLLARS.add( REGISTRY.register("award_english_breast_collar_" + counter,
                    () -> new EnglishBreastCollar("award_english_breast_collar_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_ENGLISH_LEG_WRAPS.add( REGISTRY.register("award_english_leg_wraps_" + counter,
                    () -> new EnglishLegWraps("award_english_leg_wraps_" + counter, (new Item.Properties())
                         .stacksTo(64))
            ));

            AWARD_PASTURE_BLANKETS.add( REGISTRY.register("award_pasture_blanket_" + counter,
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                    "award_pasture_blanket_" + counter, (new Item.Properties())
                         .stacksTo(16))
            ));
            AWARD_PASTURE_BLANKETS_ARMORED.add( REGISTRY.register("award_pasture_blanket_" + counter + "_armored",
                    () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                    "award_pasture_blanket_" + counter + "_armored", (new Item.Properties())
                         .stacksTo(16))
            ));
        }

// AWARD ITEMS

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
        MEDAL_1 =  REGISTRY.register("medal_1",
                () -> new Item(new Item.Properties() ));
        MEDAL_2 =  REGISTRY.register("medal_2",
                () -> new Item(new Item.Properties() ));
        MEDAL_3 =  REGISTRY.register("medal_3",
                () -> new Item(new Item.Properties() ));
        PUMPKIN_GRAND =  REGISTRY.register("pumpkin_grand",
                () -> new Item(new Item.Properties()));
        PUMPKIN_RESERVE =  REGISTRY.register("pumpkin_reserve",
                () -> new Item(new Item.Properties()));
    }
}
