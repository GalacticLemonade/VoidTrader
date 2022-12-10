package me.galacticlemon.voidtrader.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class VoidtraderClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("hello world");
    }
}
