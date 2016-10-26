package me.alexlander123.sfcalculator;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SFCalculator extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version "  + pdfFile.getVersion() + " by " + pdfFile.getAuthors() + " Has Been Enabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("coalcal")) {
			if(args.length >= 2){
			String calType = args[0];
			if(isNumber(args[1])){
			Integer numberOfResource = Integer.parseInt(args[1]);
			switch (calType){
			case("1"): {
			    int coalAmountForCarbon = (numberOfResource*4);
			    int stackCoalAmountForCarbon = (coalAmountForCarbon/64);
			    sender.sendMessage("You would need " + coalAmountForCarbon + " coal, which means " + stackCoalAmountForCarbon + " stacks.");
			    sender.sendMessage("Thank you for using the Nihilist SF Coal Calculator v.2. " + "(Converted into plugin by AlexLander123)");
			}
			case("2"): {
				int coalAmountForCompcarbon = (numberOfResource*4*8);
			    int stackCoalAmountForCompcarbon = (coalAmountForCompcarbon/64);
			    sender.sendMessage("You would need " + coalAmountForCompcarbon + " coal, which means " + stackCoalAmountForCompcarbon + " stacks.");
			    sender.sendMessage("Thank you for using the Nihilist SF Coal Calculator v.2. " + "(Converted into plugin by AlexLander123)");
			}
			case("3"): {
				int coalAmountForChunk = (numberOfResource*4*8*8);
				int stackCoalAmountForChunk = (coalAmountForChunk/64);
				int flintAmount= (coalAmountForChunk/4/8/8);
				sender.sendMessage("You would need " + coalAmountForChunk + " coal, which means " + stackCoalAmountForChunk + " stacks.You would also need " + flintAmount + " flint.");
				sender.sendMessage("Thank you for using the Nihilist SF Coal Calculator v.2. " + "(Converted into plugin by AlexLander123)");
			}
			case("4"): {
				int coalAmountForCarbonado = (numberOfResource*4*8*8*2);
				int stackCoalAmountForCarbonado = (coalAmountForCarbonado/64);
				int flintAmount = (coalAmountForCarbonado/4/8/8);
				int glassPaneAmount = (coalAmountForCarbonado/4/8/8/2);
				sender.sendMessage("You would need " + coalAmountForCarbonado + " coal, which means " + stackCoalAmountForCarbonado + " stacks. You would also need " + flintAmount + " flint and " + glassPaneAmount + " glass panes.");
			}
			
			}
			}
			}
			
		}
		else if(label.equalsIgnoreCase("raical")){
			if(args.length >= 1){
			if(isNumber(args[0])){
				int numberOfRai = Integer.parseInt(args[0]);
				int tinDust = (numberOfRai*3);
				int leadDust = (numberOfRai*2);
				int coal = (numberOfRai*64);
				int ironDust = (numberOfRai*8);
				int silverDust = (numberOfRai*3);
				int copperDust = (numberOfRai*7);
				int goldDust = (numberOfRai*13);
				int goldDust3 = (numberOfRai*11);
			    int coal2 = (numberOfRai*4);
			    sender.sendMessage("List of all the raw material that you will need:");
			    sender.sendMessage(tinDust + " Tin Dust.");
			    sender.sendMessage(leadDust + " Lead Dust.");
			    sender.sendMessage(coal + " Coal.");
			    sender.sendMessage(ironDust + " Iron Dust.");
			    sender.sendMessage(silverDust + " Silver Dust.");
			    sender.sendMessage(copperDust + " Copper Dust.");
			    sender.sendMessage(goldDust + " Gold Dust");
			    sender.sendMessage("These are the inuctions for making " + numberOfRai + " reinforced alloy ingot(s)");
			    sender.sendMessage("1. Turn all the coal into carbon.");
			    sender.sendMessage("2. Turn " + coal2 + "carbon into compressed carbon, let the rest be");
			    sender.sendMessage("3. Turn " + goldDust3 + " gold dusts into " + numberOfRai + " 24-carat gold.");
			}
			}
		}
		return false; 
	}
	
	public static boolean isNumber(String num){
	try{
		Integer.parseInt(num);
	}catch (Exception e) {
		return false;
	}
	return true;
	}
}
