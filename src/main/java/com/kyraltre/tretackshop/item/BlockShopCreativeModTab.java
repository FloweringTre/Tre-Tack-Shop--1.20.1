//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.registry.*;
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
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "treblocktab");
        MAIN = REGISTRY.register("main", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.treblock_tab"))
                .icon(() -> new ItemStack(TackShopBlocks.CONE_RAINBOW.get()))
                .displayItems((pParameters, pOutput) -> {
                    DecorShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                        Item item = registeredItem.get();
                        pOutput.accept(item);
                    });
                })
                .withSearchBar().build());
    }
}
