package pl.loveese;

import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.YamlConfiguration;
import pl.loveese.cmds.HelpOpCommand;
import pl.loveese.cmds.LoveHelpopCommand;
import pl.loveese.cmds.ReplyCommand;

import java.io.IOException;

public final class Main extends Plugin {

    @Override
    public void onEnable() {

        getProxy().getPluginManager().registerCommand(this, new LoveHelpopCommand("lovehelpop"));
        getProxy().getPluginManager().registerCommand(this, new HelpOpCommand("helpop"));
        getProxy().getPluginManager().registerCommand(this, new ReplyCommand("reply"));
    }
}
