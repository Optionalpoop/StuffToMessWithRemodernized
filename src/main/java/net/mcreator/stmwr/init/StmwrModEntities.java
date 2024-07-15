
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.stmwr.entity.SurvivorEntity;
import net.mcreator.stmwr.entity.SteveCowEntity;
import net.mcreator.stmwr.entity.SoldierEntity;
import net.mcreator.stmwr.entity.PikachuEntity;
import net.mcreator.stmwr.entity.MutantWormEntity;
import net.mcreator.stmwr.entity.MutantBossEntity;
import net.mcreator.stmwr.entity.GiantSteveCowEntity;
import net.mcreator.stmwr.entity.FrostZombieEntity;
import net.mcreator.stmwr.StmwrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StmwrModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StmwrMod.MODID);
	public static final RegistryObject<EntityType<SteveCowEntity>> STEVE_COW = register("steve_cow",
			EntityType.Builder.<SteveCowEntity>of(SteveCowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<GiantSteveCowEntity>> GIANT_STEVE_COW = register("giant_steve_cow",
			EntityType.Builder.<GiantSteveCowEntity>of(GiantSteveCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(GiantSteveCowEntity::new)

					.sized(4.8f, 7f));
	public static final RegistryObject<EntityType<PikachuEntity>> PIKACHU = register("pikachu",
			EntityType.Builder.<PikachuEntity>of(PikachuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PikachuEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<SurvivorEntity>> SURVIVOR = register("survivor",
			EntityType.Builder.<SurvivorEntity>of(SurvivorEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SurvivorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoldierEntity>> SOLDIER = register("soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MutantBossEntity>> MUTANT_BOSS = register("mutant_boss",
			EntityType.Builder.<MutantBossEntity>of(MutantBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(MutantBossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MutantWormEntity>> MUTANT_WORM = register("mutant_worm",
			EntityType.Builder.<MutantWormEntity>of(MutantWormEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MutantWormEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<FrostZombieEntity>> FROST_ZOMBIE = register("frost_zombie",
			EntityType.Builder.<FrostZombieEntity>of(FrostZombieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostZombieEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SteveCowEntity.init();
			GiantSteveCowEntity.init();
			PikachuEntity.init();
			SurvivorEntity.init();
			SoldierEntity.init();
			MutantBossEntity.init();
			MutantWormEntity.init();
			FrostZombieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STEVE_COW.get(), SteveCowEntity.createAttributes().build());
		event.put(GIANT_STEVE_COW.get(), GiantSteveCowEntity.createAttributes().build());
		event.put(PIKACHU.get(), PikachuEntity.createAttributes().build());
		event.put(SURVIVOR.get(), SurvivorEntity.createAttributes().build());
		event.put(SOLDIER.get(), SoldierEntity.createAttributes().build());
		event.put(MUTANT_BOSS.get(), MutantBossEntity.createAttributes().build());
		event.put(MUTANT_WORM.get(), MutantWormEntity.createAttributes().build());
		event.put(FROST_ZOMBIE.get(), FrostZombieEntity.createAttributes().build());
	}
}
