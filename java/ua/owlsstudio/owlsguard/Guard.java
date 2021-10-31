package ua.owlsstudio.owlsguard;

import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class Guard extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[OwlsGuard] Success");
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(this);
    }
}
