
package net.mcreator.stmwr.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class MasterCubbyCubeGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public MasterCubbyCubeGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(StmwrModMenus.MASTER_CUBBY_CUBE_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(192);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 13, 13) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 31, 13) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 49, 13) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 67, 13) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 85, 13) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 103, 13) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 121, 13) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 139, 13) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 157, 13) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 175, 13) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 193, 13) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 211, 13) {
			private final int slot = 11;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 229, 13) {
			private final int slot = 12;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 247, 13) {
			private final int slot = 13;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 265, 13) {
			private final int slot = 14;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 283, 13) {
			private final int slot = 15;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 301, 13) {
			private final int slot = 16;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 319, 13) {
			private final int slot = 17;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 337, 13) {
			private final int slot = 18;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 355, 13) {
			private final int slot = 19;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 373, 13) {
			private final int slot = 20;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 391, 13) {
			private final int slot = 21;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 13, 31) {
			private final int slot = 22;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 31, 31) {
			private final int slot = 23;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 49, 31) {
			private final int slot = 24;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 67, 31) {
			private final int slot = 25;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 85, 31) {
			private final int slot = 26;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 103, 31) {
			private final int slot = 27;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 121, 31) {
			private final int slot = 28;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 139, 31) {
			private final int slot = 29;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 157, 31) {
			private final int slot = 30;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 175, 31) {
			private final int slot = 31;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 193, 31) {
			private final int slot = 32;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 211, 31) {
			private final int slot = 33;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 229, 31) {
			private final int slot = 34;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 247, 31) {
			private final int slot = 35;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 265, 31) {
			private final int slot = 36;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 283, 31) {
			private final int slot = 37;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 301, 31) {
			private final int slot = 38;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 319, 31) {
			private final int slot = 39;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 337, 31) {
			private final int slot = 40;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 355, 31) {
			private final int slot = 41;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 373, 31) {
			private final int slot = 42;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 391, 31) {
			private final int slot = 43;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 13, 49) {
			private final int slot = 44;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 31, 49) {
			private final int slot = 45;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 49, 49) {
			private final int slot = 46;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 67, 49) {
			private final int slot = 47;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 85, 49) {
			private final int slot = 48;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 103, 49) {
			private final int slot = 49;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 121, 49) {
			private final int slot = 50;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 139, 49) {
			private final int slot = 51;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 157, 49) {
			private final int slot = 52;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 175, 49) {
			private final int slot = 53;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 193, 49) {
			private final int slot = 54;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 211, 49) {
			private final int slot = 55;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 229, 49) {
			private final int slot = 56;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 247, 49) {
			private final int slot = 57;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 265, 49) {
			private final int slot = 58;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 283, 49) {
			private final int slot = 59;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 301, 49) {
			private final int slot = 60;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 319, 49) {
			private final int slot = 61;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 337, 49) {
			private final int slot = 62;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 355, 49) {
			private final int slot = 63;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 373, 49) {
			private final int slot = 64;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 391, 49) {
			private final int slot = 65;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 13, 67) {
			private final int slot = 66;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 31, 67) {
			private final int slot = 67;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 49, 67) {
			private final int slot = 68;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 67, 67) {
			private final int slot = 69;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 85, 67) {
			private final int slot = 70;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 103, 67) {
			private final int slot = 71;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 121, 67) {
			private final int slot = 72;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 139, 67) {
			private final int slot = 73;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 157, 67) {
			private final int slot = 74;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 175, 67) {
			private final int slot = 75;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 193, 67) {
			private final int slot = 76;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 211, 67) {
			private final int slot = 77;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 229, 67) {
			private final int slot = 78;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 247, 67) {
			private final int slot = 79;
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 265, 67) {
			private final int slot = 80;
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 283, 67) {
			private final int slot = 81;
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 301, 67) {
			private final int slot = 82;
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 319, 67) {
			private final int slot = 83;
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 337, 67) {
			private final int slot = 84;
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 355, 67) {
			private final int slot = 85;
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 373, 67) {
			private final int slot = 86;
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 391, 67) {
			private final int slot = 87;
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 13, 85) {
			private final int slot = 88;
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 31, 85) {
			private final int slot = 89;
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 49, 85) {
			private final int slot = 90;
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 67, 85) {
			private final int slot = 91;
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 85, 85) {
			private final int slot = 92;
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 103, 85) {
			private final int slot = 93;
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 121, 85) {
			private final int slot = 94;
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 139, 85) {
			private final int slot = 95;
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 157, 85) {
			private final int slot = 96;
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 175, 85) {
			private final int slot = 97;
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 193, 85) {
			private final int slot = 98;
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 211, 85) {
			private final int slot = 99;
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 229, 85) {
			private final int slot = 100;
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 247, 85) {
			private final int slot = 101;
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 265, 85) {
			private final int slot = 102;
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 283, 85) {
			private final int slot = 103;
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 301, 85) {
			private final int slot = 104;
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 319, 85) {
			private final int slot = 105;
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 337, 85) {
			private final int slot = 106;
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 355, 85) {
			private final int slot = 107;
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 373, 85) {
			private final int slot = 108;
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 391, 85) {
			private final int slot = 109;
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 13, 112) {
			private final int slot = 110;
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 31, 112) {
			private final int slot = 111;
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 49, 112) {
			private final int slot = 112;
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 67, 112) {
			private final int slot = 113;
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 85, 112) {
			private final int slot = 114;
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 103, 112) {
			private final int slot = 115;
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 301, 112) {
			private final int slot = 116;
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 319, 112) {
			private final int slot = 117;
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 337, 112) {
			private final int slot = 118;
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 355, 112) {
			private final int slot = 119;
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 373, 112) {
			private final int slot = 120;
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 391, 112) {
			private final int slot = 121;
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 13, 130) {
			private final int slot = 122;
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 31, 130) {
			private final int slot = 123;
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 49, 130) {
			private final int slot = 124;
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 67, 130) {
			private final int slot = 125;
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 85, 130) {
			private final int slot = 126;
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 103, 130) {
			private final int slot = 127;
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 301, 130) {
			private final int slot = 128;
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 319, 130) {
			private final int slot = 129;
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 337, 130) {
			private final int slot = 130;
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 355, 130) {
			private final int slot = 131;
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 373, 130) {
			private final int slot = 132;
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 391, 130) {
			private final int slot = 133;
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 13, 148) {
			private final int slot = 134;
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 31, 148) {
			private final int slot = 135;
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 49, 148) {
			private final int slot = 136;
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 67, 148) {
			private final int slot = 137;
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 85, 148) {
			private final int slot = 138;
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 103, 148) {
			private final int slot = 139;
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 301, 148) {
			private final int slot = 140;
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 319, 148) {
			private final int slot = 141;
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 337, 148) {
			private final int slot = 142;
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 355, 148) {
			private final int slot = 143;
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 373, 148) {
			private final int slot = 144;
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 391, 148) {
			private final int slot = 145;
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 13, 166) {
			private final int slot = 146;
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 31, 166) {
			private final int slot = 147;
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 49, 166) {
			private final int slot = 148;
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 67, 166) {
			private final int slot = 149;
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 85, 166) {
			private final int slot = 150;
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 103, 166) {
			private final int slot = 151;
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 301, 166) {
			private final int slot = 152;
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 319, 166) {
			private final int slot = 153;
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 337, 166) {
			private final int slot = 154;
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 355, 166) {
			private final int slot = 155;
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 373, 166) {
			private final int slot = 156;
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 391, 166) {
			private final int slot = 157;
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 13, 184) {
			private final int slot = 158;
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 31, 184) {
			private final int slot = 159;
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 49, 184) {
			private final int slot = 160;
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 67, 184) {
			private final int slot = 161;
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 85, 184) {
			private final int slot = 162;
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 103, 184) {
			private final int slot = 163;
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 301, 184) {
			private final int slot = 164;
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 319, 184) {
			private final int slot = 165;
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 337, 184) {
			private final int slot = 166;
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 355, 184) {
			private final int slot = 167;
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 373, 184) {
			private final int slot = 168;
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 391, 184) {
			private final int slot = 169;
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 13, 202) {
			private final int slot = 170;
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 31, 202) {
			private final int slot = 171;
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 49, 202) {
			private final int slot = 172;
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 67, 202) {
			private final int slot = 173;
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 85, 202) {
			private final int slot = 174;
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 103, 202) {
			private final int slot = 175;
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 121, 202) {
			private final int slot = 176;
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 139, 202) {
			private final int slot = 177;
		}));
		this.customSlots.put(178, this.addSlot(new SlotItemHandler(internal, 178, 157, 202) {
			private final int slot = 178;
		}));
		this.customSlots.put(179, this.addSlot(new SlotItemHandler(internal, 179, 175, 202) {
			private final int slot = 179;
		}));
		this.customSlots.put(180, this.addSlot(new SlotItemHandler(internal, 180, 193, 202) {
			private final int slot = 180;
		}));
		this.customSlots.put(181, this.addSlot(new SlotItemHandler(internal, 181, 211, 202) {
			private final int slot = 181;
		}));
		this.customSlots.put(182, this.addSlot(new SlotItemHandler(internal, 182, 229, 202) {
			private final int slot = 182;
		}));
		this.customSlots.put(183, this.addSlot(new SlotItemHandler(internal, 183, 247, 202) {
			private final int slot = 183;
		}));
		this.customSlots.put(184, this.addSlot(new SlotItemHandler(internal, 184, 265, 202) {
			private final int slot = 184;
		}));
		this.customSlots.put(185, this.addSlot(new SlotItemHandler(internal, 185, 283, 202) {
			private final int slot = 185;
		}));
		this.customSlots.put(186, this.addSlot(new SlotItemHandler(internal, 186, 301, 202) {
			private final int slot = 186;
		}));
		this.customSlots.put(187, this.addSlot(new SlotItemHandler(internal, 187, 319, 202) {
			private final int slot = 187;
		}));
		this.customSlots.put(188, this.addSlot(new SlotItemHandler(internal, 188, 337, 202) {
			private final int slot = 188;
		}));
		this.customSlots.put(189, this.addSlot(new SlotItemHandler(internal, 189, 355, 202) {
			private final int slot = 189;
		}));
		this.customSlots.put(190, this.addSlot(new SlotItemHandler(internal, 190, 373, 202) {
			private final int slot = 190;
		}));
		this.customSlots.put(191, this.addSlot(new SlotItemHandler(internal, 191, 391, 202) {
			private final int slot = 191;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 123 + 8 + sj * 18, 32 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 123 + 8 + si * 18, 32 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 192) {
				if (!this.moveItemStackTo(itemstack1, 192, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 192, false)) {
				if (index < 192 + 27) {
					if (!this.moveItemStackTo(itemstack1, 192 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 192, 192 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.setByPlayer(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.setByPlayer(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 2)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 9)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					if (j == 12)
						continue;
					if (j == 13)
						continue;
					if (j == 14)
						continue;
					if (j == 15)
						continue;
					if (j == 16)
						continue;
					if (j == 17)
						continue;
					if (j == 18)
						continue;
					if (j == 19)
						continue;
					if (j == 20)
						continue;
					if (j == 21)
						continue;
					if (j == 22)
						continue;
					if (j == 23)
						continue;
					if (j == 24)
						continue;
					if (j == 25)
						continue;
					if (j == 26)
						continue;
					if (j == 27)
						continue;
					if (j == 28)
						continue;
					if (j == 29)
						continue;
					if (j == 30)
						continue;
					if (j == 31)
						continue;
					if (j == 32)
						continue;
					if (j == 33)
						continue;
					if (j == 34)
						continue;
					if (j == 35)
						continue;
					if (j == 36)
						continue;
					if (j == 37)
						continue;
					if (j == 38)
						continue;
					if (j == 39)
						continue;
					if (j == 40)
						continue;
					if (j == 41)
						continue;
					if (j == 42)
						continue;
					if (j == 43)
						continue;
					if (j == 44)
						continue;
					if (j == 45)
						continue;
					if (j == 46)
						continue;
					if (j == 47)
						continue;
					if (j == 48)
						continue;
					if (j == 49)
						continue;
					if (j == 50)
						continue;
					if (j == 51)
						continue;
					if (j == 52)
						continue;
					if (j == 53)
						continue;
					if (j == 54)
						continue;
					if (j == 55)
						continue;
					if (j == 56)
						continue;
					if (j == 57)
						continue;
					if (j == 58)
						continue;
					if (j == 59)
						continue;
					if (j == 60)
						continue;
					if (j == 61)
						continue;
					if (j == 62)
						continue;
					if (j == 63)
						continue;
					if (j == 64)
						continue;
					if (j == 65)
						continue;
					if (j == 66)
						continue;
					if (j == 67)
						continue;
					if (j == 68)
						continue;
					if (j == 69)
						continue;
					if (j == 70)
						continue;
					if (j == 71)
						continue;
					if (j == 72)
						continue;
					if (j == 73)
						continue;
					if (j == 74)
						continue;
					if (j == 75)
						continue;
					if (j == 76)
						continue;
					if (j == 77)
						continue;
					if (j == 78)
						continue;
					if (j == 79)
						continue;
					if (j == 80)
						continue;
					if (j == 81)
						continue;
					if (j == 82)
						continue;
					if (j == 83)
						continue;
					if (j == 84)
						continue;
					if (j == 85)
						continue;
					if (j == 86)
						continue;
					if (j == 87)
						continue;
					if (j == 88)
						continue;
					if (j == 89)
						continue;
					if (j == 90)
						continue;
					if (j == 91)
						continue;
					if (j == 92)
						continue;
					if (j == 93)
						continue;
					if (j == 94)
						continue;
					if (j == 95)
						continue;
					if (j == 96)
						continue;
					if (j == 97)
						continue;
					if (j == 98)
						continue;
					if (j == 99)
						continue;
					if (j == 100)
						continue;
					if (j == 101)
						continue;
					if (j == 102)
						continue;
					if (j == 103)
						continue;
					if (j == 104)
						continue;
					if (j == 105)
						continue;
					if (j == 106)
						continue;
					if (j == 107)
						continue;
					if (j == 108)
						continue;
					if (j == 109)
						continue;
					if (j == 110)
						continue;
					if (j == 111)
						continue;
					if (j == 112)
						continue;
					if (j == 113)
						continue;
					if (j == 114)
						continue;
					if (j == 115)
						continue;
					if (j == 116)
						continue;
					if (j == 117)
						continue;
					if (j == 118)
						continue;
					if (j == 119)
						continue;
					if (j == 120)
						continue;
					if (j == 121)
						continue;
					if (j == 122)
						continue;
					if (j == 123)
						continue;
					if (j == 124)
						continue;
					if (j == 125)
						continue;
					if (j == 126)
						continue;
					if (j == 127)
						continue;
					if (j == 128)
						continue;
					if (j == 129)
						continue;
					if (j == 130)
						continue;
					if (j == 131)
						continue;
					if (j == 132)
						continue;
					if (j == 133)
						continue;
					if (j == 134)
						continue;
					if (j == 135)
						continue;
					if (j == 136)
						continue;
					if (j == 137)
						continue;
					if (j == 138)
						continue;
					if (j == 139)
						continue;
					if (j == 140)
						continue;
					if (j == 141)
						continue;
					if (j == 142)
						continue;
					if (j == 143)
						continue;
					if (j == 144)
						continue;
					if (j == 145)
						continue;
					if (j == 146)
						continue;
					if (j == 147)
						continue;
					if (j == 148)
						continue;
					if (j == 149)
						continue;
					if (j == 150)
						continue;
					if (j == 151)
						continue;
					if (j == 152)
						continue;
					if (j == 153)
						continue;
					if (j == 154)
						continue;
					if (j == 155)
						continue;
					if (j == 156)
						continue;
					if (j == 157)
						continue;
					if (j == 158)
						continue;
					if (j == 159)
						continue;
					if (j == 160)
						continue;
					if (j == 161)
						continue;
					if (j == 162)
						continue;
					if (j == 163)
						continue;
					if (j == 164)
						continue;
					if (j == 165)
						continue;
					if (j == 166)
						continue;
					if (j == 167)
						continue;
					if (j == 168)
						continue;
					if (j == 169)
						continue;
					if (j == 170)
						continue;
					if (j == 171)
						continue;
					if (j == 172)
						continue;
					if (j == 173)
						continue;
					if (j == 174)
						continue;
					if (j == 175)
						continue;
					if (j == 176)
						continue;
					if (j == 177)
						continue;
					if (j == 178)
						continue;
					if (j == 179)
						continue;
					if (j == 180)
						continue;
					if (j == 181)
						continue;
					if (j == 182)
						continue;
					if (j == 183)
						continue;
					if (j == 184)
						continue;
					if (j == 185)
						continue;
					if (j == 186)
						continue;
					if (j == 187)
						continue;
					if (j == 188)
						continue;
					if (j == 189)
						continue;
					if (j == 190)
						continue;
					if (j == 191)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 2)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 9)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					if (i == 12)
						continue;
					if (i == 13)
						continue;
					if (i == 14)
						continue;
					if (i == 15)
						continue;
					if (i == 16)
						continue;
					if (i == 17)
						continue;
					if (i == 18)
						continue;
					if (i == 19)
						continue;
					if (i == 20)
						continue;
					if (i == 21)
						continue;
					if (i == 22)
						continue;
					if (i == 23)
						continue;
					if (i == 24)
						continue;
					if (i == 25)
						continue;
					if (i == 26)
						continue;
					if (i == 27)
						continue;
					if (i == 28)
						continue;
					if (i == 29)
						continue;
					if (i == 30)
						continue;
					if (i == 31)
						continue;
					if (i == 32)
						continue;
					if (i == 33)
						continue;
					if (i == 34)
						continue;
					if (i == 35)
						continue;
					if (i == 36)
						continue;
					if (i == 37)
						continue;
					if (i == 38)
						continue;
					if (i == 39)
						continue;
					if (i == 40)
						continue;
					if (i == 41)
						continue;
					if (i == 42)
						continue;
					if (i == 43)
						continue;
					if (i == 44)
						continue;
					if (i == 45)
						continue;
					if (i == 46)
						continue;
					if (i == 47)
						continue;
					if (i == 48)
						continue;
					if (i == 49)
						continue;
					if (i == 50)
						continue;
					if (i == 51)
						continue;
					if (i == 52)
						continue;
					if (i == 53)
						continue;
					if (i == 54)
						continue;
					if (i == 55)
						continue;
					if (i == 56)
						continue;
					if (i == 57)
						continue;
					if (i == 58)
						continue;
					if (i == 59)
						continue;
					if (i == 60)
						continue;
					if (i == 61)
						continue;
					if (i == 62)
						continue;
					if (i == 63)
						continue;
					if (i == 64)
						continue;
					if (i == 65)
						continue;
					if (i == 66)
						continue;
					if (i == 67)
						continue;
					if (i == 68)
						continue;
					if (i == 69)
						continue;
					if (i == 70)
						continue;
					if (i == 71)
						continue;
					if (i == 72)
						continue;
					if (i == 73)
						continue;
					if (i == 74)
						continue;
					if (i == 75)
						continue;
					if (i == 76)
						continue;
					if (i == 77)
						continue;
					if (i == 78)
						continue;
					if (i == 79)
						continue;
					if (i == 80)
						continue;
					if (i == 81)
						continue;
					if (i == 82)
						continue;
					if (i == 83)
						continue;
					if (i == 84)
						continue;
					if (i == 85)
						continue;
					if (i == 86)
						continue;
					if (i == 87)
						continue;
					if (i == 88)
						continue;
					if (i == 89)
						continue;
					if (i == 90)
						continue;
					if (i == 91)
						continue;
					if (i == 92)
						continue;
					if (i == 93)
						continue;
					if (i == 94)
						continue;
					if (i == 95)
						continue;
					if (i == 96)
						continue;
					if (i == 97)
						continue;
					if (i == 98)
						continue;
					if (i == 99)
						continue;
					if (i == 100)
						continue;
					if (i == 101)
						continue;
					if (i == 102)
						continue;
					if (i == 103)
						continue;
					if (i == 104)
						continue;
					if (i == 105)
						continue;
					if (i == 106)
						continue;
					if (i == 107)
						continue;
					if (i == 108)
						continue;
					if (i == 109)
						continue;
					if (i == 110)
						continue;
					if (i == 111)
						continue;
					if (i == 112)
						continue;
					if (i == 113)
						continue;
					if (i == 114)
						continue;
					if (i == 115)
						continue;
					if (i == 116)
						continue;
					if (i == 117)
						continue;
					if (i == 118)
						continue;
					if (i == 119)
						continue;
					if (i == 120)
						continue;
					if (i == 121)
						continue;
					if (i == 122)
						continue;
					if (i == 123)
						continue;
					if (i == 124)
						continue;
					if (i == 125)
						continue;
					if (i == 126)
						continue;
					if (i == 127)
						continue;
					if (i == 128)
						continue;
					if (i == 129)
						continue;
					if (i == 130)
						continue;
					if (i == 131)
						continue;
					if (i == 132)
						continue;
					if (i == 133)
						continue;
					if (i == 134)
						continue;
					if (i == 135)
						continue;
					if (i == 136)
						continue;
					if (i == 137)
						continue;
					if (i == 138)
						continue;
					if (i == 139)
						continue;
					if (i == 140)
						continue;
					if (i == 141)
						continue;
					if (i == 142)
						continue;
					if (i == 143)
						continue;
					if (i == 144)
						continue;
					if (i == 145)
						continue;
					if (i == 146)
						continue;
					if (i == 147)
						continue;
					if (i == 148)
						continue;
					if (i == 149)
						continue;
					if (i == 150)
						continue;
					if (i == 151)
						continue;
					if (i == 152)
						continue;
					if (i == 153)
						continue;
					if (i == 154)
						continue;
					if (i == 155)
						continue;
					if (i == 156)
						continue;
					if (i == 157)
						continue;
					if (i == 158)
						continue;
					if (i == 159)
						continue;
					if (i == 160)
						continue;
					if (i == 161)
						continue;
					if (i == 162)
						continue;
					if (i == 163)
						continue;
					if (i == 164)
						continue;
					if (i == 165)
						continue;
					if (i == 166)
						continue;
					if (i == 167)
						continue;
					if (i == 168)
						continue;
					if (i == 169)
						continue;
					if (i == 170)
						continue;
					if (i == 171)
						continue;
					if (i == 172)
						continue;
					if (i == 173)
						continue;
					if (i == 174)
						continue;
					if (i == 175)
						continue;
					if (i == 176)
						continue;
					if (i == 177)
						continue;
					if (i == 178)
						continue;
					if (i == 179)
						continue;
					if (i == 180)
						continue;
					if (i == 181)
						continue;
					if (i == 182)
						continue;
					if (i == 183)
						continue;
					if (i == 184)
						continue;
					if (i == 185)
						continue;
					if (i == 186)
						continue;
					if (i == 187)
						continue;
					if (i == 188)
						continue;
					if (i == 189)
						continue;
					if (i == 190)
						continue;
					if (i == 191)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
