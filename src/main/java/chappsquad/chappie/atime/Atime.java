package chappsquad.chappie.atime;

import java.io.File;

import chappsquad.chappie.atime.creativetabs.SwordTab;
import chappsquad.chappie.atime.proxy.CommonProxy;
import chappsquad.chappie.atime.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Atime.MODID, name = Atime.MODNAME, version = Atime.VERSION)
public class Atime 
{
	
	public static final String MODID = "atime";
	public static final String MODNAME = "Adventure Time Mod";
	public static final String VERSION = "1.12.2";
	
	public static final String CLIENT = "chappsquad.chappie.atime.proxy.ClientProxy";
	public static final String SERVER = "chappsquad.chappie.atime.proxy.CommonProxy";
	
	@Instance
	public static Atime instance;
	
	@SidedProxy(clientSide = Atime.CLIENT, serverSide = Atime.SERVER)
	public static CommonProxy proxy;
	
	public static final CreativeTabs TAB = new SwordTab();
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{	
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
