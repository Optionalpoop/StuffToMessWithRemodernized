
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

public class AdvancedCubbyCubeGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
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

	public AdvancedCubbyCubeGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(StmwrModMenus.ADVANCED_CUBBY_CUBE_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(95);
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
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 9) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 25, 9) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 43, 9) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 61, 9) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 79, 9) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 97, 9) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 115, 9) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 133, 9) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 151, 9) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 169, 9) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 187, 9) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 205, 9) {
			private final int slot = 11;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 223, 9) {
			private final int slot = 12;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 241, 9) {
			private final int slot = 13;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 259, 9) {
			private final int slot = 14;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 277, 9) {
			private final int slot = 15;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 295, 9) {
			private final int slot = 16;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 313, 9) {
			private final int slot = 17;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 331, 9) {
			private final int slot = 18;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 7, 27) {
			private final int slot = 19;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 25, 27) {
			private final int slot = 20;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 43, 27) {
			private final int slot = 21;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 61, 27) {
			private final int slot = 22;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 79, 27) {
			private final int slot = 23;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 97, 27) {
			private final int slot = 24;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 115, 27) {
			private final int slot = 25;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 133, 27) {
			private final int slot = 26;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 151, 27) {
			private final int slot = 27;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 169, 27) {
			private final int slot = 28;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 187, 27) {
			private final int slot = 29;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 205, 27) {
			private final int slot = 30;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 223, 27) {
			private final int slot = 31;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 241, 27) {
			private final int slot = 32;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 259, 27) {
			private final int slot = 33;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 277, 27) {
			private final int slot = 34;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 295, 27) {
			private final int slot = 35;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 313, 27) {
			private final int slot = 36;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 331, 27) {
			private final int slot = 37;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 7, 45) {
			private final int slot = 38;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 25, 45) {
			private final int slot = 39;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 43, 45) {
			private final int slot = 40;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 61, 45) {
			private final int slot = 41;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 79, 45) {
			private final int slot = 42;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 97, 45) {
			private final int slot = 43;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 115, 45) {
			private final int slot = 44;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 133, 45) {
			private final int slot = 45;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 151, 45) {
			private final int slot = 46;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 169, 45) {
			private final int slot = 47;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 187, 45) {
			private final int slot = 48;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 205, 45) {
			private final int slot = 49;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 223, 45) {
			private final int slot = 50;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 241, 45) {
			private final int slot = 51;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 259, 45) {
			private final int slot = 52;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 277, 45) {
			private final int slot = 53;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 295, 45) {
			private final int slot = 54;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 313, 45) {
			private final int slot = 55;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 331, 45) {
			private final int slot = 56;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 7, 63) {
			private final int slot = 57;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 25, 63) {
			private final int slot = 58;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 43, 63) {
			private final int slot = 59;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 61, 63) {
			private final int slot = 60;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 79, 63) {
			private final int slot = 61;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 97, 63) {
			private final int slot = 62;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 115, 63) {
			private final int slot = 63;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 133, 63) {
			private final int slot = 64;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 151, 63) {
			private final int slot = 65;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 169, 63) {
			private final int slot = 66;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 187, 63) {
			private final int slot = 67;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 205, 63) {
			private final int slot = 68;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 223, 63) {
			private final int slot = 69;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 241, 63) {
			private final int slot = 70;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 259, 63) {
			private final int slot = 71;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 277, 63) {
			private final int slot = 72;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 295, 63) {
			private final int slot = 73;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 313, 63) {
			private final int slot = 74;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 331, 63) {
			private final int slot = 75;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 7, 81) {
			private final int slot = 76;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 25, 81) {
			private final int slot = 77;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 43, 81) {
			private final int slot = 78;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 61, 81) {
			private final int slot = 79;
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 79, 81) {
			private final int slot = 80;
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 97, 81) {
			private final int slot = 81;
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 115, 81) {
			private final int slot = 82;
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 133, 81) {
			private final int slot = 83;
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 151, 81) {
			private final int slot = 84;
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 169, 81) {
			private final int slot = 85;
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 187, 81) {
			private final int slot = 86;
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 205, 81) {
			private final int slot = 87;
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 223, 81) {
			private final int slot = 88;
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 241, 81) {
			private final int slot = 89;
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 259, 81) {
			private final int slot = 90;
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 277, 81) {
			private final int slot = 91;
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 295, 81) {
			private final int slot = 92;
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 313, 81) {
			private final int slot = 93;
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 331, 81) {
			private final int slot = 94;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 90 + 8 + sj * 18, 19 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 90 + 8 + si * 18, 19 + 142));
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
			if (index < 95) {
				if (!this.moveItemStackTo(itemstack1, 95, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 95, false)) {
				if (index < 95 + 27) {
					if (!this.moveItemStackTo(itemstack1, 95 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 95, 95 + 27, false))
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
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
