package net.ratking.mlw.util;

import net.ratking.mlw.MacLaveWorld;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(MacLaveWorld.MOD_ID + ":pine", BlockSetType.OAK));
}
