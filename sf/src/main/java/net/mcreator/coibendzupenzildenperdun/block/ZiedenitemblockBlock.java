package net.mcreator.coibendzupenzildenperdun.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ZiedenitemblockBlock extends Block {
	public ZiedenitemblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.LADDER).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}