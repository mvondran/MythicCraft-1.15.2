package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.MythicCraft.MythicCraftItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = MythicCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(MythicCraft.MOD_ID)
public class BlockInit {

	public static final Block vampric_ore = null;
	public static final Block vampric_endore = null;
	public static final Block vampric_netherore = null;
	public static final Block mythicdiamond_ore = null;
	public static final Block mythicdiamond_endore = null;
	public static final Block mythicdiamond_netherore = null;
	public static final Block silver_ore = null;
	public static final Block silver_endore = null;
	public static final Block silver_netherore = null;
	public static final Block dragonheart_ore = null;
	public static final Block dragonheart_endore = null;
	public static final Block dragonheart_netherore = null;
	public static final Block bloodstone_ore = null;
	public static final Block bloodstone_endore = null;
	public static final Block bloodstone_netherore = null;
	public static final Block moonstone_ore = null;
	public static final Block moonstone_endore = null;
	public static final Block moonstone_netherore = null;
	public static final Block rosequartz_ore = null;
	public static final Block rosequartz_block = null;
	public static final Block rosequartz_chiseled = null;
	public static final Block rosequartz_smooth = null;
	public static final Block rosequartz_pillar = null;
	public static final Block vampric_block = null;
	public static final Block silver_block = null;
	public static final Block mythicdiamond_block = null;
	public static final Block dragonheart_block = null;
	public static final Block bloodstone_block = null;
	public static final Block moonstone_block = null;
	public static final Block congealed_blood = null;
	public static final Block blackstone = null;
	public static final Block blackstone_cobble = null;
	public static final Block blackstone_bricks = null;
	public static final Block blackstone_polished = null;
	public static final Block blackstone_chisealed = null;
	public static final Block blackstone_cracked = null;
	public static final Block ash_block = null;
	public static final Block mysticstone = null;
	public static final Block mysticstone_cobble = null;
	public static final Block mysticstone_bricks = null;
	public static final Block mysticstone_polished = null;
	public static final Block mysticstone_chisealed = null;
	public static final Block mysticstone_cracked = null;
	public static final Block pearlstone = null;
	public static final Block pearlstone_cobble = null;
	public static final Block pearlstone_bricks = null;
	public static final Block pearlstone_polished = null;
	public static final Block pearlstone_chisealed = null;
	public static final Block pearlstone_cracked = null;

	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("vampric_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("vampric_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("vampric_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(3)).setRegistryName("silver_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(3)).setRegistryName("silver_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(3)).setRegistryName("silver_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("mythicdiamond_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("mythicdiamond_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("mythicdiamond_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("dragonheart_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("dragonheart_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("dragonheart_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("bloodstone_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("bloodstone_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("bloodstone_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("moonstone_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("moonstone_endore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("moonstone_netherore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(4)).setRegistryName("rosequartz_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("rosequartz_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("rosequartz_chiseled"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("rosequartz_smooth"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("rosequartz_pillar"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(2)).setRegistryName("vampric_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(3)).setRegistryName("silver_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("mythicdiamond_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("dragonheart_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("bloodstone_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.METAL).harvestLevel(4)).setRegistryName("moonstone_block"));
		event.getRegistry()
				.register(new Block(Block.Properties.from(Blocks.HONEY_BLOCK)).setRegistryName("congealed_blood"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone_cobble"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone_polished"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone_chisealed"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("blackstone_cracked"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.SAND).harvestLevel(2)).setRegistryName("ash_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone_cobble"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone_polished"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone_chisealed"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("mysticstone_cracked"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone_cobble"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone_bricks"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone_polished"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone_chisealed"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)
				.sound(SoundType.STONE).harvestLevel(2)).setRegistryName("pearlstone_cracked"));
	}

	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry()
				.register(new BlockItem(vampric_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampric_ore"));
		event.getRegistry()
				.register(new BlockItem(vampric_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampric_endore"));
		event.getRegistry()
				.register(new BlockItem(vampric_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampric_netherore"));
		event.getRegistry()
				.register(new BlockItem(silver_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_ore"));
		event.getRegistry()
				.register(new BlockItem(silver_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_endore"));
		event.getRegistry()
				.register(new BlockItem(silver_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_netherore"));
		event.getRegistry()
				.register(new BlockItem(mythicdiamond_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mythicdiamond_ore"));
		event.getRegistry().register(
				new BlockItem(mythicdiamond_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mythicdiamond_endore"));
		event.getRegistry().register(
				new BlockItem(mythicdiamond_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mythicdiamond_netherore"));
		event.getRegistry()
				.register(new BlockItem(dragonheart_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("dragonheart_ore"));
		event.getRegistry()
				.register(new BlockItem(dragonheart_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("dragonheart_endore"));
		event.getRegistry().register(
				new BlockItem(dragonheart_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("dragonheart_netherore"));
		event.getRegistry()
				.register(new BlockItem(bloodstone_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("bloodstone_ore"));
		event.getRegistry()
				.register(new BlockItem(bloodstone_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("bloodstone_endore"));
		event.getRegistry().register(
				new BlockItem(bloodstone_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("bloodstone_netherore"));
		event.getRegistry()
				.register(new BlockItem(moonstone_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("moonstone_ore"));
		event.getRegistry()
				.register(new BlockItem(moonstone_endore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("moonstone_endore"));
		event.getRegistry()
				.register(new BlockItem(moonstone_netherore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("moonstone_netherore"));
		event.getRegistry()
				.register(new BlockItem(rosequartz_ore, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("rosequartz_ore"));
		event.getRegistry()
				.register(new BlockItem(rosequartz_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("rosequartz_block"));
		event.getRegistry()
				.register(new BlockItem(rosequartz_chiseled, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("rosequartz_chiseled"));
		event.getRegistry()
				.register(new BlockItem(rosequartz_smooth, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("rosequartz_smooth"));
		event.getRegistry()
				.register(new BlockItem(rosequartz_pillar, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("rosequartz_pillar"));
		event.getRegistry()
				.register(new BlockItem(vampric_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("vampric_block"));
		event.getRegistry()
				.register(new BlockItem(silver_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("silver_block"));
		event.getRegistry()
				.register(new BlockItem(mythicdiamond_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mythicdiamond_block"));
		event.getRegistry()
				.register(new BlockItem(dragonheart_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("dragonheart_block"));
		event.getRegistry()
				.register(new BlockItem(bloodstone_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("bloodstone_block"));
		event.getRegistry()
				.register(new BlockItem(moonstone_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("moonstone_block"));
		event.getRegistry()
				.register(new BlockItem(congealed_blood, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("congealed_blood"));
		event.getRegistry()
				.register(new BlockItem(blackstone, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone"));
		event.getRegistry()
				.register(new BlockItem(blackstone_cobble, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone_cobble"));
		event.getRegistry()
				.register(new BlockItem(blackstone_bricks, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone_bricks"));
		event.getRegistry()
				.register(new BlockItem(blackstone_polished, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone_polished"));
		event.getRegistry().register(
				new BlockItem(blackstone_chisealed, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone_chisealed"));
		event.getRegistry()
				.register(new BlockItem(blackstone_cracked, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("blackstone_cracked"));
		event.getRegistry()
				.register(new BlockItem(ash_block, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("ash_block"));
		event.getRegistry()
				.register(new BlockItem(mysticstone, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone"));
		event.getRegistry()
				.register(new BlockItem(mysticstone_cobble, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone_cobble"));
		event.getRegistry()
				.register(new BlockItem(mysticstone_bricks, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone_bricks"));
		event.getRegistry().register(
				new BlockItem(mysticstone_polished, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone_polished"));
		event.getRegistry().register(
				new BlockItem(mysticstone_chisealed, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone_chisealed"));
		event.getRegistry()
				.register(new BlockItem(mysticstone_cracked, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("mysticstone_cracked"));
		event.getRegistry()
				.register(new BlockItem(pearlstone, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone"));
		event.getRegistry()
				.register(new BlockItem(pearlstone_cobble, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone_cobble"));
		event.getRegistry()
				.register(new BlockItem(pearlstone_bricks, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone_bricks"));
		event.getRegistry()
				.register(new BlockItem(pearlstone_polished, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone_polished"));
		event.getRegistry().register(
				new BlockItem(pearlstone_chisealed, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone_chisealed"));
		event.getRegistry()
				.register(new BlockItem(pearlstone_cracked, new Item.Properties().group(MythicCraftItemGroup.instance))
						.setRegistryName("pearlstone_cracked"));
	}
}
