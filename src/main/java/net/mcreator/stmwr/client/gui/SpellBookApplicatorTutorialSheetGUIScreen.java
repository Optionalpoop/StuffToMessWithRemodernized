package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.SpellBookApplicatorTutorialSheetGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellBookApplicatorTutorialSheetGUIScreen extends AbstractContainerScreen<SpellBookApplicatorTutorialSheetGUIMenu> {
	private final static HashMap<String, Object> guistate = SpellBookApplicatorTutorialSheetGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SpellBookApplicatorTutorialSheetGUIScreen(SpellBookApplicatorTutorialSheetGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 206;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/spell_book_applicator_tutorial_sheet_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_how_to_use_spell_book_applicator"), 18, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_put_an_advanced_wand_stick_in_b"), 9, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_put_one_of_the_two_types_of_wand"), 9, 37, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_in_the_wandar_slot"), 49, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_finally_put_the_spell_book_in_t"), 13, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_spell_book_slot"), 55, 67, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spell_book_applicator_tutorial_sheet_gui.label_then_hit_the_button"), 48, 77, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
