package com.masterquentus.mythiccraft.init;

import java.util.function.Supplier;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.MythicCraft.MythicCraftItemGroup;
import com.masterquentus.mythiccraft.objects.items.VamprpiricItem;
import com.masterquentus.mythiccraft.objects.items.WoodAshItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = MythicCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(MythicCraft.MOD_ID)
public class ItemInit {

	// Items
	public static final Item vampric_gem = null;
	public static final Item silver_ingot = null;
	public static final Item mythic_diamond = null;
	public static final Item bloodstone_ingot = null;
	public static final Item dragonheart_ingot = null;
	public static final Item rose_quartz = null;
	public static final Item vampiric_ring = null;
	public static final Item daylight_ring = null;
	public static final Item wolfsbane = null;
	public static final Item vervain = null;
	public static final Item belladonna = null;
	public static final Item mandrake = null;
	public static final Item herbalism = null;
	public static final Item wormwood = null;
	public static final Item nightshade = null;
	public static final Item moonstone = null;
	public static final Item ash = null;
	
	//Fuel
	public static final Item wood_ash = null;

	// Food
	public static final Item raw_kraken = null;
	public static final Item cooked_kraken = null;
	public static final Item blood_berry = null;

	// Tools
	public static final Item vampiric_sword = null;
	public static final Item vampiric_pickaxe = null;
	public static final Item vampiric_shovel = null;
	public static final Item vampiric_axe = null;
	public static final Item vampiric_hoe = null;
	public static final Item silver_sword = null;
	public static final Item silver_pickaxe = null;
	public static final Item silver_shovel = null;
	public static final Item silver_axe = null;
	public static final Item silver_hoe = null;
	public static final Item mythicdiamond_sword = null;
	public static final Item mythicdiamond_pickaxe = null;
	public static final Item mythicdiamond_shovel = null;
	public static final Item mythicdiamond_axe = null;
	public static final Item mythicdiamond_hoe = null;
	public static final Item dragonheart_sword = null;
	public static final Item dragonheart_pickaxe = null;
	public static final Item dragonheart_shovel = null;
	public static final Item dragonheart_axe = null;
	public static final Item dragonheart_hoe = null;

