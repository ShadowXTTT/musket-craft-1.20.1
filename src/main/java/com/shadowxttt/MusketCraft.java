package com.shadowxttt;

import com.shadowxttt.Item.FlintlockMusket;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MusketCraft implements ModInitializer {
	public static final String MODID = "musketcraft";
	public static final FlintlockMusket flintlock_musket = new FlintlockMusket(new FabricItemSettings().maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "flintlock_musket"), flintlock_musket);
	}
}