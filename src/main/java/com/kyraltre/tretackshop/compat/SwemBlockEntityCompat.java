package com.kyraltre.tretackshop.compat;

import com.alaharranhonor.swem.forge.blocks.AwardBlock;
import com.alaharranhonor.swem.forge.blocks.GrainBinBlock;
import com.alaharranhonor.swem.forge.blocks.GrainFeederBlock;
import com.alaharranhonor.swem.forge.blocks.SlowFeederBlock;
import com.alaharranhonor.swem.forge.blocks.TackBoxBlock;
import com.alaharranhonor.swem.forge.blocks.WheelBarrowBlock;
import com.alaharranhonor.swem.forge.registry.BlockEntitySetup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * Makes SWEM's existing BlockEntityTypes recognize Tre's Tack Shop copies
 * of SWEM blocks as valid blocks.
 *
 * Tre's Tack Shop reuses SWEM block classes. Those blocks therefore create
 * SWEM block entities, but SWEM originally registered only its own blocks
 * with the corresponding BlockEntityType.
 */
public final class SwemBlockEntityCompat {

    private static final String TACK_SHOP_NAMESPACE = "tretackshop";

    private static final Field VALID_BLOCKS_FIELD;

    static {
        try {
            VALID_BLOCKS_FIELD =
                    BlockEntityType.class.getDeclaredField("validBlocks");

            VALID_BLOCKS_FIELD.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(
                    "Unable to access BlockEntityType.validBlocks"
            );
        }
    }

    private SwemBlockEntityCompat() {
    }

    /**
     * Adds every registered Tre's Tack Shop block that uses a SWEM block
     * entity to the corresponding SWEM BlockEntityType.
     *
     * This MUST be called after block registration has completed.
     */
    public static void apply() {
        addMatchingBlocks(
                BlockEntitySetup.AWARD.get(),
                AwardBlock.class
        );

        addMatchingBlocks(
                BlockEntitySetup.GRAIN_BIN_BLOCK_ENTITY.get(),
                GrainBinBlock.class
        );

        addMatchingBlocks(
                BlockEntitySetup.GRAIN_FEEDER_BLOCK_ENTITY.get(),
                GrainFeederBlock.class
        );

        addMatchingBlocks(
                BlockEntitySetup.SLOW_FEEDER_BLOCK_ENTITY.get(),
                SlowFeederBlock.class
        );

        addMatchingBlocks(
                BlockEntitySetup.TACK_BOX_BLOCK_ENTITY.get(),
                TackBoxBlock.class
        );

        addMatchingBlocks(
                BlockEntitySetup.WHEEL_BARROW_BLOCK_ENTITY.get(),
                WheelBarrowBlock.class
        );
    }

    /**
     * Finds every block registered by Tre's Tack Shop which is an instance
     * of the specified SWEM block class, then adds it to the SWEM
     * BlockEntityType's valid block set.
     */
    private static void addMatchingBlocks(
            BlockEntityType<?> blockEntityType,
            Class<? extends Block> swemBlockClass) {

        try {
            @SuppressWarnings("unchecked")
            Set<Block> validBlocks =
                    new HashSet<>(
                            (Set<Block>) VALID_BLOCKS_FIELD.get(blockEntityType)
                    );

            for (Block block : BuiltInRegistries.BLOCK) {

                ResourceLocation id =
                        BuiltInRegistries.BLOCK.getKey(block);

                if (!TACK_SHOP_NAMESPACE.equals(id.getNamespace())) {
                    continue;
                }

                if (!swemBlockClass.isInstance(block)) {
                    continue;
                }

                validBlocks.add(block);
            }

            VALID_BLOCKS_FIELD.set(blockEntityType, validBlocks);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(
                    "Unable to add Tre's Tack Shop blocks to "
                            + BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(blockEntityType),
                    e
            );
        }
    }
}