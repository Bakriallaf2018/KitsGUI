package bartboy8.kgui.main;

import java.io.File;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	ItemStack ppBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
	ArrayList<String> loreList = new ArrayList<String>();
	Inventory test;
	Player player;
	
	Inventory inv1;
	Inventory inv2;
	Inventory inv3;
	Inventory inv4;
	Inventory inv5;
	Inventory inv6;
	Inventory inv7;
	Inventory inv8;
	Inventory inv9;
	
	String allArgs;
	
	Functions f = new Functions(this);
	
	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(new Listeners(this), this);
		System.out.println("Kits V1.0 Alpha Has Started!");
	    File f = new File(this.getDataFolder(), "config.yml");
	    if(!f.exists()){
	        this.saveDefaultConfig();
	    }else{
	    	return;
	    }
	    getConfig();
	}
	
	public void onDisable(){}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("kits")){
			
			if(player.hasPermission("kgui.cmd.edit")){
			if(args.length == 2 && args[0].equalsIgnoreCase("edit")){
				
				if(args[1].equalsIgnoreCase("kit1")){
					inv1 = getServer().createInventory(player, 27, this.getConfig().getString("kit1.Title"));
					Inventory inv1con = InventoryIO.StringToInventory(this.getConfig().getString("kit1.Inv"));
					inv1.setContents(inv1con.getContents());
					player.openInventory(inv1);
				}
				if(args[1].equalsIgnoreCase("kit2")){
					inv2 = getServer().createInventory(player, 27, this.getConfig().getString("kit2.Title"));
					Inventory inv2con = InventoryIO.StringToInventory(this.getConfig().getString("kit2.Inv"));
					inv2.setContents(inv2con.getContents());
					player.openInventory(inv2);
				}
				if(args[1].equalsIgnoreCase("kit3")){
					inv3 = getServer().createInventory(player, 27, this.getConfig().getString("kit3.Title"));
					Inventory inv3con = InventoryIO.StringToInventory(this.getConfig().getString("kit3.Inv"));
					inv3.setContents(inv3con.getContents());
					player.openInventory(inv3);
				}
				if(args[1].equalsIgnoreCase("kit4")){
					inv4 = getServer().createInventory(player, 27, this.getConfig().getString("kit4.Title"));
					Inventory inv4con = InventoryIO.StringToInventory(this.getConfig().getString("kit4.Inv"));
					inv4.setContents(inv4con.getContents());
					player.openInventory(inv4);
				}
				if(args[1].equalsIgnoreCase("kit5")){
					inv5 = getServer().createInventory(player, 27, this.getConfig().getString("kit5.Title"));
					Inventory inv5con = InventoryIO.StringToInventory(this.getConfig().getString("kit5.Inv"));
					inv5.setContents(inv5con.getContents());
					player.openInventory(inv5);
				}
				if(args[1].equalsIgnoreCase("kit6")){
					inv6 = getServer().createInventory(player, 27, this.getConfig().getString("kit6.Title"));
					Inventory inv6con = InventoryIO.StringToInventory(this.getConfig().getString("kit6.Inv"));
					inv6.setContents(inv6con.getContents());
					player.openInventory(inv6);
				}
				if(args[1].equalsIgnoreCase("kit7")){
					inv7 = getServer().createInventory(player, 27, this.getConfig().getString("kit7.Title"));
					Inventory inv7con = InventoryIO.StringToInventory(this.getConfig().getString("kit7.Inv"));
					inv7.setContents(inv7con.getContents());
					player.openInventory(inv7);
				}
				if(args[1].equalsIgnoreCase("kit8")){
					inv8 = getServer().createInventory(player, 27, this.getConfig().getString("kit8.Title"));
					Inventory inv8con = InventoryIO.StringToInventory(this.getConfig().getString("kit8.Inv"));
					inv8.setContents(inv8con.getContents());
					player.openInventory(inv8);
				}
				if(args[1].equalsIgnoreCase("kit9")){
					inv9 = getServer().createInventory(player, 27, this.getConfig().getString("kit9.Title"));
					Inventory inv9con = InventoryIO.StringToInventory(this.getConfig().getString("kit9.Inv"));
					inv9.setContents(inv9con.getContents());
					player.openInventory(inv9);
				}
			}
			}
			
			if(player.hasPermission("kgui.cmd.title")){
			if(args.length >= 3 && args[0].equalsIgnoreCase("title")){
				
				StringBuilder sb = new StringBuilder();
				for (int i = 2; i < args.length; i++){
				sb.append(args[i]).append(" ");
				}
				 
				String allArgs = ChatColor.BOLD + sb.toString().trim();
				
				if(args[1].equalsIgnoreCase("kit1")){
					this.getConfig().set("kit1.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit2")){
					this.getConfig().set("kit2.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit3")){
					this.getConfig().set("kit3.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit4")){
					this.getConfig().set("kit4.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit5")){
					this.getConfig().set("kit5.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit6")){
					this.getConfig().set("kit6.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit7")){
					this.getConfig().set("kit7.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit8")){
					this.getConfig().set("kit8.Title", allArgs);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit9")){
					this.getConfig().set("kit9.Title", allArgs);
					this.saveConfig();
				}
				
			}
			}
			if(player.hasPermission("kgui.cmd.item")){
			if(args.length >= 1 && args[0].equalsIgnoreCase("item")){
				String ar2 = args[2].toUpperCase();
					if(Material.matchMaterial(ar2) != null) {
				if(args[1].equalsIgnoreCase("kit1")){
					this.getConfig().set("kit1.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit2")){
					this.getConfig().set("kit2.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit3")){
					this.getConfig().set("kit3.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit4")){
					this.getConfig().set("kit4.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit5")){
					this.getConfig().set("kit5.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit6")){
					this.getConfig().set("kit6.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit7")){
					this.getConfig().set("kit7.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit8")){
					this.getConfig().set("kit8.Item", ar2);
					this.saveConfig();
				}
				if(args[1].equalsIgnoreCase("kit9")){
					this.getConfig().set("kit9.Item", ar2);
					this.saveConfig();
				}
				}else{
					f.sendMessage(player, "That isn't a valid item.");
					}
			}
			}

			if(player.hasPermission("kgui.cmd.getKit")){
			if(args.length == 0){
			//Add lore to list
				
			loreList.clear();
			loreList.add("The Kits book.");
			
			//Set books meta
			ItemMeta ppBookMeta = ppBook.getItemMeta();
			ppBookMeta.setLore(loreList);
			ppBookMeta.setDisplayName(ChatColor.AQUA+"Kits");
			ppBook.setItemMeta(ppBookMeta);
			
			//Add book to inventory
			player.getInventory().addItem(ppBook);
			}
			}
		}
		return false;
	}

}
