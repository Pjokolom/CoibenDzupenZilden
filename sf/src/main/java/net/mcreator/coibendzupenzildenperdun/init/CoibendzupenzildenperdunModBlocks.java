/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coibendzupenzildenperdun.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.coibendzupenzildenperdun.block.ZiedenitemblockBlock;
import net.mcreator.coibendzupenzildenperdun.block.ZiedenbedrockBlock;
import net.mcreator.coibendzupenzildenperdun.block.ZiedenBlock;
import net.mcreator.coibendzupenzildenperdun.block.FrupenitemblockBlock;
import net.mcreator.coibendzupenzildenperdun.block.FrupenbedrockBlock;
import net.mcreator.coibendzupenzildenperdun.block.FrupenBlock;
import net.mcreator.coibendzupenzildenperdun.block.CoybenitemblockBlock;
import net.mcreator.coibendzupenzildenperdun.block.CoybenbedrockBlock;
import net.mcreator.coibendzupenzildenperdun.block.CoybenBlock;
import net.mcreator.coibendzupenzildenperdun.block.BiebenitemblockBlock;
import net.mcreator.coibendzupenzildenperdun.block.BiebenbedrockBlock;
import net.mcreator.coibendzupenzildenperdun.block.BiebenBlock;
import net.mcreator.coibendzupenzildenperdun.CoibendzupenzildenperdunMod;

import java.util.function.Function;

public class CoibendzupenzildenperdunModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CoibendzupenzildenperdunMod.MODID);
	public static final DeferredBlock<Block> COYBEN = register("coyben", CoybenBlock::new);
	public static final DeferredBlock<Block> ZIEDEN = register("zieden", ZiedenBlock::new);
	public static final DeferredBlock<Block> FRUPEN = register("frupen", FrupenBlock::new);
	public static final DeferredBlock<Block> BIEBEN = register("bieben", BiebenBlock::new);
	public static final DeferredBlock<Block> BIEBENBEDROCK = register("biebenbedrock", BiebenbedrockBlock::new);
	public static final DeferredBlock<Block> COYBENBEDROCK = register("coybenbedrock", CoybenbedrockBlock::new);
	public static final DeferredBlock<Block> ZIEDENBEDROCK = register("ziedenbedrock", ZiedenbedrockBlock::new);
	public static final DeferredBlock<Block> FRUPENBEDROCK = register("frupenbedrock", FrupenbedrockBlock::new);
	public static final DeferredBlock<Block> COYBENITEMBLOCK = register("coybenitemblock", CoybenitemblockBlock::new);
	public static final DeferredBlock<Block> ZIEDENITEMBLOCK = register("ziedenitemblock", ZiedenitemblockBlock::new);
	public static final DeferredBlock<Block> BIEBENITEMBLOCK = register("biebenitemblock", BiebenitemblockBlock::new);
	public static final DeferredBlock<Block> FRUPENITEMBLOCK = register("frupenitemblock", FrupenitemblockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}