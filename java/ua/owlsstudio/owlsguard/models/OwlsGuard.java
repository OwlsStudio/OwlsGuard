package ua.owlsstudio.owlsguard.models;

import java.io.*;
import org.bukkit.plugin.java.*;
import ua.owlsstudio.owlsguard.models.accepter.*;

public class OwlsGuard {

    public OwlsGuard(JavaPlugin plugin, ConsumerVerifiers consumerVerifiers, File file) {
        consumerVerifiers.getConsumerVerifiers().activate();
        System.out.println("Plugin " + plugin.getDescription().getName() + " plugin successful loaded");
    }

}
