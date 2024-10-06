package net.ratking.mlw.worldgen.biome;

import net.ratking.mlw.MacLaveWorld;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(MacLaveWorld.MOD_ID, "overworld"), 5));
    }
}
