package com.kyraltre.peachtackshop.registry;


import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class DecorShopItems {
    public static final DeferredRegister<Item> REGISTRY;


    // THIS IS FOR DECOR ITEMS

    public static final RegistryObject<Item> PEACH;

    public static final RegistryObject<Item> FLAG_RAINBOW; //SINGLE FLAG
    public static final List<RegistryObject<Item>> FLAGS; // GROUP OF FLAGS - NUMBERED
    public static final List<RegistryObject<Item>> FLAGS_DYED; // GROUP OF FLAGS - DYED COLORS

    public static final RegistryObject<Item> SIGN_COVER_SWIRL_RAINBOW; // SINGLE COVER
    public static final List<RegistryObject<Item>> SIGN_COVER_SWIRL; // GROUP COVERS

    public static final RegistryObject<Item> TROPHY_1;
    public static final RegistryObject<Item> TROPHY_2;
    public static final RegistryObject<Item> TROPHY_3;

    public static final List<RegistryObject<Item>> RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> ROSETTE;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_GRAND;
    public static  final RegistryObject<Item> RIBBON_THREE_TAILS_RESERVE;


    public DecorShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "peachtackshop");

         //These are single item registries
        PEACH = REGISTRY.register("peach",
                () -> new Item(new Item.Properties()));
        FLAG_RAINBOW = REGISTRY.register("flag_rainbow",
                () -> new Item(new Item.Properties()));
        SIGN_COVER_SWIRL_RAINBOW = REGISTRY.register("sign_cover_swirl_rainbow",
                () -> new Item(new Item.Properties()));

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


        /// GROUP REGISTERIES

        // register the group of items as an array list
        FLAGS = new ArrayList<>();
        FLAGS_DYED = new ArrayList<>();
        SIGN_COVER_SWIRL = new ArrayList<>();
        RIBBON_THREE_TAILS = new ArrayList<>();
        RIBBON_TWO_TAILS = new ArrayList<>();
        RIBBON_ONE_TAIL = new ArrayList<>();
        ROSETTE = new ArrayList<>();


        //// NUMERICAL LOOPING
        // set how many you want to loop through PLUS ONE (so this will be 14 items)
        int var1 = 15;

        var rContext = new Object() {
            int var2 = 1;
        };

        //loop through the group where it will add the number after the name to get many items at one time.
        while (rContext.var2 < var1) {
            int counter = rContext.var2;
            FLAGS.add(REGISTRY.register("flag_" + counter, () ->
                    new Item((new Item.Properties()))));
            SIGN_COVER_SWIRL.add(REGISTRY.register("sign_cover_swirl_" + counter, () ->
                    new Item((new Item.Properties()))));
            ++rContext.var2;
        }

        //DYE LOOOPING
        // prepare the dye color names for looping
        DyeColor[] var0 = DyeColor.values();
        int var3 = var0.length;

        //loop through the dye colors in a group where it will add the dye color name to the name of the item
        for (int var2 = 0; var2 < var3; ++var2) {
            DyeColor color = var0[var2];
            FLAGS_DYED.add(REGISTRY.register("flag_" + color.getName(), () ->
                    new Item((new Item.Properties()))));
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
    }
}