	// Armor
	public static final Item vampiric_helmet = null;
	public static final Item vampiric_chestplate = null;
	public static final Item vampiric_leggings = null;
	public static final Item vampiric_boots = null;
	public static final Item silver_helmet = null;
	public static final Item silver_chestplate = null;
	public static final Item silver_leggings = null;
	public static final Item silver_boots = null;
	public static final Item mythicdiamond_helmet = null;
	public static final Item mythicdiamond_chestplate = null;
	public static final Item mythicdiamond_leggings = null;
	public static final Item mythicdiamond_boots = null;
	public static final Item dragionheart_helmet = null;
	public static final Item dragionheart_chestplate = null;
	public static final Item dragionheart_leggings = null;
	public static final Item dragionheart_boots = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		// Items
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("vampric_gem"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("silver_ingot"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("mythic_diamond"));
		event.getRegistry().register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance))
				.setRegistryName("bloodstone_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance))
				.setRegistryName("dragonheart_ingot"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("rose_quartz"));
		event.getRegistry().register(new VamprpiricItem(new Item.Properties().group(MythicCraftItemGroup.instance))
				.setRegistryName("vampiric_ring"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("daylight_ring"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("wolfsbane"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("vervain"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("belladonna"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("mandrake"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("herbalism"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("wormwood"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("nightshade"));
		event.getRegistry().register(
				new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("moonstone"));
		event.getRegistry()
				.register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("ash"));
		
		//Fuel
		event.getRegistry().register(new WoodAshItem(new Item.Properties().group(MythicCraftItemGroup.instance))
				.setRegistryName("wood_ash"));

		// Food
		event.getRegistry()
				.register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance)
						.food(new Food.Builder().hunger(3).saturation(1.2f).meat().build()))
								.setRegistryName("raw_kraken"));
		event.getRegistry()
				.register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance)
						.food(new Food.Builder().hunger(6).saturation(1.2f)
								.effect(new EffectInstance(Effects.REGENERATION, 6000, 5), 0.7f).build()))
										.setRegistryName("cooked_kraken"));
		event.getRegistry()
				.register(new Item(new Item.Properties().group(MythicCraftItemGroup.instance)
						.food(new Food.Builder().hunger(4).saturation(0.5f).setAlwaysEdible().build()))
								.setRegistryName("blood_berry"));

		// Tools
		event.getRegistry().register(
				new SwordItem(ModItemTier.VAMPIRIC, 6, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampiric_sword"));
		event.getRegistry()
				.register(new PickaxeItem(ModItemTier.VAMPIRIC, 3, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("vampiric_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.VAMPIRIC, 2, 1.5F,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("vampiric_shovel"));
		event.getRegistry().register(
				new AxeItem(ModItemTier.VAMPIRIC, 7, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampiric_axe"));
		event.getRegistry().register(
				new HoeItem(ModItemTier.VAMPIRIC, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampiric_hoe"));
		event.getRegistry().register(
				new SwordItem(ModItemTier.SILVER, 6, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_sword"));
		event.getRegistry().register(
				new PickaxeItem(ModItemTier.SILVER, 3, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_pickaxe"));
		event.getRegistry().register(
				new ShovelItem(ModItemTier.SILVER, 2, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_shovel"));
		event.getRegistry().register(
				new AxeItem(ModItemTier.SILVER, 7, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_axe"));
		event.getRegistry().register(
				new HoeItem(ModItemTier.SILVER, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_hoe"));
		event.getRegistry()
				.register(new SwordItem(ModItemTier.MYTHICDIAMOND, 6, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_sword"));
		event.getRegistry()
				.register(new PickaxeItem(ModItemTier.MYTHICDIAMOND, 3, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_pickaxe"));
		event.getRegistry()
				.register(new ShovelItem(ModItemTier.MYTHICDIAMOND, 2, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_shovel"));
		event.getRegistry()
				.register(new AxeItem(ModItemTier.MYTHICDIAMOND, 7, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_axe"));
		event.getRegistry().register(
				new HoeItem(ModItemTier.MYTHICDIAMOND, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mythicdiamond_hoe"));
		event.getRegistry()
				.register(new SwordItem(ModItemTier.DRAGONHEART, 6, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_sword"));
		event.getRegistry()
				.register(new PickaxeItem(ModItemTier.DRAGONHEART, 3, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_pickaxe"));
		event.getRegistry()
				.register(new ShovelItem(ModItemTier.DRAGONHEART, 2, 1.5F,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_shovel"));
		event.getRegistry().register(new AxeItem(ModItemTier.DRAGONHEART, 7, 1.5F,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("dragonheart_axe"));
		event.getRegistry().register(
				new HoeItem(ModItemTier.DRAGONHEART, 1.5F, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("dragonheart_hoe"));

		// Armor
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VAMPIRIC, EquipmentSlotType.HEAD,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("vampiric_helmet"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.VAMPIRIC, EquipmentSlotType.CHEST,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("vampiric_chestplate"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.VAMPIRIC, EquipmentSlotType.LEGS,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("vampiric_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.VAMPIRIC, EquipmentSlotType.FEET,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("vampiric_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.HEAD,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("silver_helmet"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.CHEST,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("silver_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.LEGS,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("silver_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SILVER, EquipmentSlotType.FEET,
				new Item.Properties().group(MythicCraftItemGroup.instance)).setRegistryName("silver_boots"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.MYTHICDIAMOND, EquipmentSlotType.HEAD,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_helmet"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.MYTHICDIAMOND, EquipmentSlotType.CHEST,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_chestplate"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.MYTHICDIAMOND, EquipmentSlotType.LEGS,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_leggings"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.MYTHICDIAMOND, EquipmentSlotType.FEET,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("mythicdiamond_boots"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.DRAGONHEART, EquipmentSlotType.HEAD,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_helmet"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.DRAGONHEART, EquipmentSlotType.CHEST,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_chestplate"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.DRAGONHEART, EquipmentSlotType.LEGS,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_leggings"));
		event.getRegistry()
				.register(new ArmorItem(ModArmorMaterial.DRAGONHEART, EquipmentSlotType.FEET,
						new Item.Properties().group(MythicCraftItemGroup.instance))
								.setRegistryName("dragonheart_boots"));

	}

	public enum ModItemTier implements IItemTier {

		VAMPIRIC(2, 550, 5.0F, 6.5F, 15, () -> {
			return Ingredient.fromItems(ItemInit.vampric_gem);
		}),

		SILVER(2, 250, 2.0F, 1.5F, 20, () -> {
			return Ingredient.fromItems(ItemInit.silver_ingot);

		}),

		MYTHICDIAMOND(4, 3550, 9.0F, 7.5F, 5, () -> {
			return Ingredient.fromItems(ItemInit.mythic_diamond);

		}),

		DRAGONHEART(4, 3550, 9.0F, 7.5F, 5, () -> {
			return Ingredient.fromItems(ItemInit.mythic_diamond);

		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}

	public enum ModArmorMaterial implements IArmorMaterial {
		VAMPIRIC(MythicCraft.MOD_ID + ":vampiric", 5, new int[] { 7, 9, 11, 7 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
				6.9F, () -> {
					return Ingredient.fromItems(ItemInit.vampric_gem);
				}),

		SILVER(MythicCraft.MOD_ID + ":silver", 5, new int[] { 7, 9, 11, 7 }, 420, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
				6.9F, () -> {
					return Ingredient.fromItems(ItemInit.silver_ingot);

				}),

		MYTHICDIAMOND(MythicCraft.MOD_ID + ":mythicdiamond", 5, new int[] { 7, 9, 11, 7 }, 420,
				SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.9F, () -> {
					return Ingredient.fromItems(ItemInit.mythic_diamond);

				}),

		DRAGONHEART(MythicCraft.MOD_ID + ":dragonheart", 5, new int[] { 7, 9, 11, 7 }, 420,
				SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.9F, () -> {
					return Ingredient.fromItems(ItemInit.dragonheart_ingot);

				});

		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}
	}
}