package chappsquad.chappie.atime.items;

import chappsquad.chappie.atime.Atime;
import chappsquad.chappie.atime.init.ItemInit;
import chappsquad.chappie.atime.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Atime.proxy.registerModel(this, 0);
	}
}
