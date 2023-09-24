
package net.mcreator.gemsfabricmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GemCrystalItem extends Item {
	public GemCrystalItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
