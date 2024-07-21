
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stmwr.block.TrialBrickBlock;
import net.mcreator.stmwr.block.SuggestiumOreBlock;
import net.mcreator.stmwr.block.SuggestiumBlockBlock;
import net.mcreator.stmwr.block.StorumOreBlock;
import net.mcreator.stmwr.block.StorumBlockBlock;
import net.mcreator.stmwr.block.StevumOreBlock;
import net.mcreator.stmwr.block.StevumBlockBlock;
import net.mcreator.stmwr.block.SteelOreBlock;
import net.mcreator.stmwr.block.SteelBlockBlock;
import net.mcreator.stmwr.block.PlasticiliaBlock;
import net.mcreator.stmwr.block.ModifierTableBlock;
import net.mcreator.stmwr.block.MilitariaPortalBlock;
import net.mcreator.stmwr.block.MasterCubbyCubeBlock;
import net.mcreator.stmwr.block.MagiciteOreBlock;
import net.mcreator.stmwr.block.MagiciteBlockBlock;
import net.mcreator.stmwr.block.LandOfTheSteveCowsPortalBlock;
import net.mcreator.stmwr.block.InfinititeOreBlock;
import net.mcreator.stmwr.block.InfinititeBlockBlock;
import net.mcreator.stmwr.block.GodliumOreBlock;
import net.mcreator.stmwr.block.GodliumBlockBlock;
import net.mcreator.stmwr.block.BlazedOreBlock;
import net.mcreator.stmwr.block.BlazedBlockBlock;
import net.mcreator.stmwr.block.BasicCubbyCubeBlock;
import net.mcreator.stmwr.block.AdvancedCubbyCubeBlock;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StmwrMod.MODID);
	public static final RegistryObject<Block> MAGICITE_ORE = REGISTRY.register("magicite_ore", () -> new MagiciteOreBlock());
	public static final RegistryObject<Block> MAGICITE_BLOCK = REGISTRY.register("magicite_block", () -> new MagiciteBlockBlock());
	public static final RegistryObject<Block> PLASTICILIA = REGISTRY.register("plasticilia", () -> new PlasticiliaBlock());
	public static final RegistryObject<Block> GODLIUM_ORE = REGISTRY.register("godlium_ore", () -> new GodliumOreBlock());
	public static final RegistryObject<Block> GODLIUM_BLOCK = REGISTRY.register("godlium_block", () -> new GodliumBlockBlock());
	public static final RegistryObject<Block> INFINITITE_ORE = REGISTRY.register("infinitite_ore", () -> new InfinititeOreBlock());
	public static final RegistryObject<Block> INFINITITE_BLOCK = REGISTRY.register("infinitite_block", () -> new InfinititeBlockBlock());
	public static final RegistryObject<Block> BLAZED_ORE = REGISTRY.register("blazed_ore", () -> new BlazedOreBlock());
	public static final RegistryObject<Block> BLAZED_BLOCK = REGISTRY.register("blazed_block", () -> new BlazedBlockBlock());
	public static final RegistryObject<Block> STORUM_ORE = REGISTRY.register("storum_ore", () -> new StorumOreBlock());
	public static final RegistryObject<Block> STORUM_BLOCK = REGISTRY.register("storum_block", () -> new StorumBlockBlock());
	public static final RegistryObject<Block> TRIAL_BRICK = REGISTRY.register("trial_brick", () -> new TrialBrickBlock());
	public static final RegistryObject<Block> LAND_OF_THE_STEVE_COWS_PORTAL = REGISTRY.register("land_of_the_steve_cows_portal", () -> new LandOfTheSteveCowsPortalBlock());
	public static final RegistryObject<Block> STEVUM_ORE = REGISTRY.register("stevum_ore", () -> new StevumOreBlock());
	public static final RegistryObject<Block> STEVUM_BLOCK = REGISTRY.register("stevum_block", () -> new StevumBlockBlock());
	public static final RegistryObject<Block> MILITARIA_PORTAL = REGISTRY.register("militaria_portal", () -> new MilitariaPortalBlock());
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> SUGGESTIUM_ORE = REGISTRY.register("suggestium_ore", () -> new SuggestiumOreBlock());
	public static final RegistryObject<Block> SUGGESTIUM_BLOCK = REGISTRY.register("suggestium_block", () -> new SuggestiumBlockBlock());
	public static final RegistryObject<Block> MODIFIER_TABLE = REGISTRY.register("modifier_table", () -> new ModifierTableBlock());
	public static final RegistryObject<Block> BASIC_CUBBY_CUBE = REGISTRY.register("basic_cubby_cube", () -> new BasicCubbyCubeBlock());
	public static final RegistryObject<Block> ADVANCED_CUBBY_CUBE = REGISTRY.register("advanced_cubby_cube", () -> new AdvancedCubbyCubeBlock());
	public static final RegistryObject<Block> MASTER_CUBBY_CUBE = REGISTRY.register("master_cubby_cube", () -> new MasterCubbyCubeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
