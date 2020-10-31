package com.masterquentus.mythiccraft.util;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.client.entity.render.GoblinEntityRender;
import com.masterquentus.mythiccraft.client.gui.BloodOakBarrelScreen;
import com.masterquentus.mythiccraft.init.BlockInitNew;
import com.masterquentus.mythiccraft.init.ModContainerTypes;
import com.masterquentus.mythiccraft.init.ModEntityTypes;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MythicCraft.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {

		ScreenManager.registerFactory(ModContainerTypes.bloodoak_barrel.get(), BloodOakBarrelScreen::new);
		
		RenderTypeLookup.setRenderLayer(BlockInitNew.bloodoak_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.whiteoak_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.silverwood_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.witchwood_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.alder_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.hawthorn_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.rowan_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.willow_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.beech_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.ash_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.blackthorn_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.cedar_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.elder_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.juniper_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.witchhazel_sapling.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.yew_sapling.get(), RenderType.getCutout());
		
		//Crops
		RenderTypeLookup.setRenderLayer(BlockInitNew.vervain_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.garlic_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.belladonna_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.herbalism_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.mandrake_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.nightshade_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.wormwood_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.wolfsbane_crop.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.bloodoak_door.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInitNew.whiteoak_door.get(), RenderType.getCutout());
		
		//Entities
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOBLIN_ENTITY.get(), GoblinEntityRender::new);

	}
}