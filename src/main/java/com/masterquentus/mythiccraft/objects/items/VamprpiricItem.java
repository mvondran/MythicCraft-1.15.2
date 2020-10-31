package com.masterquentus.mythiccraft.objects.items;

import java.util.List;

import com.masterquentus.mythiccraft.util.helpers.KeybordHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class VamprpiricItem extends Item 
{

	public VamprpiricItem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
	{
		if(KeybordHelper.isHoldingShift()) 
		{
			tooltip.add(new StringTextComponent("Right Click To get Night vision, Invisibility, and Bad Omen "));
		}	else {
			tooltip.add(new StringTextComponent("Hold SHIFT for more information"));
		}
			
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
	{
		playerIn.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 600, 255));
		playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 500, 155));
		playerIn.addPotionEffect(new EffectInstance(Effects.BAD_OMEN, 500, 55));
		worldIn.setRainStrength(4.0f);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
