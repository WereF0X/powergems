
package net.mcreator.gemsfabricmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.gemsfabricmod.world.inventory.ReviveMenu;
import net.mcreator.gemsfabricmod.procedures.Revive6Procedure;
import net.mcreator.gemsfabricmod.procedures.Revive5Procedure;
import net.mcreator.gemsfabricmod.procedures.Revive4Procedure;
import net.mcreator.gemsfabricmod.procedures.Revive3Procedure;
import net.mcreator.gemsfabricmod.procedures.Revive2Procedure;
import net.mcreator.gemsfabricmod.procedures.Revive1Procedure;
import net.mcreator.gemsfabricmod.procedures.R9Procedure;
import net.mcreator.gemsfabricmod.procedures.R8Procedure;
import net.mcreator.gemsfabricmod.procedures.R7Procedure;
import net.mcreator.gemsfabricmod.procedures.R14Procedure;
import net.mcreator.gemsfabricmod.procedures.R13Procedure;
import net.mcreator.gemsfabricmod.procedures.R12Procedure;
import net.mcreator.gemsfabricmod.procedures.R11Procedure;
import net.mcreator.gemsfabricmod.procedures.R10Procedure;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReviveButtonMessage {
	private final int buttonID, x, y, z;

	public ReviveButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ReviveButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ReviveButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ReviveButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ReviveMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Revive1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			Revive2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			Revive3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			Revive4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Revive5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			R8Procedure.execute(entity);
		}
		if (buttonID == 6) {

			R9Procedure.execute(entity);
		}
		if (buttonID == 7) {

			R12Procedure.execute(entity);
		}
		if (buttonID == 8) {

			R13Procedure.execute(entity);
		}
		if (buttonID == 9) {

			R14Procedure.execute(entity);
		}
		if (buttonID == 10) {

			Revive6Procedure.execute(entity);
		}
		if (buttonID == 11) {

			R7Procedure.execute(entity);
		}
		if (buttonID == 12) {

			R10Procedure.execute(entity);
		}
		if (buttonID == 13) {

			R11Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GemsFabricModMod.addNetworkMessage(ReviveButtonMessage.class, ReviveButtonMessage::buffer, ReviveButtonMessage::new, ReviveButtonMessage::handler);
	}
}
