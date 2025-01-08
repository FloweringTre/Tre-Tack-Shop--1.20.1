package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.blocks.TackBoxBlock;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.*;
import com.alaharranhonor.swem.forge.items.tack.HorseArmorTier;
import com.alaharranhonor.swem.forge.items.tack.SaddlebagItem;
import com.alaharranhonor.swem.forge.items.tack.TackItem;
import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib.core.object.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecorShopItems {
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
    public static final RegistryObject<Item> SIGN_COVER_1;


    public DecorShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
         REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");

        SIGN_COVER_1 = REGISTRY.register("sign_cover_1",
                () -> new Item(new Item.Properties()));

    }
}
