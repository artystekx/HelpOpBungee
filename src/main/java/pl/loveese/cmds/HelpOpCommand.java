package pl.loveese.cmds;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.protocol.packet.Chat;

import java.net.Proxy;

public class HelpOpCommand extends Command {
    public HelpOpCommand(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        if(args.length >= 1) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < args.length; ++i) {
                sb.append(args[i]).append(" ");
            }

            String msg = sb.toString();

            p.sendMessage(ChatColor.GREEN + "Pomyślnie wysłałeś zgłoszenie o pomoc administracji");

            for(ProxiedPlayer ps : ProxyServer.getInstance().getPlayers()) {
                if(ps.hasPermission("love.helpop.message")) {
                    ps.sendMessage(" ");
                    ps.sendMessage(ChatColor.RED + "HelpOp");
                    ps.sendMessage(" ");
                    ps.sendMessage(ChatColor.GREEN + "Serwer: " + ChatColor.GOLD + p.getServer().getInfo().getName());
                    ps.sendMessage(" ");
                    ps.sendMessage(ChatColor.GREEN + "Wysłał: " + ChatColor.GOLD + p.getName());
                    ps.sendMessage(" ");
                    ps.sendMessage(ChatColor.GREEN + "Treść: " + ChatColor.GOLD + msg);
                    ps.sendMessage(" ");
                }
            }
        }
    }
}
