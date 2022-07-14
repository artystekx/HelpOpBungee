package pl.loveese.cmds;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class LoveHelpopCommand extends Command {
    public LoveHelpopCommand(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        p.sendMessage(ChatColor.GOLD + "LoveHelpop 1.0.0 by" + ChatColor.YELLOW + " loveese");
    }
}
