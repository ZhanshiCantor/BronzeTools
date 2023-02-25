package com.zhanshicantor.bronzetools.registry;

import com.zhanshicantor.bronzetools.BronzeTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item BRONZE_PICKAXE = new Item(new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(BronzeTools.MOD_ID, "bronze_pickaxe"), BRONZE_PICKAXE);
    }
}
