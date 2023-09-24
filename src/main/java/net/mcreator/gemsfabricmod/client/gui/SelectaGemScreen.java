package net.mcreator.gemsfabricmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gemsfabricmod.world.inventory.SelectaGemMenu;
import net.mcreator.gemsfabricmod.network.SelectaGemButtonMessage;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SelectaGemScreen extends AbstractContainerScreen<SelectaGemMenu> {
	private final static HashMap<String, Object> guistate = SelectaGemMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fire_gem;
	Button button_life_gem;
	Button button_strenght_gem;
	Button button_earth_gem;
	Button button_netherite_gem;
	Button button_sculk_gem;
	Button button_next;

	public SelectaGemScreen(SelectaGemMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("gems_fabric_mod:textures/screens/selecta_gem.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.gems_fabric_mod.selecta_gem.label_select_a_gem"), 51, 28, -39424, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_fire_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_fire_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(0, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 12, this.topPos + 53, 66, 20).build();
		guistate.put("button:button_fire_gem", button_fire_gem);
		this.addRenderableWidget(button_fire_gem);
		button_life_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_life_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(1, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 97, this.topPos + 52, 66, 20).build();
		guistate.put("button:button_life_gem", button_life_gem);
		this.addRenderableWidget(button_life_gem);
		button_strenght_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_strenght_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(2, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 90, 87, 20).build();
		guistate.put("button:button_strenght_gem", button_strenght_gem);
		this.addRenderableWidget(button_strenght_gem);
		button_earth_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_earth_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(3, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 90, 72, 20).build();
		guistate.put("button:button_earth_gem", button_earth_gem);
		this.addRenderableWidget(button_earth_gem);
		button_netherite_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_netherite_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(4, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 0, this.topPos + 128, 93, 20).build();
		guistate.put("button:button_netherite_gem", button_netherite_gem);
		this.addRenderableWidget(button_netherite_gem);
		button_sculk_gem = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_sculk_gem"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(5, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 97, this.topPos + 128, 72, 20).build();
		guistate.put("button:button_sculk_gem", button_sculk_gem);
		this.addRenderableWidget(button_sculk_gem);
		button_next = Button.builder(Component.translatable("gui.gems_fabric_mod.selecta_gem.button_next"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new SelectaGemButtonMessage(6, x, y, z));
				SelectaGemButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 128, this.topPos + 1, 46, 20).build();
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
	}
}
