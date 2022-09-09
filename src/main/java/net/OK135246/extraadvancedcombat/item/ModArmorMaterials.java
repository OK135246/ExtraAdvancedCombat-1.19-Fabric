package net.OK135246.extraadvancedcombat.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ADVANCED_LEATHER("advanced_leather", 20, new int[]{4, 8, 12, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.LEATHER});
    }),
    ADVANCED_CHAIN("advanced_chainmail", 60, new int[]{6, 10, 14, 8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.5F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    ADVANCED_IRON("advanced_iron", 60, new int[]{8, 12, 16, 10}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.25F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_BLOCK});
    }),
    ADVANCED_GOLD("advanced_gold", 45, new int[]{7, 11, 16, 9}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 5.0F, 0.4F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_BLOCK});
    }),
    ADVANCED_DIAMOND("advanced_diamond", 99, new int[]{10, 16, 18, 13}, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F, 0.6F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND_BLOCK});
    }),
    ADVANCED_TURTLE("advanced_turtle", 75, new int[]{7, 10, 11, 7}, 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 2.5F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.SCUTE});
    }),
    ADVANCED_NETHERITE("advanced_netherite", 125, new int[]{18, 21, 23, 18}, 75, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 7.0F, 0.65F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_BLOCK});
    }),
    EMERALD("emerald", 16, new int[]{3, 7, 8, 5}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5F, 0.5F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    ADVANCED_EMERALD("advanced_emerald", 64, new int[]{9, 13, 15, 11}, 60, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.5F, 0.45F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD_BLOCK});
    }),
    NETHER_STAR("nether_star", 40, new int[]{5, 8, 10, 6}, 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 1.5F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
    }),
    ADVANCED_NETHER_STAR("advanced_nether_star", 250, new int[]{30, 36, 40, 33}, 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 10.0F, 1.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
