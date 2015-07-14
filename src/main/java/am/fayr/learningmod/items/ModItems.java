package am.fayr.learningmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by kirindave on 7/13/15.
 */
public final class ModItems {
    public static Item basicItem;
    public static void createItems() {
        basicItem = new Item();
        basicItem.setUnlocalizedName("does this work");

        GameRegistry.registerItem(basicItem, "tutorial_item");
    }
}
