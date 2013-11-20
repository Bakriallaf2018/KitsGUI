package bartboy8.kgui.main;

import java.util.ArrayList;

import net.minecraft.server.v1_6_R2.NBTTagCompound;
import net.minecraft.server.v1_6_R2.NBTTagList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_6_R2.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Functions {

	Main plugin;
	public Functions(Main plugin){
		this.plugin = plugin;
	}
	
	public void sendMessage(Player player, String message)
	{
		player.sendMessage(ChatColor.LIGHT_PURPLE+"[Kits] "+ChatColor.AQUA+message);
	}
	
	public void sendMultilineMessage(Player player, String message){
		    String[] s = message.split("\n");
		    for (String m : s){
		      player.sendMessage(m);
		    }
		}
	
	public boolean isValidMaterial(String name){
		boolean x = false;
		for(Material m : Material.values()){
			if(!(m.toString().contains(name))){
	                x = false;
	            }else{
	            	x = true;
	            }
	    }
	        return x;
	}
	
	public void addItem(String itemTitle, int slotNumber, Inventory inv, Player player, ItemStack item){
		ItemStack i = new ItemStack(item);
		ItemMeta im = i.getItemMeta();
		im.setDisplayName(itemTitle);
		i.setItemMeta(im);
		i = addGlow(i);
		inv.setItem(slotNumber,i);
	}
	
    public static ItemStack addGlow(ItemStack item) {
        net.minecraft.server.v1_6_R2.ItemStack nmsStack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = null;
        if (!nmsStack.hasTag()) {
            tag = new NBTTagCompound();
            nmsStack.setTag(tag);
        }
        if (tag == null) tag = nmsStack.getTag();
        NBTTagList ench = new NBTTagList();
        tag.set("ench", ench);
        nmsStack.setTag(tag);
        return CraftItemStack.asCraftMirror(nmsStack);
    }
    
	@SuppressWarnings("deprecation")
	public void updateI(int i, Player player)
	{
		if(i < 0){
			i = 0;
		}
		if(i > 10){
			i = 10;
		}
		
		player.updateInventory();
	}
	
	public void setIntensityBookLore(ItemStack is, ItemMeta im, String lore, Inventory i){
		ArrayList<String> al = new ArrayList<String>();
		al.add(lore);
		im.setLore(al);
		is.setItemMeta(im);
	}
	
}
