
package com.welpy.tweaks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.welpy.tweaks.block.ShawarmaBlockBlock;
import com.welpy.tweaks.WTweaksModElements;

@WTweaksModElements.ModElement.Tag
public class ShawarmaItemGroup extends WTweaksModElements.ModElement {
	public ShawarmaItemGroup(WTweaksModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshawarma") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShawarmaBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
