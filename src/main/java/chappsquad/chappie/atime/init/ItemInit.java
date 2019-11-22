package chappsquad.chappie.atime.init;

import java.util.ArrayList;
import java.util.List;

import chappsquad.chappie.atime.Atime;
import chappsquad.chappie.atime.items.tools.ToolSwordBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
			
	//Armour Materials
	//public static final ArmorMaterial CUSTOM_MODEL_MATERIAL = EnumHelper.addArmorMaterial("custom_model", Reference.MODID + ":custom_model", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
	
	//Tool Materials
	//public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 2, 400, 3.0f, 5.0f, 20);
	public static final ToolMaterial SCARLET_TOOL = EnumHelper.addToolMaterial("scarlet_tool", 2, 400, 3.0f, 5.0f, 20);
	public static final ToolMaterial FINN_TOOL = EnumHelper.addToolMaterial("finn_tool", 2, 800, 3.0f, 8.0f, 20);
	public static final ToolMaterial DEMONIC_TOOL = EnumHelper.addToolMaterial("demonic_tool", 2, 1000, 3.0f, 12.0f, 20);
	//Items
	//public static final Item COPPER_INGOT = new ItemBase("copper_ingot", Main.TUTORIAL);
	
	//Armour
	 //public static final Item CUSTOM_HELMET = new ArmourModel("custom_helmet", Main.TUTORIAL, CUSTOM_MODEL_MATERIAL, EntityEquipmentSlot.HEAD);
	 //public static final Item CUSTOM_CHESTPLATE = new ArmourModel("custom_chestplate", Main.TUTORIAL, CUSTOM_MODEL_MATERIAL, EntityEquipmentSlot.CHEST);
	 //public static final Item CUSTOM_LEGGINGS = new ArmourModel("custom_leggings", Main.TUTORIAL, CUSTOM_MODEL_MATERIAL, EntityEquipmentSlot.LEGS);
	 //public static final Item CUSTOM_BOOTS = new ArmourModel("custom_boots", Main.TUTORIAL, CUSTOM_MODEL_MATERIAL, EntityEquipmentSlot.FEET);
	
	//Tools
	//public static final Item COPPER_AXE = new ToolAxeBase("copper_axe", COPPER_TOOL, Main.TUTORIAL);
	//public static final Item COPPER_HOE = new ToolHoeBase("copper_hoe", COPPER_TOOL, Main.TUTORIAL);
	//public static final Item COPPER_PICKAXE = new ToolPickaxeBase("copper_pickaxe", COPPER_TOOL, Main.TUTORIAL);
	//public static final Item COPPER_SHOVEL = new ToolShovelBase("copper_shovel", COPPER_TOOL, Main.TUTORIAL);
	public static final Item SCARLET_SWORD = new ToolSwordBase("scarlet_sword", SCARLET_TOOL, Atime.TAB);
	public static final Item FINN_SWORD = new ToolSwordBase("finn_sword", FINN_TOOL, Atime.TAB);
	public static final Item DEMONIC_SWORD = new ToolSwordBase("demonic_sword", DEMONIC_TOOL, Atime.TAB);


}
