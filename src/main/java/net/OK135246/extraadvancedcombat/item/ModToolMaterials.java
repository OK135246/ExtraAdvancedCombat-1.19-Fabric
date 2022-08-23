package net.OK135246.extraadvancedcombat.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

        ADVANCED_WOOD(0, 236, 4.0F, 2.0F, 25, () -> {
            return Ingredient.fromTag(ItemTags.PLANKS);
        }),
        ADVANCED_STONE(1, 524, 7.5F, 3.5F, 10, () -> {
            return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
        }),
        ADVANCED_IRON(2, 2250, 9.5F, 7.0F, 20, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_BLOCK});
        }),
        ADVANCED_DIAMOND(3, 8192, 13.0F, 10.0F, 20, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND_BLOCK});
        }),
        ADVANCED_GOLD(2, 1561, 14.0F, 3.0F, 22, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_BLOCK});
        }),
        ADVANCED_NETHERITE(4, 10846, 20.0F, 15.0F, 30, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
        }),
        EMERALD(3, 781, 7.0F, 4.0F, 10, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
        }),
        ADVANCED_EMERALD(3, 3122, 12.0F, 9.0F, 17, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD_BLOCK});
        }),
        NETHER_STAR(4, 9366, 15.0F, 6.0F, 15, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
        }),
        ADVANCED_NETHER_STAR(5, 16384, 25.0F, 20.0F, 40, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
        });

        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Lazy<Ingredient> repairIngredient;

        private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability() {
        return this.itemDurability;
    }

        public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

        public float getAttackDamage() {
        return this.attackDamage;
    }

        public int getMiningLevel() {
        return this.miningLevel;
    }

        public int getEnchantability() {
        return this.enchantability;
    }

        public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
    }