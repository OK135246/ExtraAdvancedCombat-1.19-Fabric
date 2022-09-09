package net.OK135246.extraadvancedcombat.item;

import net.OK135246.extraadvancedcombat.ExtraAdvancedCombat;
import net.OK135246.extraadvancedcombat.item.custom.ModAxeItem;
import net.OK135246.extraadvancedcombat.item.custom.ModHoeItem;
import net.OK135246.extraadvancedcombat.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
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

    public static final Item ADVANCED_WOODEN_SHOVEL = registerItem("advanced_wooden_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_WOOD, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_STONE_SHOVEL = registerItem("advanced_stone_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_STONE, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_IRON_SHOVEL = registerItem("advanced_iron_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_IRON, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_GOLD_SHOVEL = registerItem("advanced_gold_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_GOLD, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_DIAMOND_SHOVEL = registerItem("advanced_diamond_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_DIAMOND, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_EMERALD_SHOVEL = registerItem("advanced_emerald_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_EMERALD, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHERITE_SHOVEL = registerItem("advanced_netherite_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_NETHERITE, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item NETHER_STAR_SHOVEL = registerItem("nether_star_shovel",
            new ShovelItem(ModToolMaterials.NETHER_STAR, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHER_STAR_SHOVEL = registerItem("advanced_nether_star_shovel",
            new ShovelItem(ModToolMaterials.ADVANCED_NETHER_STAR, 0, -2.4f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_WOODEN_HOE = registerItem("advanced_wooden_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_WOOD, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_STONE_HOE = registerItem("advanced_stone_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_STONE, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_IRON_HOE = registerItem("advanced_iron_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_IRON, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_GOLD_HOE = registerItem("advanced_gold_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_GOLD, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_DIAMOND_HOE = registerItem("advanced_diamond_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_DIAMOND, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterials.EMERALD, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_EMERALD_HOE = registerItem("advanced_emerald_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_EMERALD, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHERITE_HOE = registerItem("advanced_netherite_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_NETHERITE, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item NETHER_STAR_HOE = registerItem("nether_star_hoe",
            new ModHoeItem(ModToolMaterials.NETHER_STAR, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHER_STAR_HOE = registerItem("advanced_nether_star_hoe",
            new ModHoeItem(ModToolMaterials.ADVANCED_NETHER_STAR, -2, -2.2f,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_LEATHER_HELMET = registerItem("advanced_leather_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_LEATHER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_LEATHER_CHESTPLATE = registerItem("advanced_leather_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_LEATHER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_LEATHER_LEGGINGS = registerItem("advanced_leather_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_LEATHER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_LEATHER_BOOTS = registerItem("advanced_leather_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_LEATHER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_CHAINMAIL_HELMET = registerItem("advanced_chainmail_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_CHAIN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_CHAINMAIL_CHESTPLATE = registerItem("advanced_chainmail_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_CHAIN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_CHAINMAIL_LEGGINGS = registerItem("advanced_chainmail_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_CHAIN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_CHAINMAIL_BOOTS = registerItem("advanced_chainmail_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_CHAIN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_IRON_HELMET = registerItem("advanced_iron_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_IRON_CHESTPLATE = registerItem("advanced_iron_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_IRON_LEGGINGS = registerItem("advanced_iron_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_IRON_BOOTS = registerItem("advanced_iron_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_IRON, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_GOLD_HELMET = registerItem("advanced_gold_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_GOLD_CHESTPLATE = registerItem("advanced_gold_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_GOLD_LEGGINGS = registerItem("advanced_gold_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_GOLD_BOOTS = registerItem("advanced_gold_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_GOLD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_DIAMOND_HELMET = registerItem("advanced_diamond_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_DIAMOND_CHESTPLATE = registerItem("advanced_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_DIAMOND_LEGGINGS = registerItem("advanced_diamond_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_DIAMOND_BOOTS = registerItem("advanced_diamond_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_DIAMOND, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHERITE_HELMET = registerItem("advanced_netherite_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHERITE_CHESTPLATE = registerItem("advanced_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHERITE_LEGGINGS = registerItem("advanced_netherite_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHERITE_BOOTS = registerItem("advanced_netherite_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCEDEMERALD_HELMET = registerItem("advanced_emerald_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_EMERALD_CHESTPLATE = registerItem("advanced_emerald_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_EMERALD_LEGGINGS = registerItem("advanced_emerald_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_EMERALD_BOOTS = registerItem("advanced_emerald_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item NETHER_STAR_HELMET = registerItem("nether_star_helmet",
            new ArmorItem(ModArmorMaterials.NETHER_STAR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item NETHER_STAR_CHESTPLATE = registerItem("nether_star_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_STAR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item NETHER_STAR_LEGGINGS = registerItem("nether_star_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_STAR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item NETHER_STAR_BOOTS = registerItem("nether_star_boots",
            new ArmorItem(ModArmorMaterials.NETHER_STAR, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_NETHER_STAR_HELMET = registerItem("advanced_nether_star_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHER_STAR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHER_STAR_CHESTPLATE = registerItem("advanced_nether_star_chestplate",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHER_STAR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHER_STAR_LEGGINGS = registerItem("advanced_nether_star_leggings",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHER_STAR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item ADVANCED_NETHER_STAR_BOOTS = registerItem("advanced_nether_star_boots",
            new ArmorItem(ModArmorMaterials.ADVANCED_NETHER_STAR, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item ADVANCED_TURTLE_HELMET = registerItem("advanced_turtle_helmet",
            new ArmorItem(ModArmorMaterials.ADVANCED_TURTLE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraAdvancedCombat.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ExtraAdvancedCombat.LOGGER.debug("Registering Mod Items for" + ExtraAdvancedCombat.MOD_ID);
    }
}
