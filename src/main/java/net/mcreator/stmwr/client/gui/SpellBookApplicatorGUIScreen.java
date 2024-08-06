package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.SpellBookApplicatorGUIMenu;
import net.mcreator.stmwr.network.SpellBookApplicatorGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellBookApplicatorGUIScreen extends AbstractContainerScreen<SpellBookApplicatorGUIMenu> {
	private final static HashMap<String, Object> guistate = SpellBookApplicatorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_make_wand;

	public SpellBookApplicatorGUIScreen(SpellBookApplicatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/spell_book_applicator_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_gui.label_spell_book"), 48, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_gui.label_wandar"), 7, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_gui.label_base"), 10, 60, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_gui.label_output"), 121, 26, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_make_wand = Button.builder(Component.translatable("gui.stmwr.spell_book_applicator_gui.button_make_wand"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SpellBookApplicatorGUIButtonMessage(0, x, y, z));
				SpellBookApplicatorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 67, this.topPos + 38, 72, 20).build();
		guistate.put("button:button_make_wand", button_make_wand);
		this.addRenderableWidget(button_make_wand);
	}
}
