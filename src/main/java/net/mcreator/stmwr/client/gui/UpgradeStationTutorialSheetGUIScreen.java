package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.UpgradeStationTutorialSheetGUIMenu;
import net.mcreator.stmwr.network.UpgradeStationTutorialSheetGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UpgradeStationTutorialSheetGUIScreen extends AbstractContainerScreen<UpgradeStationTutorialSheetGUIMenu> {
	private final static HashMap<String, Object> guistate = UpgradeStationTutorialSheetGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ok;

	public UpgradeStationTutorialSheetGUIScreen(UpgradeStationTutorialSheetGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/upgrade_station_tutorial_sheet_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_how_to_use_upgrade_station"), 16, 2, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_put_ingredients_on_the_left"), 14, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_put_the_main_item_in_the_middle"), 5, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_push_fuse"), 57, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_enjoy"), 65, 46, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_and_where_do_you_find_recipes"), 10, 55, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_you_can_guess"), 44, 65, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_you_can_look_at_advancements"), 7, 76, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_or_google_it"), 47, 86, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.label_youll_do_it_anyways_wont_you"), 4, 95, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_ok = Button.builder(Component.translatable("gui.stmwr.upgrade_station_tutorial_sheet_gui.button_ok"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new UpgradeStationTutorialSheetGUIButtonMessage(0, x, y, z));
				UpgradeStationTutorialSheetGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 109, 35, 20).build();
		guistate.put("button:button_ok", button_ok);
		this.addRenderableWidget(button_ok);
	}
}
