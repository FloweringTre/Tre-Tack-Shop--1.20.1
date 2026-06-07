//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.alaharranhonor.swem.forge.blocks.*;
import com.alaharranhonor.swem.forge.items.TackBoxBlockItem;
import com.alaharranhonor.swem.forge.blocks.GrainBinBlock;
import com.alaharranhonor.swem.forge.tileentity.GrainBinBE;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
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

public class TackShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;
/// ════════════════════════════════════ ONE OFF TACK BOXES ════════════════════════════════════ ///
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BAMBOO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_SWDM_BAMBOO;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_WHITEWASH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_THATCH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MANGROVE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_CHERRY;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_ACACIA;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_BIRCH;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_CRIMSON;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_JUNGLE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_DARK_OAK;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_OAK;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_SPRUCE;
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_WARPED;

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MORPHO;
    public static final List<RegistryObject<Block>> CONE_MORPHO;
//    public static final List<RegistryObject<WheelBarrowBlock>> WHEELBARROW_MORPHO;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_MORPHO;
    public static final List<RegistryObject<SeparatorBlock>> SEPARATOR_MORPHO;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_MORPHO;
    public static final List<RegistryObject<HorseDoorBlock>> PASTURE_GATE_HORSE_MORPHO;
    public static final List<RegistryObject<CareDoorBlock>> PASTURE_GATE_CARE_MORPHO;
    public static final List<RegistryObject<CareDoorHalfBlock>> WEB_GUARD_CARE_MORPHO;
    public static final List<RegistryObject<HorseDoorHalfBlock>> WEB_GUARD_HORSE_MORPHO;
    public static final List<RegistryObject<HalfDoorBlock>> WEB_GUARD_RIDER_MORPHO;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_MORPHO;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_MORPHO;

/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_MONARCH;
    public static final List<RegistryObject<Block>> CONE_MONARCH;
//    public static final List<RegistryObject<WheelBarrowBlock>> WHEELBARROW_MONARCH;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_MONARCH;
    public static final List<RegistryObject<SeparatorBlock>> SEPARATOR_MONARCH;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_MONARCH;
    public static final List<RegistryObject<HorseDoorBlock>> PASTURE_GATE_HORSE_MONARCH;
    public static final List<RegistryObject<CareDoorBlock>> PASTURE_GATE_CARE_MONARCH;
    public static final List<RegistryObject<CareDoorHalfBlock>> WEB_GUARD_CARE_MONARCH;
    public static final List<RegistryObject<HorseDoorHalfBlock>> WEB_GUARD_HORSE_MONARCH;
    public static final List<RegistryObject<HalfDoorBlock>> WEB_GUARD_RIDER_MONARCH;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_MONARCH;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_MONARCH;

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_RAINBOW;
    public static final List<RegistryObject<Block>> CONE_RAINBOW;
//    public static final List<RegistryObject<WheelBarrowBlock>> WHEELBARROW_RAINBOW;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_RAINBOW;
    public static final List<RegistryObject<SeparatorBlock>> SEPARATOR_RAINBOW;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_RAINBOW;
    public static final List<RegistryObject<HorseDoorBlock>> PASTURE_GATE_HORSE_RAINBOW;
    public static final List<RegistryObject<CareDoorBlock>> PASTURE_GATE_CARE_RAINBOW;
    public static final List<RegistryObject<CareDoorHalfBlock>> WEB_GUARD_CARE_RAINBOW;
    public static final List<RegistryObject<HorseDoorHalfBlock>> WEB_GUARD_HORSE_RAINBOW;
    public static final List<RegistryObject<HalfDoorBlock>> WEB_GUARD_RIDER_RAINBOW;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_RAINBOW;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_RAINBOW;

/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
public static final List<RegistryObject<TackBoxBlock>> TACK_BOX_HOUND;
    public static final List<RegistryObject<Block>> CONE_HOUND;
//    public static final List<RegistryObject<WheelBarrowBlock>> WHEELBARROW_HOUND;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDER_HOUND;
    public static final List<RegistryObject<SeparatorBlock>> SEPARATOR_HOUND;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDER_HOUND;
    public static final List<RegistryObject<HorseDoorBlock>> PASTURE_GATE_HORSE_HOUND;
    public static final List<RegistryObject<CareDoorBlock>> PASTURE_GATE_CARE_HOUND;
    public static final List<RegistryObject<CareDoorHalfBlock>> WEB_GUARD_CARE_HOUND;
    public static final List<RegistryObject<HorseDoorHalfBlock>> WEB_GUARD_HORSE_HOUND;
    public static final List<RegistryObject<HalfDoorBlock>> WEB_GUARD_RIDER_HOUND;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARREL_HOUND;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAIN_HOUND;

