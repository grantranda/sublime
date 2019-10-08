package gr.sublime.init;

import gr.sublime.tileentity.TileEntityNiobiumChest;
import gr.sublime.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {

    public static void register() {
        GameRegistry.registerTileEntity(TileEntityNiobiumChest.class, Reference.ID + ":niobium_chest");
    }
}
