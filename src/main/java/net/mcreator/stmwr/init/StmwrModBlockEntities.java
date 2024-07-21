
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stmwr.block.entity.ModifierTableBlockEntity;
import net.mcreator.stmwr.block.entity.MasterCubbyCubeBlockEntity;
import net.mcreator.stmwr.block.entity.BasicCubbyCubeBlockEntity;
import net.mcreator.stmwr.block.entity.AdvancedCubbyCubeBlockEntity;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StmwrMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MODIFIER_TABLE = register("modifier_table", StmwrModBlocks.MODIFIER_TABLE, ModifierTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASIC_CUBBY_CUBE = register("basic_cubby_cube", StmwrModBlocks.BASIC_CUBBY_CUBE, BasicCubbyCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_CUBBY_CUBE = register("advanced_cubby_cube", StmwrModBlocks.ADVANCED_CUBBY_CUBE, AdvancedCubbyCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MASTER_CUBBY_CUBE = register("master_cubby_cube", StmwrModBlocks.MASTER_CUBBY_CUBE, MasterCubbyCubeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
