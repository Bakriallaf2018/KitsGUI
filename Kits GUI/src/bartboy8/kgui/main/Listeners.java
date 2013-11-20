package bartboy8.kgui.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {

	Main plugin;
	public Listeners(Main plugin){
		this.plugin = plugin;
	}
	
	Inventory inv1;
	Inventory inv2;
	Inventory inv3;
	Inventory inv4;
	Inventory inv5;
	Inventory inv6;
	Inventory inv7;
	Inventory inv8;
	Inventory inv9;
	
	Functions f = new Functions(plugin);
	int i = 0;
	
	//Inventory's
	Inventory ptInv;
	Inventory pIntenseInv;
	
	//Open ptInv Item Name
	String ppBookName = ChatColor.AQUA+"PotionPusher";
	
	//Potion Type String
	String ptName;
	
	@EventHandler
	public void InvClickEvent(InventoryClickEvent event){
		Player player = (Player) event.getWhoClicked();
		
		if(event.getInventory().getTitle() == "Select a Kit:"){
		if(event.getSlot() == 0 && player.hasPermission("kgui.kit1")){
			inv1 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit1.Title"));
			Inventory inv1con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit1.Inv"));
			inv1.setContents(inv1con.getContents());
			player.openInventory(inv1);
		}
		if(event.getSlot() == 19 && player.hasPermission("kgui.kit2")){
			inv2 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit2.Title"));
			Inventory inv2con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit2.Inv"));
			inv2.setContents(inv2con.getContents());
			player.openInventory(inv2);
		}
		if(event.getSlot() == 2 && player.hasPermission("kgui.kit3")){
			inv3 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit3.Title"));
			Inventory inv3con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit3.Inv"));
			inv3.setContents(inv3con.getContents());
			player.openInventory(inv3);
		}
		if(event.getSlot() == 21 && player.hasPermission("kgui.kit4")){
			inv4 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit4.Title"));
			Inventory inv4con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit4.Inv"));
			inv4.setContents(inv4con.getContents());
			player.openInventory(inv4);
		}
		if(event.getSlot() == 4 && player.hasPermission("kgui.kit5")){
			inv5 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit5.Title"));
			Inventory inv5con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit5.Inv"));
			inv5.setContents(inv5con.getContents());
			player.openInventory(inv5);
		}
		if(event.getSlot() == 23 && player.hasPermission("kgui.kit6")){
			inv6 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit6.Title"));
			Inventory inv6con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit6.Inv"));
			inv6.setContents(inv6con.getContents());
			player.openInventory(inv6);
		}
		if(event.getSlot() == 6 && player.hasPermission("kgui.kit7")){
			inv7 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit7.Title"));
			Inventory inv7con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit7.Inv"));
			inv7.setContents(inv7con.getContents());
			player.openInventory(inv7);
		}
		if(event.getSlot() == 25 && player.hasPermission("kgui.kit8")){
			inv8 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit8.Title"));
			Inventory inv8con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit8.Inv"));
			inv8.setContents(inv8con.getContents());
			player.openInventory(inv8);
		}
		if(event.getSlot() == 8 && player.hasPermission("kgui.kit9")){
			inv9 = plugin.getServer().createInventory(player, 27, plugin.getConfig().getString("kit9.Title"));
			Inventory inv9con = InventoryIO.StringToInventory(plugin.getConfig().getString("kit9.Inv"));
			inv9.setContents(inv9con.getContents());
			player.openInventory(inv9);
		}
		event.setCancelled(true);
		}
	}
		
		
	@EventHandler
	public void RightClickBook(PlayerInteractEvent event){
		Player player = event.getPlayer();
		
		//Players Item in Hand
		ItemStack inHand = player.getItemInHand();
		
		if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
		if(player.getItemInHand().getType() == Material.ENCHANTED_BOOK){
		if(!(inHand.getItemMeta().getLore() == null)){
			ptInv = plugin.getServer().createInventory(null, 27, "Select a Kit:");
			
			//Adding kit1
			if(player.hasPermission("kgui.kit1")){
			f.addItem(plugin.getConfig().getString("kit1.Title"), 0, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit1.Item").toUpperCase()),1));
			}
			
			//Adding kit2
			if(player.hasPermission("kgui.kit2")){
			f.addItem(plugin.getConfig().getString("kit2.Title"), 19, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit2.Item").toUpperCase()),1));
			}
			
			//Adding kit3
			if(player.hasPermission("kgui.kit3")){
			f.addItem(plugin.getConfig().getString("kit3.Title"), 2, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit3.Item").toUpperCase()),1));
			}
			
			//Adding kit4
			if(player.hasPermission("kgui.kit4")){
			f.addItem(plugin.getConfig().getString("kit4.Title"), 21, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit4.Item").toUpperCase()),1));
			}
			
			//Adding kit5
			if(player.hasPermission("kgui.kit5")){
			f.addItem(plugin.getConfig().getString("kit5.Title"), 4, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit5.Item").toUpperCase()),1));
			}
			
			//Adding kit6
			if(player.hasPermission("kgui.kit6")){
			f.addItem(plugin.getConfig().getString("kit6.Title"), 23, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit6.Item").toUpperCase()),1));
			}
			
			//Adding kit7
			if(player.hasPermission("kgui.kit7")){
			f.addItem(plugin.getConfig().getString("kit7.Title"), 6, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit7.Item").toUpperCase()),1));
			}
			
			//Adding kit8
			if(player.hasPermission("kgui.kit8")){
			f.addItem(plugin.getConfig().getString("kit8.Title"), 25, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit8.Item").toUpperCase()),1));
			}
			
			//Adding kit9
			if(player.hasPermission("kgui.kit9")){
			f.addItem(plugin.getConfig().getString("kit9.Title"), 8, ptInv, player, new ItemStack(Material.getMaterial(plugin.getConfig().getString("kit9.Item").toUpperCase()),1));
			}
			
			player.openInventory(ptInv);
		}
		}
		}
	}

	
	@EventHandler
	public void InvClose(InventoryCloseEvent event){
		if(event.getInventory().getTitle() == "Just a Test:"){
			
		}
		if(event.getInventory().getTitle() == plugin.getConfig().getString("kit1.Title")){
			plugin.getConfig().set("kit1.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit2.Title")){
			plugin.getConfig().set("kit2.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit3.Title")){
			plugin.getConfig().set("kit3.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit4.Title")){
			plugin.getConfig().set("kit4.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit5.Title")){
			plugin.getConfig().set("kit5.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit6.Title")){
			plugin.getConfig().set("kit6.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit7.Title")){
			plugin.getConfig().set("kit7.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit8.Title")){
			plugin.getConfig().set("kit8.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
			
		}else if(event.getInventory().getTitle() == plugin.getConfig().getString("kit9.Title")){
			plugin.getConfig().set("kit9.Inv", InventoryIO.InventoryToString(event.getInventory()));
			plugin.saveConfig();
		}
	}

}
