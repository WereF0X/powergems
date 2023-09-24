
package net.mcreator.gemsfabricmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.gemsfabricmod.world.inventory.SelectaGemMenu;
import net.mcreator.gemsfabricmod.procedures.Procedure1Procedure;
import net.mcreator.gemsfabricmod.procedures.GuistrenghtProcedure;
import net.mcreator.gemsfabricmod.procedures.GuisculkProcedure;
import net.mcreator.gemsfabricmod.procedures.GuinetherProcedure;
import net.mcreator.gemsfabricmod.procedures.GuilifeProcedure;
import net.mcreator.gemsfabricmod.procedures.GuifireProcedure;
import net.mcreator.gemsfabricmod.procedures.GuiearthProcedure;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SelectaGemButtonMessage {
	private final int buttonID, x, y, z;

	public SelectaGemButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SelectaGemButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SelectaGemButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SelectaGemButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SelectaGemMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GuifireProcedure.execute(entity);
		}
		if (buttonID == 1) {

			GuilifeProcedure.execute(entity);
		}
		if (buttonID == 2) {

			GuistrenghtProcedure.execute(entity);
		}
		if (buttonID == 3) {

			GuiearthProcedure.execute(entity);
		}
		if (buttonID == 4) {

			GuinetherProcedure.execute(entity);
		}
		if (buttonID == 5) {

			GuisculkProcedure.execute(entity);
		}
		if (buttonID == 6) {

			Procedure1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GemsFabricModMod.addNetworkMessage(SelectaGemButtonMessage.class, SelectaGemButtonMessage::buffer, SelectaGemButtonMessage::new, SelectaGemButtonMessage::handler);
	}
}
