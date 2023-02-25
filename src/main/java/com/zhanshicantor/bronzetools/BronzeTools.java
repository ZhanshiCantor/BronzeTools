package com.zhanshicantor.bronzetools;

import com.zhanshicantor.bronzetools.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class BronzeTools implements ModInitializer {

    public static final String MOD_ID = "bronze";
    @Override
    public void onInitialize() {
        ModItems.registerItems();

    }
}
