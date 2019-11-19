package chappsquad.chappie.atime.creativetabs;

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
		return new ItemStack(Items.GOLDEN_SWORD);//ItemInit.COPPER_INGOT);
	}
}
