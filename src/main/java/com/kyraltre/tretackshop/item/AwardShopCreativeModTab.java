//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopItems;
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
    public static final RegistryObject<CreativeModeTab> AWARD;

    public AwardShopCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "treawardtab");
        AWARD = REGISTRY.register("award", () -> CreativeModeTab.builder().title(Component.translatable("creativetab.awardtack_tab")).icon(() -> new ItemStack(AwardShopItems.AWARD_RIBBON_THREE_TAILS.get(0).get()))
            .displayItems((pParameters, pOutput) -> AwardShopItems.REGISTRY.getEntries().forEach((registeredItem) -> {
                Item item = registeredItem.get();
                pOutput.accept(item);
            })).build());
    }
}
