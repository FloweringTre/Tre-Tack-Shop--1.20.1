package com.kyraltre.peachtackshop.block;

import com.alaharranhonor.swem.forge.blocks.ConeBase;
import com.kyraltre.peachtackshop.PeachTackShop;
import com.kyraltre.peachtackshop.registry.DecorShopItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TackShopBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PeachTackShop.MOD_ID);

    //// THIS COMMENT IS THE BASE FOR HOW TO BUILD OUT A CONE BLOCK. YOU NEED TO DO EACH ONE INDIVDUALLY :(
    public static final RegistryObject<Block> CONE_RAINBOW = registerBlock("cone_rainbow",
            () -> new ConeBase());

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return DecorShopItems.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
