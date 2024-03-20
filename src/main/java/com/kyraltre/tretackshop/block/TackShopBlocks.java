package com.kyraltre.tretackshop.block;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.*;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class TackShopBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TreTackShop.MOD_ID);

    //REMOVED BLOCK pumpkin stature, only item frame variant now
//    public static final RegistryObject<Block> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
//            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.PUMPKIN).noOcclusion().strength(1.0F)
//            ));
//
//    public static final RegistryObject<Block> PUMPKIN_RESERVE = registerBlock("pumpkin_reserve",
//            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.PUMPKIN).noOcclusion().strength(1.0F)
//            ));

    public static final RegistryObject<Block> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));

    public static final RegistryObject<Block> PUMPKIN_RESERVE = registerBlock("pumpkin_reserve",
            () -> new PumpkinTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));

    public  static final RegistryObject<Block> SNOWFLAKE_GRAND =registerBlock("snowflake_grand", () ->
            new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> SNOWFLAKE_RESERVE = registerBlock("snowflake_reserve",
            () -> new SnowflakeTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));
    public  static final RegistryObject<Block> HEART_GRAND =registerBlock("heart_grand", () ->
            new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> HEART_RESERVE = registerBlock("heart_reserve",
            () -> new HeartTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().strength(1.0F)
            ));

    public static final RegistryObject<Block> CLOVER_GRAND = registerBlock("clover_grand", () ->
            new CloverTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> CLOVER_RESERVE = registerBlock("clover_reserve",
            () -> new CloverTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));

    public static final RegistryObject<Block> EGG_TROPHY_THICK_1 = registerBlock("e_g_g_trophy_thick_1",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_THICK_2 = registerBlock("e_g_g_trophy_thick_2",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_THICK_3 = registerBlock("e_g_g_trophy_thick_3",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));

    public static final RegistryObject<Block> EGG_TROPHY_THIN_1 = registerBlock("e_g_g_trophy_thin_1",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_THIN_2 = registerBlock("e_g_g_trophy_thin_2",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_THIN_3 = registerBlock("e_g_g_trophy_thin_3",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));

    public static final RegistryObject<Block> EGG_TROPHY_CHEV_1 = registerBlock("e_g_g_trophy_chev_1",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_CHEV_2 = registerBlock("e_g_g_trophy_chev_2",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));
    public static final RegistryObject<Block> EGG_TROPHY_CHEV_3 = registerBlock("e_g_g_trophy_chev_3",
            () -> new EggTrophy(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion().strength(1.0F)
            ));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return TackShopItems.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
