package com.kyraltre.tretackshop.compat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(
        modid = "tretackshop",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public final class SwemWaterColorCompat {

    private SwemWaterColorCompat() {
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        List<Block> halfBarrels = new ArrayList<>();

        for (Block block : BuiltInRegistries.BLOCK) {
            var id = BuiltInRegistries.BLOCK.getKey(block);

            if (!"tretackshop".equals(id.getNamespace())) {
                continue;
            }

            if (id.getPath().startsWith("half_barrel")) {
                halfBarrels.add(block);
            }
        }

        BlockColor waterColor = (state, level, pos, tintIndex) -> {
            if (tintIndex != 0) {
                return -1;
            }

            if (level == null || pos == null) {
                // Vanilla water color for inventory/item rendering.
                return 0x3F76E4;
            }

            return BiomeColors.getAverageWaterColor(level, pos);
        };

        event.getBlockColors().register(
                waterColor,
                halfBarrels.toArray(new Block[0])
        );
    }
}