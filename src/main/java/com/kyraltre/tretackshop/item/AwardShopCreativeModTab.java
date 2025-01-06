//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopBlockRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AwardShopCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public AwardShopCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "treawardtab");
        MAIN = REGISTRY.register("main", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.treaward_tab")).icon(() -> new ItemStack(AwardShopItems.RIBBON_THREE_TAILS_GRAND.get()))
            .displayItems((pParameters, pOutput) -> {
                // Add items from TackShopBlockRegistry
                AwardShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                    Item item = registeredItem.get();
                    pOutput.accept(item);
                });
            })
                .withSearchBar().build());
    }
}
