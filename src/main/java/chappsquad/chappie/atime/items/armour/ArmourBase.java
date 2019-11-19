package chappsquad.chappie.atime.items.armour;

import chappsquad.chappie.atime.Atime;
import chappsquad.chappie.atime.init.ItemInit;
import chappsquad.chappie.atime.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel
{
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Atime.TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Atime.proxy.registerModel(this, 0);
	}
}
