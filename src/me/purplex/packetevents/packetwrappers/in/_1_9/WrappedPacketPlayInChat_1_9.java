package me.purplex.packetevents.packetwrappers.in._1_9;

import me.purplex.packetevents.packetwrappers.api.version.WrappedVersionPacket;
import net.minecraft.server.v1_9_R1.PacketPlayInChat;

public class WrappedPacketPlayInChat_1_9 extends WrappedVersionPacket {
    public String message;
    public WrappedPacketPlayInChat_1_9(Object packet) {
        super(packet);
    }

    @Override
    protected void setup() {
        PacketPlayInChat p = (PacketPlayInChat)packet;
        this.message = p.a();
    }
}
