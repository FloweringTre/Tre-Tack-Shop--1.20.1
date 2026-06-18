package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.forge.ModRef;
import com.alaharranhonor.swem.forge.community.RackType;
import com.alaharranhonor.swem.forge.community.TackType;
import com.alaharranhonor.swem.forge.community.content.tack.type.*;
import com.alaharranhonor.swem.forge.items.tack.HorseArmorTier;
import com.alaharranhonor.swem.forge.items.tack.SaddlebagItem;
import com.alaharranhonor.swem.forge.items.tack.TackItem;
import com.alaharranhonor.swem.forge.tack.TackItemDefinition;
import com.alaharranhonor.swem.forge.util.ColorUtil;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib.core.object.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AwardShopItems {
    public static final DeferredRegister<Item> REGISTRY;

/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
    public static final List<RegistryObject<Item>> AWARD_DYES;
    public static final List<RegistryObject<Item>> AWARD_FLAGS;

    public static final List<RegistryObject<Item>> AWARD_SIGN_COVERS;

    public static final List<RegistryObject<Item>> AWARD_RIBBON_THREE_TAILS;
    public static final List<RegistryObject<Item>> AWARD_RIBBON_TWO_TAILS;
    public static final List<RegistryObject<Item>> AWARD_RIBBON_ONE_TAIL;
    public static final List<RegistryObject<Item>> AWARD_ROSETTE;

    public static final List<RegistryObject<TackItem>> AWARD_HALTERS;
    public static final List<RegistryObject<TackItem>> AWARD_FLYMASKS;
    public static final List<RegistryObject<TackItem>> AWARD_PASTURE_BLANKETS;
    public static final List<RegistryObject<TackItem>> AWARD_PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_SADDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_BRIDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_BLANKETS;
    public static final List<RegistryObject<TackItem>> AWARD_ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_CLOTH_HORSE_ARMORS;
    public static final List<RegistryObject<TackItem>> AWARD_AMETHYST_HORSE_ARMORS;
    public static final List<RegistryObject<SaddlebagItem>> AWARD_SADDLE_BAGS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_SADDLES;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_BRIDLES;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_BLANKETS;
    public static final List<RegistryObject<TackItem>> AWARD_WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_SADDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_BRIDLES;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_BLANKETS;
    public static final List<RegistryObject<TackItem>> AWARD_ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<TackItem>> AWARD_QUARTER_SHEETS;



    public AwardShopItems() {
    }
    public static void init(IEventBus eventBus) {  REGISTRY.register(eventBus); }

    static {
        REGISTRY = DeferredRegister.create(Keys.ITEMS, "tretackshop");

/// ════════════════════════════════════ AWARD SETS (Blank Sets) ════════════════════════════════════ ///
        AWARD_DYES = new ArrayList<>();
        AWARD_FLAGS = new ArrayList<>();

        AWARD_SIGN_COVERS = new ArrayList<>();

        AWARD_RIBBON_THREE_TAILS = new ArrayList<>();
        AWARD_RIBBON_TWO_TAILS = new ArrayList<>();
        AWARD_RIBBON_ONE_TAIL = new ArrayList<>();
        AWARD_ROSETTE = new ArrayList<>();

        AWARD_HALTERS = new ArrayList<>();
        AWARD_FLYMASKS = new ArrayList<>();
        AWARD_PASTURE_BLANKETS = new ArrayList<>();
        AWARD_PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        AWARD_ADVENTURE_SADDLES = new ArrayList<>();
        AWARD_ADVENTURE_BRIDLES = new ArrayList<>();
        AWARD_ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        AWARD_ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        AWARD_ADVENTURE_BLANKETS = new ArrayList<>();
        AWARD_ADVENTURE_LEG_WRAPS = new ArrayList<>();
        AWARD_CLOTH_HORSE_ARMORS = new ArrayList<>();
        AWARD_AMETHYST_HORSE_ARMORS = new ArrayList<>();
        AWARD_SADDLE_BAGS = new ArrayList<>();
        AWARD_WESTERN_SADDLES = new ArrayList<>();
        AWARD_WESTERN_BRIDLES = new ArrayList<>();
        AWARD_WESTERN_BREAST_COLLARS = new ArrayList<>();
        AWARD_WESTERN_GIRTH_STRAPS = new ArrayList<>();
        AWARD_WESTERN_BLANKETS = new ArrayList<>();
        AWARD_WESTERN_LEG_WRAPS = new ArrayList<>();
        AWARD_ENGLISH_SADDLES = new ArrayList<>();
        AWARD_ENGLISH_BRIDLES = new ArrayList<>();
        AWARD_ENGLISH_BREAST_COLLARS = new ArrayList<>();
        AWARD_ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        AWARD_ENGLISH_BLANKETS = new ArrayList<>();
        AWARD_ENGLISH_LEG_WRAPS = new ArrayList<>();
        AWARD_QUARTER_SHEETS = new ArrayList<>();

        int var5 = 24;
        for (int var2 = 0; var2 < var5; ++var2) {
            int counter = var2+1;
            AWARD_DYES.add(REGISTRY.register("award_dye_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            AWARD_FLAGS.add(REGISTRY.register("award_flag_" + counter, () ->
                    new Item(new Item.Properties())
            ));

            AWARD_SIGN_COVERS.add(REGISTRY.register("award_sign_cover_" + counter, () ->
                    new Item(new Item.Properties())
            ));

            AWARD_RIBBON_THREE_TAILS.add(REGISTRY.register("award_ribbon_three_tails_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            AWARD_RIBBON_TWO_TAILS.add(REGISTRY.register("award_ribbon_two_tails_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            AWARD_RIBBON_ONE_TAIL.add(REGISTRY.register("award_ribbon_one_tail_" + counter, () ->
                    new Item(new Item.Properties())
            ));
            AWARD_ROSETTE.add(REGISTRY.register("award_rosette_" + counter, () ->
                    new Item(new Item.Properties())
            ));

            AWARD_HALTERS.add(REGISTRY.register("award_halter_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_FLYMASKS.add(REGISTRY.register("award_flymask_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.HALTER).withData(new TackTypeData
                            (false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_PASTURE_BLANKETS.add(REGISTRY.register("award_pasture_blanket_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET).withData(
                                    new PastureBlanketTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE), false))
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/award/rack_award_pasture_blanket_" + counter + "_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/award/rack_award_pasture_blanket_" + counter + "_5_long.png"))
                            .build(), (new Item.Properties()).stacksTo(64))

            ));
            AWARD_PASTURE_BLANKETS_ARMORED.add(REGISTRY.register("award_pasture_blanket_" + counter + "_armored",
                    () -> new TackItem(TackItemDefinition.builder(TackType.PASTURE_BLANKET)
                            .rackTexture(RackType.PASTURE_BLANKET_SHORT_3,
                                    ModRef.res("textures/entity/rack/pasture_blanket/award/rack_award_pasture_blanket_armored_" + counter + "_3_short.png"))
                            .rackTexture(RackType.PASTURE_BLANKET_LONG_5,
                                    ModRef.res("textures/entity/rack/pasture_blanket/award/rack_award_pasture_blanket_armored_" + counter + "_5_long.png"))
                            .withData(new PastureBlanketTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE), true)).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_SADDLES.add(REGISTRY.register("award_adventure_saddle_" + counter, () ->
                    new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            "adventure")).build(), (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_BRIDLES .add(REGISTRY.register("award_adventure_bridle_"+ counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)
                                    , "western")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_BREAST_COLLARS.add(REGISTRY.register("award_adventure_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_GIRTH_STRAPS .add(REGISTRY.register("award_adventure_girth_strap_"+ counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(true, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/award/award_adventure_girth_strap_" + counter + ".png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_BLANKETS.add(REGISTRY.register("award_adventure_blanket_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/award/award_adventure_blanket_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/award/award_adventure_blanket_" + counter + ".png"))
                            .withData(new TackTypeData(true, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ADVENTURE_LEG_WRAPS.add(REGISTRY.register("award_adventure_leg_wraps_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_CLOTH_HORSE_ARMORS.add(REGISTRY.register("award_cloth_horse_armor_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            HorseArmorTier.CLOTH.getTierName())).build(), (new Item.Properties()).stacksTo(64))
            ));
            AWARD_AMETHYST_HORSE_ARMORS.add(REGISTRY.register("award_amethyst_horse_armor_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.HORSE_ARMOR).withData(new HorseArmorTypeData(
                            true, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            HorseArmorTier.AMETHYST.getTierName())).build(), (new Item.Properties()).stacksTo(64))
            ));
            AWARD_SADDLE_BAGS.add(REGISTRY.register("award_saddle_bag_" + counter, () ->
                    new SaddlebagItem(TackItemDefinition.builder(TackType.SADDLE_BAG).withData(new TackTypeData(
                            true, Collections.emptySet(),
                            ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_SADDLES.add(REGISTRY.register("award_western_saddle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            "western")).build(), (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_BRIDLES.add(REGISTRY.register("award_western_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)
                                    , "western")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_BREAST_COLLARS.add(REGISTRY.register("award_western_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_GIRTH_STRAPS.add(REGISTRY.register("award_western_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/award/award_western_girth_strap_" + counter + ".png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_BLANKETS.add(REGISTRY.register("award_western_blanket_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/award/award_western_blanket_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/award/award_western_blanket_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_WESTERN_LEG_WRAPS.add(REGISTRY.register("award_western_leg_wraps_" + counter,
                    (() -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64)))
            ));
            AWARD_ENGLISH_SADDLES.add(REGISTRY.register("award_english_saddle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.SADDLE).withData(new SaddleTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE),
                            "english")).build(), (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ENGLISH_BRIDLES.add(REGISTRY.register("award_english_bridle_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BRIDLE).withData(
                            new BridleTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE)
                                    , "english")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ENGLISH_BREAST_COLLARS.add(REGISTRY.register("award_english_breast_collar_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ENGLISH_GIRTH_STRAPS.add(REGISTRY.register("award_english_girth_strap_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.GIRTH_STRAP).withData(
                                    new GirthStrapTypeData(false, Collections.emptySet(),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE),
                                            ColorUtil.ofDyeColor(DyeColor.WHITE)))
                            .rackTexture(RackType.SADDLE,
                                    ModRef.res("textures/entity/rack/saddle/award/award_english_girth_strap_" + counter + ".png")).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ENGLISH_BLANKETS.add(REGISTRY.register("award_english_blanket_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BLANKET)
                            .rackTexture(RackType.SADDLE, ModRef.res
                                    ("textures/entity/rack/saddle/award/award_english_blanket_" + counter + ".png"))
                            .rackTexture(RackType.BLANKET_5, ModRef.res
                                    ("textures/entity/rack/blanket_5/award/award_english_blanket_" + counter + ".png"))
                            .withData(new TackTypeData(false, Collections.emptySet(),
                                    ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_ENGLISH_LEG_WRAPS.add(REGISTRY.register("award_english_leg_wraps_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.LEG_WRAPS).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
            AWARD_QUARTER_SHEETS.add(REGISTRY.register("award_quarter_sheet_" + counter,
                    () -> new TackItem(TackItemDefinition.builder(TackType.BREAST_COLLAR).withData(new TackTypeData(
                            false, Collections.emptySet(), ColorUtil.ofDyeColor(DyeColor.WHITE))).build(),
                            (new Item.Properties()).stacksTo(64))
            ));
        }
    }
}