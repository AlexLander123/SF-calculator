package me.alexlander123.sfcalculator;

import org.bukkit.command.CommandSender;

public class MessageHandler {
	public final static String prefix = "SFCalculator >";
	public static void sendIncorrectCommandUsage(String command, CommandSender sender){
		switch(command){
		case("coalcal"): {
			sendMessage(sender, "Usage: /coalcal <Item Code> <Amount of Item>");
			sendMessage(sender, "Item Codes:");
			sendMessage(sender, "Carbon - 1");
			sendMessage(sender, "Compressed Carbon - 2");
			sendMessage(sender, "Carbon Chunks or Synthetic Diamond - 3");
			sendMessage(sender, "Carbonado - 4");
		}
		case("raical"): {
			sendMessage(sender, "Usage: /raical <Amount of Reinforced Alloy Ingot>");
		}
		default: break;
		}
	}
	
	public static void sendMessage(CommandSender sender, String message){
		sender.sendMessage(prefix + message);
	}
}
