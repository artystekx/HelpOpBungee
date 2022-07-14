package pl.loveese.cmds;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.protocol.packet.Chat;

public class ReplyCommand extends Command {

    LoveHelpopCommand lh;

    public ReplyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        if(args.length >= 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < args.length; ++i) {
                sb.append(args[i]).append(" ");
            }

            String msg = sb.toString();

            if(p.hasPermission("love.helpop.message")) {
                ProxiedPlayer cel = ProxyServer.getInstance().getPlayer(args[0]);
                cel.sendMessage(ChatColor.GREEN + "Odpowiedział " + p.getName());
                cel.sendMessage(ChatColor.GREEN +"Odpowiedz: " + msg);
                cel.sendMessage(ChatColor.GREEN + "Mamy nadzieje ze rozwialismy twoj problem");

                p.sendMessage(ChatColor.GREEN + "Pomyślnie wysłałeś odpowiedz");
            }
        }
    }
}
