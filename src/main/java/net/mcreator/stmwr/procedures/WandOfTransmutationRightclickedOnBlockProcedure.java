package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModBlocks;

public class WandOfTransmutationRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		world.setBlock(BlockPos.containing(x, y, z), StmwrModBlocks.TRANSMUTATED_GELATIN.get().defaultBlockState(), 3);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
