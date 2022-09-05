package net.OK135246.extraadvancedcombat.item;

import net.OK135246.extraadvancedcombat.ExtraAdvancedCombat;
import net.OK135246.extraadvancedcombat.item.custom.ModAxeItem;
import net.OK135246.extraadvancedcombat.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ADVANCED_NETHERITE_SWORD = registerItem("advanced_netherite_sword",
            new SwordItem(ToolMaterials.NETHERITE, 40, -2.3f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_WOODEN_PICKAXE = registerItem("advanced_wooden_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_WOOD, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_STONE_PICKAXE = registerItem("advanced_stone_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_STONE, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_IRON_PICKAXE = registerItem("advanced_iron_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_IRON, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_GOLD_PICKAXE = registerItem("advanced_gold_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_GOLD, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_DIAMOND_PICKAXE = registerItem("advanced_diamond_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_DIAMOND, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterials.EMERALD, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_EMERALD_PICKAXE = registerItem("advanced_emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_EMERALD, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHERITE_PICKAXE = registerItem("advanced_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_NETHERITE, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item NETHER_STAR_PICKAXE = registerItem("nether_star_pickaxe",
            new ModPickaxeItem(ModToolMaterials.NETHER_STAR, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHER_STAR_PICKAXE = registerItem("advanced_nether_star_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADVANCED_NETHER_STAR, 1, -2.6f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_WOODEN_AXE = registerItem("advanced_wooden_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_WOOD, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_STONE_AXE = registerItem("advanced_stone_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_STONE, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_IRON_AXE = registerItem("advanced_iron_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_IRON, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_GOLD_AXE = registerItem("advanced_gold_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_GOLD, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_DIAMOND_AXE = registerItem("advanced_diamond_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_DIAMOND, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterials.EMERALD, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_EMERALD_AXE = registerItem("advanced_emerald_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_EMERALD, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHERITE_AXE = registerItem("advanced_netherite_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_NETHERITE, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item NETHER_STAR_AXE = registerItem("nether_star_axe",
            new ModAxeItem(ModToolMaterials.NETHER_STAR, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHER_STAR_AXE = registerItem("advanced_nether_star_axe",
            new ModAxeItem(ModToolMaterials.ADVANCED_NETHER_STAR, 10, -2.8f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraAdvancedCombat.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ExtraAdvancedCombat.LOGGER.debug("Registering Mod Items for" + ExtraAdvancedCombat.MOD_ID);
    }
}
