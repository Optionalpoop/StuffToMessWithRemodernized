
package net.mcreator.stmwr.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class MagicVillagerTradingStationBlock extends Block {
	public MagicVillagerTradingStationBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GLASS).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}