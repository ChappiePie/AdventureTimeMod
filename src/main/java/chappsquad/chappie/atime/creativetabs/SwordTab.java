package chappsquad.chappie.atime.creativetabs;

import chappsquad.chappie.atime.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SwordTab extends CreativeTabs
{
	public SwordTab() 
	{
		super("swordtab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SCARLET_SWORD);//ItemInit.COPPER_INGOT);
	}
}
