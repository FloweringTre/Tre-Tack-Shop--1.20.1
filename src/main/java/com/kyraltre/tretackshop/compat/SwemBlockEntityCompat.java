package com.kyraltre.tretackshop.compat;

import com.alaharranhonor.swem.forge.blocks.GrainBinBlock;
import com.alaharranhonor.swem.forge.registry.BlockSetup;
import com.kyraltre.tretackshop.registry.AwardShopBlockRegistry;
import com.kyraltre.tretackshop.registry.TackShopBlockRegistry;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;

public final class SwemBlockEntityCompat {

    private SwemBlockEntityCompat() {
    }

    public static void apply() {
        // Tack boxes -> SWEM TackBoxBE
        addAllIfMissing(
                BlockSetup.TACK_BOX,
                TackShopBlockRegistry.TACK_BOX_BAMBOO,
                TackShopBlockRegistry.TACK_BOX_SWDM_BAMBOO,
                TackShopBlockRegistry.TACK_BOX_WHITEWASH,
                TackShopBlockRegistry.TACK_BOX_THATCH,
                TackShopBlockRegistry.TACK_BOX_MANGROVE,
                TackShopBlockRegistry.TACK_BOX_CHERRY,
                TackShopBlockRegistry.TACK_BOX_ACACIA,
                TackShopBlockRegistry.TACK_BOX_BIRCH,
                TackShopBlockRegistry.TACK_BOX_CRIMSON,
                TackShopBlockRegistry.TACK_BOX_JUNGLE,
                TackShopBlockRegistry.TACK_BOX_DARK_OAK,
                TackShopBlockRegistry.TACK_BOX_OAK,
                TackShopBlockRegistry.TACK_BOX_SPRUCE,
                TackShopBlockRegistry.TACK_BOX_WARPED,
                TackShopBlockRegistry.TACK_BOX_PALE_OAK,
                TackShopBlockRegistry.TACK_BOX_MORPHO,
                TackShopBlockRegistry.TACK_BOX_MONARCH,
                TackShopBlockRegistry.TACK_BOX_RAINBOW,
                TackShopBlockRegistry.TACK_BOX_HOUND,
                TackShopBlockRegistry.TACK_BOXES,
                AwardShopBlockRegistry.AWARD_TACK_BOXES
        );

        // Wheelbarrows -> SWEM WheelBarrowBE
        addAllIfMissing(
                BlockSetup.WHEEL_BARROWS,
                TackShopBlockRegistry.WHEELBARROW_MORPHO,
                TackShopBlockRegistry.WHEELBARROW_MONARCH,
                TackShopBlockRegistry.WHEELBARROW_HOUND,
//                TackShopBlockRegistry.WHEELBARROW_RAINBOW,
                TackShopBlockRegistry.WHEELBARROWS,
                AwardShopBlockRegistry.AWARD_WHEELBARROWS
        );

        // Slow feeders -> SWEM SlowFeederBE
        addAllIfMissing(
                BlockSetup.SLOW_FEEDERS,
                TackShopBlockRegistry.SLOW_FEEDER_MORPHO,
                TackShopBlockRegistry.SLOW_FEEDER_MONARCH,
                TackShopBlockRegistry.SLOW_FEEDER_HOUND,
//                TackShopBlockRegistry.SLOW_FEEDER_RAINBOW,
                TackShopBlockRegistry.SLOW_FEEDERS,
                AwardShopBlockRegistry.AWARD_SLOW_FEEDERS
        );

        // Grain feeders -> SWEM GrainFeederBE
        addAllIfMissing(
                BlockSetup.GRAIN_FEEDERS,
                TackShopBlockRegistry.GRAIN_FEEDER_MORPHO,
                TackShopBlockRegistry.GRAIN_FEEDER_MONARCH,
                TackShopBlockRegistry.GRAIN_FEEDER_HOUND,
//                TackShopBlockRegistry.GRAIN_FEEDER_RAINBOW,
                TackShopBlockRegistry.GRAIN_FEEDERS,
                AwardShopBlockRegistry.AWARD_GRAIN_FEEDERS
        );

        // Grain bins -> SWEM GrainBinBE.
        addGrainBins(TackShopBlockRegistry.BIN_GRAIN_MORPHO, "morpho");
        addGrainBins(TackShopBlockRegistry.BIN_GRAIN_MONARCH, "monarch");
        addGrainBins(TackShopBlockRegistry.BIN_GRAIN_HOUND, "hound");
//        addGrainBins(TackShopBlockRegistry.BIN_GRAIN_RAINBOW, "rainbow");
        addGrainBins(TackShopBlockRegistry.BIN_GRAINS, "numbered");
        addGrainBins(AwardShopBlockRegistry.AWARD_BIN_GRAINS, "award");
    }

    @SafeVarargs
    private static <T extends Block> void addAllIfMissing(
            List<RegistryObject<T>> target,
            List<RegistryObject<T>>... sources) {

        for (List<RegistryObject<T>> source : sources) {
            for (RegistryObject<T> block : source) {
                if (!target.contains(block)) {
                    target.add(block);
                }
            }
        }
    }

    private static void addGrainBins(
            List<RegistryObject<GrainBinBlock>> source,
            String group) {

        Map<String, RegistryObject<GrainBinBlock>> target = BlockSetup.GRAIN_BINS_WOOD;

        int index = 0;
        for (RegistryObject<GrainBinBlock> block : source) {
            target.putIfAbsent("tretackshop_" + group + "_" + index++, block);
        }
    }
}
