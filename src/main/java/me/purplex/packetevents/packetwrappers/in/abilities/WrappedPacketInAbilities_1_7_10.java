package me.purplex.packetevents.packetwrappers.in.abilities;

import me.purplex.packetevents.packetwrappers.api.version.WrappedVersionPacket;
import net.minecraft.server.v1_7_R4.PacketPlayInAbilities;


class WrappedPacketInAbilities_1_7_10 extends WrappedVersionPacket {
    WrappedPacketInAbilities_1_7_10(Object packet) {
        super(packet);
    }


    @Override
    protected void setup() {
        PacketPlayInAbilities p = (PacketPlayInAbilities) packet;
        this.a = p.c();
        this.b = p.isFlying();
        this.c = p.e();
        this.d = p.f();
        this.e = p.g();
        this.f = p.h();
    }

    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
}