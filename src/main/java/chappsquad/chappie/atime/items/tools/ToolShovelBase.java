package chappsquad.chappie.atime.items.tools;

import chappsquad.chappie.atime.Atime;
import chappsquad.chappie.atime.init.ItemInit;
import chappsquad.chappie.atime.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovelBase extends ItemSpade implements IHasModel
{
	public ToolShovelBase(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
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
