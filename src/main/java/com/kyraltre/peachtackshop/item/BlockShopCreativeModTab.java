//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.peachtackshop.item;

import com.kyraltre.peachtackshop.block.TackShopBlocks;
import com.kyraltre.peachtackshop.registry.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BlockShopCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public BlockShopCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "peachblock_tab");
        MAIN = REGISTRY.register("main", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.peachblock_tab"))
                .icon(() -> new ItemStack(DecorShopItems.PEACH.get()))
                .displayItems((pParameters, pOutput) -> {
                    DecorShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                        Item item = registeredItem.get();
                        pOutput.accept(item);
                    });
                })
                .withSearchBar().build());
    }
}
