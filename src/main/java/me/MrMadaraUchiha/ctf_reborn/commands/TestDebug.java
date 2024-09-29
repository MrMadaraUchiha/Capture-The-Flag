package me.MrMadaraUchiha.ctf_reborn.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestDebug implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        commandSender.sendMessage("§cOpa, testando o plugin? Vamos nessa!");

        commandSender.sendMessage("§cAinda aqui? Persistente, hein!");

        commandSender.sendMessage("§cMais um teste, so pra garantir!");

        commandSender.sendMessage("§cVoce ta quase virando um mestre dos testes!");

        commandSender.sendMessage("§cQuase la! Segura firme!");

        commandSender.sendMessage("§cO clima ta esquentando aqui!");

        commandSender.sendMessage("§cPronto, teste concluido com sucesso!");


        return true;
    }
}
