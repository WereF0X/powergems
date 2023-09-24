package net.mcreator.gemsfabricmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gemsfabricmod.world.inventory.ChangeGemMenu;
import net.mcreator.gemsfabricmod.network.ChangeGemButtonMessage;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChangeGemScreen extends AbstractContainerScreen<ChangeGemMenu> {
	private final static HashMap<String, Object> guistate = ChangeGemMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fire_gem;
	Button button_life_gem;
	Button button_strength_gem;
	Button button_earth_gem;
	Button button_netherite_gem;
	Button button_sculk_gem;

	public ChangeGemScreen(ChangeGemMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 188;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("gems_fabric_mod:textures/screens/change_gem.png");

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.gems_fabric_mod.change_gem.label_choose_your_gem"), 51, 8, -23296, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_fire_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_fire_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(0, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 21, 66, 20).build();
		guistate.put("button:button_fire_gem", button_fire_gem);
		this.addRenderableWidget(button_fire_gem);
		button_life_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_life_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(1, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 111, this.topPos + 21, 66, 20).build();
		guistate.put("button:button_life_gem", button_life_gem);
		this.addRenderableWidget(button_life_gem);
		button_strength_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_strength_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(2, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 72, 87, 20).build();
		guistate.put("button:button_strength_gem", button_strength_gem);
		this.addRenderableWidget(button_strength_gem);
		button_earth_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_earth_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(3, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 109, this.topPos + 72, 72, 20).build();
		guistate.put("button:button_earth_gem", button_earth_gem);
		this.addRenderableWidget(button_earth_gem);
		button_netherite_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_netherite_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(4, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 2, this.topPos + 126, 93, 20).build();
		guistate.put("button:button_netherite_gem", button_netherite_gem);
		this.addRenderableWidget(button_netherite_gem);
		button_sculk_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.change_gem.button_sculk_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ChangeGemButtonMessage(5, x, y, z));
				ChangeGemButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 109, this.topPos + 126, 72, 20).build();
		guistate.put("button:button_sculk_gem", button_sculk_gem);
		this.addRenderableWidget(button_sculk_gem);
	}
}
