//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.item;

import com.alaharranhonor.swem.forge.armor.SWEMArmorMaterial;
import com.alaharranhonor.swem.forge.blocks.PlaqueBlock;
import com.alaharranhonor.swem.forge.blocks.RibbonBlock;
import com.alaharranhonor.swem.forge.blocks.TrophyBlock;
import com.alaharranhonor.swem.forge.blocks.RibbonBlock.Type;
import com.alaharranhonor.swem.forge.config.RecipeControlConfig;
import com.alaharranhonor.swem.forge.items.BreedingToken;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem.HorseArmorTier;
import com.alaharranhonor.swem.forge.items.tools.AmethystBow;
import com.alaharranhonor.swem.forge.items.tools.AmethystPickaxe;
import com.alaharranhonor.swem.forge.items.tools.AmethystShield;
import com.alaharranhonor.swem.forge.items.tools.SWEMItemTier;
import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TackShopCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public TackShopCreativeModTab() {
    }

    public static void init(IEventBus bus) {
        REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "tretacktab");
        MAIN = REGISTRY.register("main", () -> {
            return CreativeModeTab.builder().title(Component.translatable("creativetab.tretack_tab")).icon(() -> new ItemStack(TackShopItems.BUTTERFLY.get()))
                .displayItems((pParameters, pOutput) -> {
                TackShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                    Item item = (Item)registeredItem.get();
                    pOutput.accept(item);
                });
            }).withSearchBar().build();
        });
    }
}
