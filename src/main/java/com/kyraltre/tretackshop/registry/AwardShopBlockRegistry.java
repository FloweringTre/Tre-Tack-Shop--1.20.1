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
    public static final List<RegistryObject<TackBoxBlock>> AWARD_TACK_BOX;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_HOUND;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MORPHO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MONARCH;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_MONARCH;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_MORPHO;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_HOUND;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_MONARCH;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_MORPHO;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_HOUND;
    public static final List<RegistryObject<Block>> CONE_MORPHO;
    public static final List<RegistryObject<Block>> CONE_MONARCH;
    public static final List<RegistryObject<Block>> CONE_HOUND;

//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_MONARCH;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_MORPHO;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_HOUND;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_MONARCH;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_MORPHO;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_HOUND;

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

//        CONE_HOUND = BLOCKS.register("cone_" + "hound", () -> {
//            return new ConeBase();
//        });

        CONE_MONARCH = new ArrayList();
        CONE_MORPHO = new ArrayList();
        CONE_HOUND = new ArrayList();
        AWARD_TACK_BOX = new ArrayList();
        TACK_BOX_MONARCH = new ArrayList();
        TACK_BOX_MORPHO = new ArrayList();
        TACK_BOX_HOUND = new ArrayList();
        HALF_BARREL_MONARCH = new ArrayList();
        HALF_BARREL_MORPHO = new ArrayList();
        HALF_BARREL_HOUND = new ArrayList();
        SLOW_FEEDER_MONARCH = new ArrayList();
        SLOW_FEEDER_MORPHO = new ArrayList();
        SLOW_FEEDER_HOUND = new ArrayList();
//        GRAIN_FEEDER_MONARCH = new ArrayList();
//        GRAIN_FEEDER_MORPHO = new ArrayList();
//        GRAIN_FEEDER_HOUND = new ArrayList();
//        BIN_GRAIN_MONARCH = new ArrayList();
//        BIN_GRAIN_MORPHO = new ArrayList();
//        BIN_GRAIN_HOUND = new ArrayList();

        for (int var8 = 1; var8 < 2; ++var8) {
            CONE_MORPHO.add(register("cone_" + "morpho", () -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            CONE_MONARCH.add(register("cone_" + "monarch", () -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            CONE_HOUND.add(register("cone_" + "hound", () -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
                TACK_BOX_MORPHO.add(register("tack_box_" + "morpho", () -> {
                    return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
                }, (block) -> {
                    return () -> {
                        return new TackBoxBlockItem((Block) block.get());
                    };
                }));
                TACK_BOX_MONARCH.add(register("tack_box_" + "monarch", () -> {
                    return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
                }, (block) -> {
                    return () -> {
                        return new TackBoxBlockItem((Block) block.get());
                    };
                }));
                TACK_BOX_HOUND.add(register("tack_box_" + "hound", () -> {
                    return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
                }, (block) -> {
                    return () -> {
                        return new TackBoxBlockItem((Block) block.get());
                    };
                }));
            HALF_BARREL_MONARCH.add(register("half_barrel_"+ "monarch", () -> {
                return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            HALF_BARREL_MORPHO.add(register("half_barrel_"+ "morpho", () -> {
                return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            HALF_BARREL_HOUND.add(register("half_barrel_"+ "hound", () -> {
                return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SLOW_FEEDER_MONARCH.add(register("slow_feeder_"+ "monarch", () -> {
                return new SlowFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SLOW_FEEDER_MORPHO.add(register("slow_feeder_"+ "morpho", () -> {
                return new SlowFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SLOW_FEEDER_HOUND.add(register("slow_feeder_"+ "hound", () -> {
                return new SlowFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            GRAIN_FEEDER_MONARCH.add(register("grain_feeder_"+ "monarch", () -> {
//                return new GrainFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
//            GRAIN_FEEDER_MORPHO.add(register("grain_feeder_"+ "morpho", () -> {
//                return new GrainFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
//            GRAIN_FEEDER_HOUND.add(register("grain_feeder_"+ "hound", () -> {
//                return new GrainFeederBlock(Properties.of().sound(SoundType.METAL).strength(3.0F, 4.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
//            BIN_GRAIN_MONARCH.add(register("bin_grain_" + "monarch", () -> {
//                return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//            }));
//            BIN_GRAIN_MORPHO.add(register("bin_grain_" + "morpho", () -> {
//                return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
//            BIN_GRAIN_HOUND.add(register("bin_grain_" + "hound", () -> {
//                return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//            }));
            }

                for (int var4 = 0; var4 < 14; ++var4) {
                    int counter = var4 + 1;

                    AWARD_TACK_BOX.add(register("award_tack_box_" + counter, () -> {
                        return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
                    }, (block) -> {
                        return () -> {
                            return new TackBoxBlockItem((Block) block.get());
                        };
                    }));

                }
    }
}
