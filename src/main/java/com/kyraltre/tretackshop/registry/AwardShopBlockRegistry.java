//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class AwardShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;
/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
    public static final List<RegistryObject<TackBoxBlock>> AWARD_TACK_BOXES;
    public static final List<RegistryObject<Block>> AWARD_CONES;
//    public static final List<RegistryObject<WheelBarrowBlock>> AWARD_WHEELBARROWS;
    public static final List<RegistryObject<SlowFeederBlock>> AWARD_SLOW_FEEDERS;
    public static final List<RegistryObject<SeparatorBlock>> AWARD_SEPARATORS;
//    public static final List<RegistryObject<GrainFeederBlock>> AWARD_GRAIN_FEEDERS;
    public static final List<RegistryObject<HorseDoorBlock>> AWARD_PASTURE_GATE_HORSES;
    public static final List<RegistryObject<CareDoorBlock>> AWARD_PASTURE_GATE_CARES;
    public static final List<RegistryObject<CareDoorHalfBlock>> AWARD_WEB_GUARD_CARES;
    public static final List<RegistryObject<HorseDoorHalfBlock>> AWARD_WEB_GUARD_HORSES;
    public static final List<RegistryObject<HalfDoorBlock>> AWARD_WEB_GUARD_RIDERS;
    public static final List<RegistryObject<HalfBarrelBlock>> AWARD_HALF_BARRELS;
//    public static final List<RegistryObject<GrainBinBlock>> AWARD_BIN_GRAINS;

    public AwardShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        AwardShopItems.REGISTRY.register(name, (Supplier) itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, CreativeModeTab itemGroup) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(Keys.BLOCKS, "tretackshop");
/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
        AWARD_TACK_BOXES = new ArrayList<>();
        AWARD_CONES = new ArrayList();
//        AWARD_WHEELBARROWS = new ArrayList();
        AWARD_SLOW_FEEDERS = new ArrayList();
        AWARD_SEPARATORS = new ArrayList();
//        AWARD_GRAIN_FEEDERS = new ArrayList();
        AWARD_PASTURE_GATE_HORSES = new ArrayList();
        AWARD_PASTURE_GATE_CARES = new ArrayList();
        AWARD_WEB_GUARD_CARES = new ArrayList();
        AWARD_WEB_GUARD_HORSES = new ArrayList();
        AWARD_WEB_GUARD_RIDERS = new ArrayList();
        AWARD_HALF_BARRELS = new ArrayList();
//        AWARD_BIN_GRAINS = new ArrayList();


        int var5 = 24;
        for (int var2 = 0; var2 < var5; ++var2) {
            int counter = var2+1;
            AWARD_TACK_BOXES.add(register("award_tack_box_" + counter, () -> {
                return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            AWARD_CONES.add(register("award_cone_" + counter, () -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new ConeBlockItem((Block) block.get());
                };
            }));
//            AWARD_WHEELBARROWS.add(register("award_wheelbarrow_" + counter, () -> {
//                return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
            AWARD_SLOW_FEEDERS.add(register("award_slow_feeder_" + counter, () -> {
                return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_SEPARATORS.add(register("award_separator_" + counter, () -> {
                return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            AWARD_GRAIN_FEEDERS.add(register("award_grain_feeder_" + counter, () -> {
//                return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
            AWARD_PASTURE_GATE_HORSES.add(register("award_pasture_gate_horse_" + counter, () -> {
                return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_PASTURE_GATE_CARES.add(register("award_pasture_gate_care_" + counter, () -> {
                return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_CARES.add(register("award_web_guard_care_" + counter, () -> {
                return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_HORSES.add(register("award_web_guard_horse_" + counter, () -> {
                return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_WEB_GUARD_RIDERS.add(register("award_web_guard_rider_" + counter, () -> {
                return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            AWARD_HALF_BARRELS.add(register("award_half_barrel_" + counter, () -> {
                return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            AWARD_BIN_GRAINS.add(register("award_bin_grain_" + counter, () -> {
//                return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
       }
    }

}