/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
    public static final List<RegistryObject<TackBoxBlock>> TACK_BOXES;
    public static final List<RegistryObject<Block>> CONES;
//    public static final List<RegistryObject<WheelBarrowBlock>> WHEELBARROWS;
    public static final List<RegistryObject<SlowFeederBlock>> SLOW_FEEDERS;
    public static final List<RegistryObject<SeparatorBlock>> SEPARATORS;
//    public static final List<RegistryObject<GrainFeederBlock>> GRAIN_FEEDERS;
    public static final List<RegistryObject<HorseDoorBlock>> PASTURE_GATE_HORSES;
    public static final List<RegistryObject<CareDoorBlock>> PASTURE_GATE_CARES;
    public static final List<RegistryObject<CareDoorHalfBlock>> WEB_GUARD_CARES;
    public static final List<RegistryObject<HorseDoorHalfBlock>> WEB_GUARD_HORSES;
    public static final List<RegistryObject<HalfDoorBlock>> WEB_GUARD_RIDERS;
    public static final List<RegistryObject<HalfBarrelBlock>> HALF_BARRELS;
//    public static final List<RegistryObject<GrainBinBlock>> BIN_GRAINS;


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

    public TackShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        TackShopItems.REGISTRY.register(name, (Supplier) itemCreator.apply(ret));
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
/// ════════════════════════════════════ ONE OFF TACK BOXES ════════════════════════════════════ ///
        TACK_BOX_BAMBOO = new ArrayList();
        TACK_BOX_SWDM_BAMBOO = new ArrayList();
        TACK_BOX_CHERRY = new ArrayList();
        TACK_BOX_MANGROVE = new ArrayList();
        TACK_BOX_THATCH = new ArrayList();
        TACK_BOX_WHITEWASH  = new ArrayList();
        TACK_BOX_ACACIA = new ArrayList();
        TACK_BOX_BIRCH = new ArrayList();
        TACK_BOX_CRIMSON = new ArrayList();
        TACK_BOX_DARK_OAK = new ArrayList();
        TACK_BOX_JUNGLE = new ArrayList();
        TACK_BOX_OAK = new ArrayList();
        TACK_BOX_SPRUCE = new ArrayList();
        TACK_BOX_WARPED = new ArrayList<>();

        TACK_BOX_ACACIA.add(register("tack_box_" + "acacia", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_BIRCH.add(register("tack_box_" + "birch", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_CRIMSON.add(register("tack_box_" + "crimson", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_DARK_OAK.add(register("tack_box_" + "dark_oak", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_JUNGLE.add(register("tack_box_" + "jungle", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_OAK.add(register("tack_box_" + "oak", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_SPRUCE.add(register("tack_box_" + "spruce", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_WARPED.add(register("tack_box_" + "warped", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));

        TACK_BOX_SWDM_BAMBOO.add(register("tack_box_" + "swdm_bamboo", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_CHERRY.add(register("tack_box_" + "cherry", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_BAMBOO.add(register("tack_box_" + "bamboo", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_MANGROVE.add(register("tack_box_" + "mangrove", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_THATCH.add(register("tack_box_" + "thatch", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        TACK_BOX_WHITEWASH.add(register("tack_box_" + "whitewash", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));

/// ════════════════════════════════════ MORPHO ════════════════════════════════════ ///
        TACK_BOX_MORPHO = new ArrayList();
        CONE_MORPHO = new ArrayList();
//        WHEELBARROW_MORPHO = new ArrayList();
        SLOW_FEEDER_MORPHO = new ArrayList();
        SEPARATOR_MORPHO = new ArrayList();
//        GRAIN_FEEDER_MORPHO = new ArrayList();
        PASTURE_GATE_HORSE_MORPHO = new ArrayList();
        PASTURE_GATE_CARE_MORPHO = new ArrayList();
        WEB_GUARD_CARE_MORPHO = new ArrayList();
        WEB_GUARD_HORSE_MORPHO = new ArrayList();
        WEB_GUARD_RIDER_MORPHO = new ArrayList();
        HALF_BARREL_MORPHO = new ArrayList();
//        BIN_GRAIN_MORPHO = new ArrayList();

        TACK_BOX_MORPHO.add(register("tack_box_" + "morpho", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_MORPHO.add(register("cone_" + "morpho", () -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
//        WHEELBARROW_MORPHO.add(register("wheelbarrow_" + "morpho", () -> {
//            return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        SLOW_FEEDER_MORPHO.add(register("slow_feeder_" + "morpho", () -> {
            return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_MORPHO.add(register("separator_" + "morpho", () -> {
            return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        GRAIN_FEEDER_MORPHO.add(register("grain_feeder_" + "morpho", () -> {
//            return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        PASTURE_GATE_HORSE_MORPHO.add(register("pasture_gate_horse_" + "morpho", () -> {
            return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_MORPHO.add(register("pasture_gate_care_" + "morpho", () -> {
            return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_MORPHO.add(register("web_guard_care_" + "morpho", () -> {
            return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_MORPHO.add(register("web_guard_horse_" + "morpho", () -> {
            return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_MORPHO.add(register("web_guard_rider_" + "morpho", () -> {
            return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_MORPHO.add(register("half_barrel_" + "morpho", () -> {
            return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        BIN_GRAIN_MORPHO.add(register("bin_grain_" + "morpho", () -> {
//            return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));


/// ════════════════════════════════════ MONARCH ════════════════════════════════════ ///
        TACK_BOX_MONARCH = new ArrayList();
        CONE_MONARCH = new ArrayList();
//        WHEELBARROW_MONARCH = new ArrayList();
        SLOW_FEEDER_MONARCH = new ArrayList();
        SEPARATOR_MONARCH = new ArrayList();
//        GRAIN_FEEDER_MONARCH = new ArrayList();
        PASTURE_GATE_HORSE_MONARCH = new ArrayList();
        PASTURE_GATE_CARE_MONARCH = new ArrayList();
        WEB_GUARD_CARE_MONARCH = new ArrayList();
        WEB_GUARD_HORSE_MONARCH = new ArrayList();
        WEB_GUARD_RIDER_MONARCH = new ArrayList();
        HALF_BARREL_MONARCH = new ArrayList();
//        BIN_GRAIN_MONARCH = new ArrayList();

        TACK_BOX_MONARCH.add(register("tack_box_" + "monarch", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_MONARCH.add(register("cone_" + "monarch", () -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
//        WHEELBARROW_MONARCH.add(register("wheelbarrow_" + "monarch", () -> {
//            return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        SLOW_FEEDER_MONARCH.add(register("slow_feeder_" + "monarch", () -> {
            return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_MONARCH.add(register("separator_" + "monarch", () -> {
            return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        GRAIN_FEEDER_MONARCH.add(register("grain_feeder_" + "monarch", () -> {
//            return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        PASTURE_GATE_HORSE_MONARCH.add(register("pasture_gate_horse_" + "monarch", () -> {
            return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_MONARCH.add(register("pasture_gate_care_" + "monarch", () -> {
            return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_MONARCH.add(register("web_guard_care_" + "monarch", () -> {
            return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_MONARCH.add(register("web_guard_horse_" + "monarch", () -> {
            return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_MONARCH.add(register("web_guard_rider_" + "monarch", () -> {
            return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_MONARCH.add(register("half_barrel_" + "monarch", () -> {
            return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        BIN_GRAIN_MONARCH.add(register("bin_grain_" + "monarch", () -> {
//            return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));

/// ════════════════════════════════════ RAINBOW ════════════════════════════════════ ///
        TACK_BOX_RAINBOW = new ArrayList();
        CONE_RAINBOW = new ArrayList();
//        WHEELBARROW_RAINBOW = new ArrayList();
        SLOW_FEEDER_RAINBOW = new ArrayList();
        SEPARATOR_RAINBOW = new ArrayList();
//        GRAIN_FEEDER_RAINBOW = new ArrayList();
        PASTURE_GATE_HORSE_RAINBOW = new ArrayList();
        PASTURE_GATE_CARE_RAINBOW = new ArrayList();
        WEB_GUARD_CARE_RAINBOW = new ArrayList();
        WEB_GUARD_HORSE_RAINBOW = new ArrayList();
        WEB_GUARD_RIDER_RAINBOW = new ArrayList();
        HALF_BARREL_RAINBOW = new ArrayList();
//        BIN_GRAIN_RAINBOW = new ArrayList();

        TACK_BOX_RAINBOW.add(register("tack_box_" + "rainbow", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_RAINBOW.add(register("cone_" + "rainbow", () -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
//        WHEELBARROW_RAINBOW.add(register("wheelbarrow_" + "rainbow", () -> {
//            return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        SLOW_FEEDER_RAINBOW.add(register("slow_feeder_" + "rainbow", () -> {
            return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_RAINBOW.add(register("separator_" + "rainbow", () -> {
            return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        GRAIN_FEEDER_RAINBOW.add(register("grain_feeder_" + "rainbow", () -> {
//            return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        PASTURE_GATE_HORSE_RAINBOW.add(register("pasture_gate_horse_" + "rainbow", () -> {
            return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_RAINBOW.add(register("pasture_gate_care_" + "rainbow", () -> {
            return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_RAINBOW.add(register("web_guard_care_" + "rainbow", () -> {
            return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_RAINBOW.add(register("web_guard_horse_" + "rainbow", () -> {
            return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_RAINBOW.add(register("web_guard_rider_" + "rainbow", () -> {
            return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_RAINBOW.add(register("half_barrel_" + "rainbow", () -> {
            return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        BIN_GRAIN_RAINBOW.add(register("bin_grain_" + "rainbow", () -> {
//            return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));

/// ════════════════════════════════════ HOUND ════════════════════════════════════ ///
        TACK_BOX_HOUND = new ArrayList();
        CONE_HOUND = new ArrayList();
//        WHEELBARROW_HOUND = new ArrayList();
        SLOW_FEEDER_HOUND = new ArrayList();
        SEPARATOR_HOUND = new ArrayList();
//        GRAIN_FEEDER_HOUND = new ArrayList();
        PASTURE_GATE_HORSE_HOUND = new ArrayList();
        PASTURE_GATE_CARE_HOUND = new ArrayList();
        WEB_GUARD_CARE_HOUND = new ArrayList();
        WEB_GUARD_HORSE_HOUND = new ArrayList();
        WEB_GUARD_RIDER_HOUND = new ArrayList();
        HALF_BARREL_HOUND = new ArrayList();
//        BIN_GRAIN_HOUND = new ArrayList();

        TACK_BOX_HOUND.add(register("tack_box_" + "hound", () -> {
            return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
        }, (block) -> {
            return () -> {
                return new TackBoxBlockItem((Block) block.get());
            };
        }));
        CONE_HOUND.add(register("cone_" + "hound", () -> {
            return new ConeBase();
        }, (block) -> {
            return () -> {
                return new ConeBlockItem((Block) block.get());
            };
        }));
//        WHEELBARROW_HOUND.add(register("wheelbarrow_" + "hound", () -> {
//            return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        SLOW_FEEDER_HOUND.add(register("slow_feeder_" + "hound", () -> {
            return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        SEPARATOR_HOUND.add(register("separator_" + "hound", () -> {
            return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        GRAIN_FEEDER_HOUND.add(register("grain_feeder_" + "hound", () -> {
//            return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));
        PASTURE_GATE_HORSE_HOUND.add(register("pasture_gate_horse_" + "hound", () -> {
            return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        PASTURE_GATE_CARE_HOUND.add(register("pasture_gate_care_" + "hound", () -> {
            return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_CARE_HOUND.add(register("web_guard_care_" + "hound", () -> {
            return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_HORSE_HOUND.add(register("web_guard_horse_" + "hound", () -> {
            return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        WEB_GUARD_RIDER_HOUND.add(register("web_guard_rider_" + "hound", () -> {
            return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
        HALF_BARREL_HOUND.add(register("half_barrel_" + "hound", () -> {
            return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
        }, (block) -> {
            return () -> {
                return new BlockItemBase((Block)block.get());
            };
        }));
//        BIN_GRAIN_HOUND.add(register("bin_grain_" + "hound", () -> {
//            return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//        }, (block) -> {
//            return () -> {
//                return new BlockItemBase((Block)block.get());
//            };
//        }));

/// ════════════════════════════════════ CRAFTABLE NUMBERED (Tackshop Colors) ════════════════════════════════════ ///
        TACK_BOXES = new ArrayList<>();
        CONES = new ArrayList();
//        WHEELBARROWS = new ArrayList();
        SLOW_FEEDERS = new ArrayList();
        SEPARATORS = new ArrayList();
//        GRAIN_FEEDERS = new ArrayList();
        PASTURE_GATE_HORSES = new ArrayList();
        PASTURE_GATE_CARES = new ArrayList();
        WEB_GUARD_CARES = new ArrayList();
        WEB_GUARD_HORSES = new ArrayList();
        WEB_GUARD_RIDERS = new ArrayList();
        HALF_BARRELS = new ArrayList();
//        BIN_GRAINS = new ArrayList();

        int var1 = 15;

        var rContext = new Object() {
            int var2 = 1;
        };
        var rEngColor = new Object() {
            final int varE = 1;
        };
        var rEngOtherColor = new Object() {
            final int varEO = 1;
        };
        var rWestColor = new Object() {
            final int varW = 1;
        };

        while (rContext.var2 < var1) {
            int temp_english_color_value = rEngColor.varE;
            int temp_western_color_value = rWestColor.varW;
            int temp_english_other_color_value = rEngOtherColor.varEO;
            int counter = rContext.var2;
            boolean a = counter < 7;
            boolean b = counter > 6;
            boolean c = counter == 13;
            boolean d = counter == 14;
            if (a) {
                temp_english_color_value = 15;
                temp_western_color_value = 16;
                temp_english_other_color_value = 16;
            }
            if (b) {
                temp_english_color_value = 16;
                temp_western_color_value = 17;
                temp_english_other_color_value = 15;
            }
            if (c) {
                temp_english_color_value = 15;
                temp_western_color_value = 16;
                temp_english_other_color_value = 16;
            }
            if (d) {
                temp_english_color_value = 16;
                temp_western_color_value = 17;
                temp_english_other_color_value = 15;
            }
            int final_western_color_value = temp_western_color_value;
            int final_english_color_value = temp_english_color_value;
            int final_english_other_color_value = temp_english_other_color_value;

            TACK_BOXES.add(register("tack_box_" + counter, () -> {
                return new TackBoxBlock(Properties.of().noOcclusion().sound(SoundType.WOOD).strength(2.0F, 3.0F), 1);
            }, (block) -> {
                return () -> {
                    return new TackBoxBlockItem((Block) block.get());
                };
            }));
            CONES.add(register("cone_" + counter, () -> {
                return new ConeBase();
            }, (block) -> {
                return () -> {
                    return new ConeBlockItem((Block) block.get());
                };
            }));
//            WHEELBARROWS.add(register("wheelbarrow_" + counter, () -> {
//                return new WheelBarrowBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
            SLOW_FEEDERS.add(register("slow_feeder_" + counter, () -> {
                return new SlowFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            SEPARATORS.add(register("separator_" + counter, () -> {
                return new SeparatorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            GRAIN_FEEDERS.add(register("grain_feeder_" + counter, () -> {
//                return new GrainFeederBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));
            PASTURE_GATE_HORSES.add(register("pasture_gate_horse_" + counter, () -> {
                return new HorseDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            PASTURE_GATE_CARES.add(register("pasture_gate_care_" + counter, () -> {
                return new CareDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_CARES.add(register("web_guard_care_" + counter, () -> {
                return new CareDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_HORSES.add(register("web_guard_horse_" + counter, () -> {
                return new HorseDoorHalfBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), BlockSetType.OAK,null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            WEB_GUARD_RIDERS.add(register("web_guard_rider_" + counter, () -> {
                return new HalfDoorBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F), null);
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
            HALF_BARRELS.add(register("half_barrel_" + counter, () -> {
                return new HalfBarrelBlock(Properties.of().noOcclusion().sound(SoundType.METAL).strength(2.0F, 3.0F));
            }, (block) -> {
                return () -> {
                    return new BlockItemBase((Block)block.get());
                };
            }));
//            BIN_GRAINS.add(register("bin_grain_" + counter, () -> {
//                return new GrainBinBlock(Properties.of().strength(1.0F, 2.0F).noOcclusion());
//            }, (block) -> {
//                return () -> {
//                    return new BlockItemBase((Block)block.get());
//                };
//            }));

            ++rContext.var2;
        }


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
            CONES.add(register("award_cone_" + counter, () -> {
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
