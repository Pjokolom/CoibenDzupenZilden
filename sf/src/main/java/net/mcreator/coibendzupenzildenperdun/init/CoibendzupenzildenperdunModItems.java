/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coibendzupenzildenperdun.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.coibendzupenzildenperdun.CoibendzupenzildenperdunMod;

import java.util.function.Function;

public class CoibendzupenzildenperdunModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CoibendzupenzildenperdunMod.MODID);
	public static final DeferredItem<Item> COYBEN = block(CoibendzupenzildenperdunModBlocks.COYBEN);
	public static final DeferredItem<Item> ZIEDEN = block(CoibendzupenzildenperdunModBlocks.ZIEDEN);
	public static final DeferredItem<Item> FRUPEN = block(CoibendzupenzildenperdunModBlocks.FRUPEN);
	public static final DeferredItem<Item> BIEBEN = block(CoibendzupenzildenperdunModBlocks.BIEBEN);
	public static final DeferredItem<Item> BIEBENBEDROCK = block(CoibendzupenzildenperdunModBlocks.BIEBENBEDROCK);
	public static final DeferredItem<Item> COYBENBEDROCK = block(CoibendzupenzildenperdunModBlocks.COYBENBEDROCK);
	public static final DeferredItem<Item> ZIEDENBEDROCK = block(CoibendzupenzildenperdunModBlocks.ZIEDENBEDROCK);
	public static final DeferredItem<Item> FRUPENBEDROCK = block(CoibendzupenzildenperdunModBlocks.FRUPENBEDROCK);
	public static final DeferredItem<Item> COYBENITEMBLOCK = block(CoibendzupenzildenperdunModBlocks.COYBENITEMBLOCK);
	public static final DeferredItem<Item> ZIEDENITEMBLOCK = block(CoibendzupenzildenperdunModBlocks.ZIEDENITEMBLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}