package com.kyraltre.tretackshop.registry;

// FOR ITEMS THAT ARE ABLE TO BE RE-TEXTURED
import com.alaharranhonor.swem.forge.items.tack.*;

import java.util.ArrayList;
import java.util.List;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class TackShopItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<HalterItem> HALTER_RAINBOW;
    public static final List<RegistryObject<HalterItem>> HALTERS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_ARMORED;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_RAINBOW;
    public static final List<RegistryObject<AdventureBlanketItem>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKETS;
    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;
    public static final RegistryObject<Item> PUMPKIN_GRAND;
    public static final RegistryObject<Item> PUMPKIN_RESERVE;




    public TackShopItems() {
    }

    public static void init(IEventBus modBus) {
        REGISTRY.register(modBus);
    }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");
        // Mod icon <3
        BUTTERFLY = REGISTRY.register("butterfly",
                () -> new Item(new Item.Properties()));

        // RAINBOW TACK ITEMS
        HALTER_RAINBOW = REGISTRY.register("halter_rainbow",
                () -> new HalterItem("halter_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        ADVENTURE_BLANKET_RAINBOW = REGISTRY.register("adventure_blanket_rainbow",
                () -> new AdventureBlanketItem("adventure_blanket_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        WESTERN_BLANKET_RAINBOW = REGISTRY.register("western_blanket_rainbow",
                () -> new WesternBlanketItem("western_blanket_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        ENGLISH_BLANKET_RAINBOW = REGISTRY.register("english_blanket_rainbow",
                () -> new EnglishBlanketItem("english_blanket_rainbow", (new Item.Properties())
                        .stacksTo(16)));

        PASTURE_BLANKET_RAINBOW = REGISTRY.register("pasture_blanket_rainbow",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_rainbow", new Item.Properties().stacksTo(16)));

        PASTURE_BLANKET_RAINBOW_ARMORED = REGISTRY.register("pasture_blanket_rainbow_armored",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored",
                        (new Item.Properties()).stacksTo(16)));

        //12 count items
        PASTURE_BLANKETS = new ArrayList();
        PASTURE_BLANKETS_ARMORED = new ArrayList();
        HALTERS = new ArrayList();
        FLYMASKS = new ArrayList();
        ADVENTURE_BLANKETS = new ArrayList();
        WESTERN_BLANKETS = new ArrayList();
        ENGLISH_BLANKETS = new ArrayList();
        int var1 = 13;
        var rContext = new Object() {
            int var2 = 1;
            };

        while (rContext.var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = rContext.var2;
            HALTERS.add(REGISTRY.register("halter_" + Integer.toString(counter), () -> {
                return new HalterItem("halter_" + Integer.toString(counter), (new Item.Properties())
                        .stacksTo(16));
            }));

            FLYMASKS.add(REGISTRY.register("flymask_" + Integer.toString(counter), () -> {
                return new HalterItem("flymask_" + Integer.toString(counter), (new Item.Properties())
                        .stacksTo(16));
            }));

            ADVENTURE_BLANKETS.add(REGISTRY.register("adventure_blanket_" + Integer.toString(counter), () -> {
                return new AdventureBlanketItem("adventure_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .stacksTo(16));
            }));

            WESTERN_BLANKETS.add(REGISTRY.register("western_blanket_" + Integer.toString(counter), () -> {
                return new WesternBlanketItem("western_blanket_" + Integer.toString(counter), (new Item.Properties())
                       .stacksTo(16));
            }));

            ENGLISH_BLANKETS.add(REGISTRY.register("english_blanket_" + Integer.toString(counter), () -> {
                return new EnglishBlanketItem("english_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .stacksTo(16));
            }));

            PASTURE_BLANKETS.add(REGISTRY.register("pasture_blanket_" + Integer.toString(counter), () -> {
                return new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_" + Integer.toString(counter), (new Item.Properties())
                        .stacksTo(16));
            }));

            PASTURE_BLANKETS_ARMORED.add(REGISTRY.register("pasture_blanket_" + Integer.toString(counter) + "_armored", () -> {
                return new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_" + Integer.toString(counter) + "_armored", (new Item.Properties())
                        .stacksTo(16));
            }));

            ++rContext.var2;
        }

        // 6 count items
        RIBBON_THREE_TAILS = new ArrayList();
        RIBBON_TWO_TAILS = new ArrayList();
        RIBBON_ONE_TAIL = new ArrayList();
        ROSETTE = new ArrayList();
         int r = 7;
         var Context = new Object() {
             int b = 1;
         };

         while (Context.b < r) {
             int counter = Context.b;

             RIBBON_THREE_TAILS.add(REGISTRY.register("ribbon_three_tails_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties());
             }));
             RIBBON_TWO_TAILS.add(REGISTRY.register("ribbon_two_tails_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties());
             }));
             RIBBON_ONE_TAIL.add(REGISTRY.register("ribbon_one_tail_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties());
             }));
             ROSETTE.add(REGISTRY.register("rosette_" + Integer.toString(counter), () -> {
                 return new Item(new Item.Properties());
             }));

             ++Context.b;
         }

        TROPHY_1 = REGISTRY.register("trophy_1",
                () -> new Item(new Item.Properties()));

        TROPHY_2 = REGISTRY.register("trophy_2",
                () -> new Item(new Item.Properties()));

        TROPHY_3 = REGISTRY.register("trophy_3",
                () -> new Item(new Item.Properties()))
                ; // Adding 3 CIT trophy variants

        PUMPKIN_GRAND = REGISTRY.register("pumpkin_grand",
                () -> new Item(new Item.Properties()));

        PUMPKIN_RESERVE = REGISTRY.register("pumpkin_reserve",
                () -> new Item(new Item.Properties()));

    }
}
