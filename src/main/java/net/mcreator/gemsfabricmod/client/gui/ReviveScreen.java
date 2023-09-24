package net.mcreator.gemsfabricmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.gemsfabricmod.world.inventory.ReviveMenu;
import net.mcreator.gemsfabricmod.network.ReviveButtonMessage;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReviveScreen extends AbstractContainerScreen<ReviveMenu> {
	private final static HashMap<String, Object> guistate = ReviveMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_the_weref0x;
	Button button_cryokinetica;
	Button button_gabino12;
	Button button_xselite;
	Button button_zecrom5599;
	Button button_carlwheezer;
	Button button_crazycraft186;
	Button button_clownplin;
	Button button_wiitthered;
	Button button_toastedcookie;
	Button button_xrvb;
	Button button_remn_rs;
	Button button_qv1d;
	Button button_zonally;

	public ReviveScreen(ReviveMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 194;
		this.imageHeight = 241;
	}

	private static final ResourceLocation texture = new ResourceLocation("gems_fabric_mod:textures/screens/revive.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.gems_fabric_mod.revive.label_revive_players"), 61, 8, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_the_weref0x = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_the_weref0x"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(0, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 46, 82, 20).build();
		guistate.put("button:button_the_weref0x", button_the_weref0x);
		this.addRenderableWidget(button_the_weref0x);
		button_cryokinetica = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_cryokinetica"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(1, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 46, 88, 20).build();
		guistate.put("button:button_cryokinetica", button_cryokinetica);
		this.addRenderableWidget(button_cryokinetica);
		button_gabino12 = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_gabino12"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(2, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 117, this.topPos + 170, 67, 20).build();
		guistate.put("button:button_gabino12", button_gabino12);
		this.addRenderableWidget(button_gabino12);
		button_xselite = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_xselite"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(3, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 139, 61, 20).build();
		guistate.put("button:button_xselite", button_xselite);
		this.addRenderableWidget(button_xselite);
		button_zecrom5599 = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_zecrom5599"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(4, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 109, 77, 20).build();
		guistate.put("button:button_zecrom5599", button_zecrom5599);
		this.addRenderableWidget(button_zecrom5599);
		button_carlwheezer = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_carlwheezer"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(5, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 77, 93, 20).build();
		guistate.put("button:button_carlwheezer", button_carlwheezer);
		this.addRenderableWidget(button_carlwheezer);
		button_crazycraft186 = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_crazycraft186"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(6, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 90, this.topPos + 139, 93, 20).build();
		guistate.put("button:button_crazycraft186", button_crazycraft186);
		this.addRenderableWidget(button_crazycraft186);
		button_clownplin = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_clownplin"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(7, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 77, 72, 20).build();
		guistate.put("button:button_clownplin", button_clownplin);
		this.addRenderableWidget(button_clownplin);
		button_wiitthered = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_wiitthered"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(8, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 109, 77, 20).build();
		guistate.put("button:button_wiitthered", button_wiitthered);
		this.addRenderableWidget(button_wiitthered);
		button_toastedcookie = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_toastedcookie"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(9, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 171, 103, 20).build();
		guistate.put("button:button_toastedcookie", button_toastedcookie);
		this.addRenderableWidget(button_toastedcookie);
		button_xrvb = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_xrvb"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(10, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 202, 46, 20).build();
		guistate.put("button:button_xrvb", button_xrvb);
		this.addRenderableWidget(button_xrvb);
		button_remn_rs = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_remn_rs"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(11, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 19, 61, 20).build();
		guistate.put("button:button_remn_rs", button_remn_rs);
		this.addRenderableWidget(button_remn_rs);
		button_qv1d = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_qv1d"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(12, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 137, this.topPos + 20, 46, 20).build();
		guistate.put("button:button_qv1d", button_qv1d);
		this.addRenderableWidget(button_qv1d);
		button_zonally = Button.builder(Component.translatable("gui.gems_fabric_mod.revive.button_zonally"), e -> {
			if (true) {
				GemsFabricModMod.PACKET_HANDLER.sendToServer(new ReviveButtonMessage(13, x, y, z));
				ReviveButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 202, 61, 20).build();
		guistate.put("button:button_zonally", button_zonally);
		this.addRenderableWidget(button_zonally);
	}
}
