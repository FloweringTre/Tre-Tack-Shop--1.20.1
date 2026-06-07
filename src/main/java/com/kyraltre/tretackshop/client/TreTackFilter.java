package com.kyraltre.tretackshop.client;

import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ziyue.filters.Filter;
import ziyue.filters.FilterBuilder;

@Mod.EventBusSubscriber(modid = "tretackshop", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TreTackFilter {

    public static Filter UNCATEGORIZED;
    public static Filter TROPHIES;
    public static Filter MORPHO;
    public static Filter MONARCH;
    public static Filter RAINBOW;
    public static Filter HOUND;
    public static Filter ROSE;
    public static Filter SALMON;
    public static Filter SUNSHINE;
    public static Filter MINT;
    public static Filter ARCTIC;
    public static Filter LAVENDER;
    public static Filter FUCHSIA;
    public static Filter RUBY;
    public static Filter DANDELION;
    public static Filter EMERALD;
    public static Filter NAVY;
    public static Filter ORCHID;
    public static Filter CREAMSICLE;
    public static Filter TOPAZ;
    public static Filter BLACK;
    public static Filter BLUE;
    public static Filter BROWN;
    public static Filter CYAN;
    public static Filter GRAY;
    public static Filter GREEN;
    public static Filter LIGHT_BLUE;
    public static Filter LIGHT_GRAY;
    public static Filter LIME;
    public static Filter MAGENTA;
    public static Filter ORANGE;
    public static Filter PINK;
    public static Filter PURPLE;
    public static Filter RED;
    public static Filter WHITE;
    public static Filter YELLOW;
    public static Filter AWARD_1;
    public static Filter AWARD_2;
    public static Filter AWARD_3;
    public static Filter AWARD_4;
    public static Filter AWARD_5;
    public static Filter AWARD_6;
    public static Filter AWARD_7;
    public static Filter AWARD_8;
    public static Filter AWARD_9;
    public static Filter AWARD_10;
    public static Filter AWARD_11;
    public static Filter AWARD_12;
    public static Filter AWARD_13;
    public static Filter AWARD_14;
    public static Filter AWARD_15;
    public static Filter AWARD_16;
    public static Filter AWARD_17;
    public static Filter AWARD_18;
    public static Filter AWARD_19;
    public static Filter AWARD_20;
    public static Filter AWARD_21;
    public static Filter AWARD_22;
    public static Filter AWARD_23;
    public static Filter AWARD_24;

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

            UNCATEGORIZED = FilterBuilder.registerUncategorizedItemsFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.misc"),
                    () -> new ItemStack(TackShopItems.BUTTERFLY.get())
            );

            // Register Filters (ORDER = UI ORDER)
            TROPHIES = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.trophies"),
                    () -> new ItemStack(TackShopItems.BUTTERFLY.get())
            );
            MORPHO = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.morpho"),
                    () -> new ItemStack(TackShopItems.BUTTERFLY.get())
            );
            MONARCH = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.monarch"),
                    () -> new ItemStack(TackShopItems.BUTTERFLY_MONARCH.get())
            );
            RAINBOW = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.rainbow"),
                    () -> new ItemStack(TackShopItems.RAINBOW_INA_BOTTLE.get())
            );
            HOUND = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.hound"),
                    () -> new ItemStack(TackShopItems.PAW_PRINT.get())
            );
            ROSE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.rose"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(0).get())
            );
            SALMON = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.salmon"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(1).get())
            );
            SUNSHINE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.sunshine"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(2).get())
            );
            MINT = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.mint"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(3).get())
            );
            ARCTIC = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.arctic"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(4).get())
            );
            LAVENDER = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.lavender"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(5).get())
            );
            FUCHSIA = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.fuchsia"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(6).get())
            );
            RUBY = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.ruby"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(7).get())
            );
            DANDELION = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.dandelion"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(8).get())
            );
            EMERALD = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.emerald"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(9).get())
            );
            NAVY = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.navy"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(10).get())
            );
            ORCHID = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.orchid"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(11).get())
            );
            CREAMSICLE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.creamsicle"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(12).get())
            );
            TOPAZ = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.topaz"),
                    () -> new ItemStack(TackShopItems.TRE_ROSETTE.get(13).get())
            );
            BLACK = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.black"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(15).get())
            );
            BLUE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.blue"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(11).get())
            );
            BROWN = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.brown"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(12).get())
            );
            CYAN = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.cyan"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(9).get())
            );
            GRAY = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.gray"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(7).get())
            );
            GREEN = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.green"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(13).get())
            );
            LIGHT_BLUE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.light_blue"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(3).get())
            );
            LIGHT_GRAY = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.light_gray"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(8).get())
            );
            LIME = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.lime"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(5).get())
            );
            MAGENTA = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.magenta"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(2).get())
            );
            ORANGE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.orange"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(1).get())
            );
            PINK = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.pink"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(6).get())
            );
            PURPLE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.purple"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(10).get())
            );
            RED = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.red"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(14).get())
            );
            WHITE = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.white"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(0).get())
            );
            YELLOW = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.yellow"),
                    () -> new ItemStack(TackShopItems.ROSETTE.get(4).get())
            );
            AWARD_1 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_1"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(0).get())
            );
            AWARD_2 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_2"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(1).get())
            );
            AWARD_3 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_3"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(2).get())
            );
            AWARD_4 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_4"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(3).get())
            );
            AWARD_5 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_5"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(4).get())
            );
            AWARD_6 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_6"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(5).get())
            );
            AWARD_7 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_7"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(6).get())
            );
            AWARD_8 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_8"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(7).get())
            );
            AWARD_9 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_9"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(8).get())
            );
            AWARD_10 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_10"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(9).get())
            );
            AWARD_11 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_11"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(10).get())
            );
            AWARD_12 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_12"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(11).get())
            );
            AWARD_13 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_13"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(12).get())
            );
            AWARD_14 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_14"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(13).get())
            );
            AWARD_15 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_15"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(14).get())
            );
            AWARD_16 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_16"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(15).get())
            );
            AWARD_17 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_17"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(16).get())
            );
            AWARD_18 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_18"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(17).get())
            );
            AWARD_19 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_19"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(18).get())
            );
            AWARD_20 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_20"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(19).get())
            );
            AWARD_21 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_21"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(20).get())
            );
            AWARD_22 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_22"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(21).get())
            );
            AWARD_23 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_23"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(22).get())
            );
            AWARD_24 = FilterBuilder.registerFilter(
                    TackShopCreativeModTab.MAIN.get(),
                    Component.translatable("filter.tretackshop.award_24"),
                    () -> new ItemStack(TackShopItems.AWARD_ROSETTE.get(23).get())
            );
            // AUTO ASSIGN ITEMS TO FILTERS
            TackShopItems.REGISTRY.getEntries().forEach(entry -> {
                String name = entry.getId().getPath();

                if (name.contains("trophy") ||
                        name.contains("medal") ||
                        name.contains("gold") ||
                        name.contains("silver") ||
                        name.contains("bronze") ||
                        name.contains("grand") ||
                        name.contains("reserve") ||
                        name.contains("first") ||
                        name.contains("second") ||
                        name.contains("third") ||
                        name.contains("heart") ||
                        name.contains("snowflake") ||
                        name.contains("champ")
                )
                {
                    TROPHIES.addItems(entry.get());
                }

                if (
                        (name.contains("morpho") || name.contains("butterfly"))
                                && !name.contains("monarch")
                                && !name.matches(".*butterfly_\\d+.*")
                ) {
                    MORPHO.addItems(entry.get());
                }

                if (name.contains("monarch")) {
                    MONARCH.addItems(entry.get());
                }

                if (name.contains("rainbow")) {
                    RAINBOW.addItems(entry.get());
                }

                if (name.contains("hound") ||
                        name.contains("paw_print")) {
                    HOUND.addItems(entry.get());
                }

                if (
                        name.matches(".*_1(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    ROSE.addItems(entry.get());
                }
                if (
                        name.matches(".*_2(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    SALMON.addItems(entry.get());
                }
                if (
                        name.matches(".*_3(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    SUNSHINE.addItems(entry.get());
                }
                if (
                        name.matches(".*_4(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    MINT.addItems(entry.get());
                }
                if (
                        name.matches(".*_5(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    ARCTIC.addItems(entry.get());
                }
                if (
                        name.matches(".*_6(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    LAVENDER.addItems(entry.get());
                }
                if (
                        name.matches(".*_7(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    FUCHSIA.addItems(entry.get());
                }
                if (
                        name.matches(".*_8(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    RUBY.addItems(entry.get());
                }
                if (
                        name.matches(".*_9(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    DANDELION.addItems(entry.get());
                }
                if (
                        name.matches(".*_10(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    EMERALD.addItems(entry.get());
                }
                if (
                        name.matches(".*_11(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    NAVY.addItems(entry.get());
                }
                if (
                        name.matches(".*_12(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    ORCHID.addItems(entry.get());
                }
                if (
                        name.matches(".*_13(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    CREAMSICLE.addItems(entry.get());
                }
                if (
                        name.matches(".*_14(_armored)?$") &&
                                !name.contains("award")
                                &&
                                !name.contains("trophy")
                                &&
                                !name.contains("medal")
                ) {
                    TOPAZ.addItems(entry.get());
                }

                if (
                        name.matches(".*_black(_armored)?$") &&
                                !name.contains("pelham") &&
                                !name.contains("medieval") &&
                                !name.contains("racing")
                ) {
                    BLACK.addItems(entry.get());
                }
                if (
                        name.matches(".*_blue(_armored)?$") &&
                                !name.contains("light")
                ) {
                    BLUE.addItems(entry.get());
                }
                if (
                        name.matches(".*_brown(_armored)?$") &&
                                !name.contains("pelham") &&
                                !name.contains("medieval") &&
                                !name.contains("racing") &&
                                !name.contains("english_bridle_bitless")
                ) {
                    BROWN.addItems(entry.get());
                }
                if (
                        name.matches(".*_cyan(_armored)?$")
                ) {
                    CYAN.addItems(entry.get());
                }
                if (
                        name.matches(".*_gray(_armored)?$") &&
                                !name.contains("light")
                ) {
                    GRAY.addItems(entry.get());
                }
                if (
                        name.matches(".*_green(_armored)?$")
                ) {
                    GREEN.addItems(entry.get());
                }
                if (
                        name.matches(".*_light_blue(_armored)?$")
                ) {
                    LIGHT_BLUE.addItems(entry.get());
                }
                if (
                        name.matches(".*_light_gray(_armored)?$")
                ) {
                    LIGHT_GRAY.addItems(entry.get());
                }
                if (
                        name.matches(".*_lime(_armored)?$")
                ) {
                    LIME.addItems(entry.get());
                }
                if (
                        name.matches(".*_magenta(_armored)?$")
                ) {
                    MAGENTA.addItems(entry.get());
                }
                if (
                        name.matches(".*_orange(_armored)?$")
                ) {
                    ORANGE.addItems(entry.get());
                }
                if (
                        name.matches(".*_pink(_armored)?$")
                ) {
                    PINK.addItems(entry.get());
                }
                if (
                        name.matches(".*_purple(_armored)?$")
                ) {
                    PURPLE.addItems(entry.get());
                }
                if (
                        name.matches(".*_red(_armored)?$")
                ) {
                    RED.addItems(entry.get());
                }
                if (
                        name.matches(".*_white(_armored)?$") &&
                                !name.contains("english_bridle_bitless")
                ) {
                    WHITE.addItems(entry.get());
                }
                if (
                        name.matches(".*_yellow(_armored)?$")
                ) {
                    YELLOW.addItems(entry.get());
                }
                if (
                        name.matches(".*_1(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_1.addItems(entry.get());
                }
                if (
                        name.matches(".*_2(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_2.addItems(entry.get());
                }
                if (
                        name.matches(".*_3(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_3.addItems(entry.get());
                }
                if (
                        name.matches(".*_4(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_4.addItems(entry.get());
                }
                if (
                        name.matches(".*_5(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_5.addItems(entry.get());
                }
                if (
                        name.matches(".*_6(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_6.addItems(entry.get());
                }
                if (
                        name.matches(".*_7(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_7.addItems(entry.get());
                }
                if (
                        name.matches(".*_8(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_8.addItems(entry.get());
                }
                if (
                        name.matches(".*_9(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_9.addItems(entry.get());
                }
                if (
                        name.matches(".*_10(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_10.addItems(entry.get());
                }
                if (
                        name.matches(".*_11(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_11.addItems(entry.get());
                }
                if (
                        name.matches(".*_12(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_12.addItems(entry.get());
                }
                if (
                        name.matches(".*_13(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_13.addItems(entry.get());
                }
                if (
                        name.matches(".*_14(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_14.addItems(entry.get());
                }
                if (
                        name.matches(".*_15(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_15.addItems(entry.get());
                }
                if (
                        name.matches(".*_16(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_16.addItems(entry.get());
                }
                if (
                        name.matches(".*_17(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_17.addItems(entry.get());
                }
                if (
                        name.matches(".*_18(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_18.addItems(entry.get());
                }
                if (
                        name.matches(".*_19(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_19.addItems(entry.get());
                }
                if (
                        name.matches(".*_20(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_20.addItems(entry.get());
                }
                if (
                        name.matches(".*_21(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_21.addItems(entry.get());
                }
                if (
                        name.matches(".*_22(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_22.addItems(entry.get());
                }
                if (
                        name.matches(".*_23(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_23.addItems(entry.get());
                }
                if (
                        name.matches(".*_24(_armored)?$") &&
                                name.contains("award")
                ) {
                    AWARD_24.addItems(entry.get());
                }

            });

        });
    }
}