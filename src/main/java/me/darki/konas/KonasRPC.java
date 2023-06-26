package me.darki.konas;

//import club.minnced.discord.rpc.DiscordEventHandlers;
//import club.minnced.discord.rpc.DiscordRPC;
//import club.minnced.discord.rpc.DiscordRichPresence;
import net.minecraft.client.Minecraft;

public class KonasRPC {
    //private final String ClientId = "813675760953851924";
    private final Minecraft mc = Minecraft.getMinecraft();
    //private final DiscordRPC rpc = DiscordRPC.INSTANCE;
    //public DiscordRichPresence presence = new DiscordRichPresence();
    private String details;
    private String state;

    public boolean isRunning = false;

    public boolean cute = false;

    public boolean discordLink = false;

    public void enable() {
        
    }

    public void disable() {
        
    }

    public void updateLargeImageText() {

        
    }

    public void updateLargeImageKey() {
        //presence.largeImageKey = cute ? "cutekonas" : "konas";
    }

    public void setDiscordLink(Boolean value) {
        
    }

    public void setCute(Boolean value) {
        
    }
}

