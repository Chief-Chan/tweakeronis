
package com.welpy.tweaks.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.welpy.tweaks.itemgroup.ShawarmaItemGroup;
import com.welpy.tweaks.WTweaksModElements;

@WTweaksModElements.ModElement.Tag
public class ShawarmaBlockBlock extends WTweaksModElements.ModElement {
	@ObjectHolder("w_tweaks:shawarma_block")
	public static final Block block = null;
	public ShawarmaBlockBlock(WTweaksModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ShawarmaItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.SPONGE).sound(SoundType.NYLIUM).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("shawarma_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
