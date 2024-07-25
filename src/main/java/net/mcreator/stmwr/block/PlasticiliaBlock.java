
package net.mcreator.stmwr.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PlasticiliaBlock extends Block {
	public PlasticiliaBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.SNOW).strength(1.5f, 10f).lightLevel(s -> 5).speedFactor(1.5f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
