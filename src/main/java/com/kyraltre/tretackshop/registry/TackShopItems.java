package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> REGISTRY;

    // THIS IS FOR TACK ITEMS THAT __CAN__ BE CRAFTED

    // TACK ITEMS

    // DYED TACK
    //public static final RegistryObject<DyedPastureBlanket> PASTURE_BLANKET_DYED;

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

    public TackShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");
        
// TACK ITEMS

        // Dyed Items


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

        PASTURE_BLANKET_RAINBOW =  REGISTRY.register("pasture_blanket_rainbow",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_rainbow", new Item.Properties()
                         .stacksTo(16)));
        PASTURE_BLANKET_RAINBOW_ARMORED =  REGISTRY.register("pasture_blanket_rainbow_armored",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored", (new Item.Properties())
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

        int var1 = 13;
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
            CLOTH_BREAST_COLLARS.add( REGISTRY.register("cloth_breast_collar_" + counter, () ->
                    new EnglishBreastCollar("cloth_breast_collar_" + counter, (new Item.Properties())
                             .stacksTo(16))
            ));
            ENGLISH_LEG_WRAPS.add( REGISTRY.register("english_leg_wraps_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_" + counter, (new Item.Properties())
                             .stacksTo(64))
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

            ++rContext.var2;
        }
    }
}
