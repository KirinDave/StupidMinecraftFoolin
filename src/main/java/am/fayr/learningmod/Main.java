package am.fayr.learningmod;

        import am.fayr.learningmod.items.ModItems;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.Mod.EventHandler;
        import net.minecraftforge.fml.common.Mod.Instance;
        import net.minecraftforge.fml.common.SidedProxy;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "tutorial";
    public static final String MODNAME = "Tutorial Mod";
    public static final String VERSION = "1.0.0";

    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide="am.fayr.learningmod.ClientProxy", serverSide="am.fayr.learningmod.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("KD: preInit");
        ModItems.createItems();
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("KD: init");
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("KD: postInit");
        this.proxy.postInit(e);
    }
}