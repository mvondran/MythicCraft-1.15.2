package com.masterquentus.mythiccraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.masterquentus.mythiccraft.init.BiomeInit;
import com.masterquentus.mythiccraft.init.BlockInitNew;
import com.masterquentus.mythiccraft.init.DimensionInit;
import com.masterquentus.mythiccraft.init.FeatureInit;
import com.masterquentus.mythiccraft.init.FluidInit;
import com.masterquentus.mythiccraft.init.ItemInit;
import com.masterquentus.mythiccraft.init.ItemInitNew;
import com.masterquentus.mythiccraft.init.ModContainerTypes;
import com.masterquentus.mythiccraft.init.ModEntityTypes;
import com.masterquentus.mythiccraft.init.ModTileEntityTypes;
import com.masterquentus.mythiccraft.objects.BelladonnaCropBlock;
import com.masterquentus.mythiccraft.objects.GarlicCropBlock;
import com.masterquentus.mythiccraft.objects.HerbalismCropBlock;
import com.masterquentus.mythiccraft.objects.MandrakeCropBlock;
import com.masterquentus.mythiccraft.objects.NightShadeCrop;
import com.masterquentus.mythiccraft.objects.VervainCropBlock;
import com.masterquentus.mythiccraft.objects.WolfsCropBlock;
import com.masterquentus.mythiccraft.objects.WormwoodCrop;
import com.masterquentus.mythiccraft.world.gen.MythicCraftOreGen;
import com.masterquentus.mythiccraft.world.gen.StructureGen;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = MythicCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

@Mod("mythiccraft")
public class MythicCraft 
{

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "mythiccraft";
	public static MythicCraft instance;
	
	public static final ResourceLocation Unerworld_Dim_Type = new ResourceLocation(MOD_ID, "underworld");

	public MythicCraft() 
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		
		ItemInitNew.ITEMS.register(modEventBus);
		FluidInit.FLUIDS.register(modEventBus);
		BlockInitNew.BLOCKS.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
		ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
		
		BiomeInit.Biomes.register(modEventBus);
		DimensionInit.MOD_DIMENSIONS.register(modEventBus);
		FeatureInit.FEATURES.register(modEventBus);
		
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
	
		
		BlockInitNew.BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof WolfsCropBlock)).filter(block -> !(block.get() instanceof GarlicCropBlock)).filter(block -> !(block.get() instanceof BelladonnaCropBlock)).filter(block -> !(block.get() instanceof MandrakeCropBlock)).filter(block -> !(block.get() instanceof HerbalismCropBlock)).filter(block -> !(block.get() instanceof WormwoodCrop)).filter(block -> !(block.get() instanceof NightShadeCrop)).map(RegistryObject::get).filter(block -> !(block instanceof VervainCropBlock) && !(block instanceof FlowingFluidBlock)).forEach(block -> {
		final Item.Properties properties = new Item.Properties().group(MythicCraftItemGroup.instance);
		final BlockItem blockItem = new BlockItem(block, properties);
		blockItem.setRegistryName(block.getRegistryName());
		registry.register(blockItem);
	});
		
		LOGGER.debug("Registered BlockItems!");
		
}
	
	@SubscribeEvent
	public static void OnRegisterBiomes(final RegistryEvent.Register<Biome> event) {
		BiomeInit.registerBiomes();
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event)
	{
	
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) 
	{
		MythicCraftOreGen.generateOre();
		DeferredWorkQueue.runLater(StructureGen::generateStructures);
	}
	
	public static class MythicCraftItemGroup extends ItemGroup 
	{
		public static final MythicCraftItemGroup instance = new MythicCraftItemGroup(ItemGroup.GROUPS.length, "mythiccrafttab");
		private MythicCraftItemGroup(int index, String label) 
		{
			super(index, label);
		}
		
		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.vampric_gem);
		}
	}
}
	
		

		