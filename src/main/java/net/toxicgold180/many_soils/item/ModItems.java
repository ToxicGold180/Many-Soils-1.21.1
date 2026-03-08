package net.toxicgold180.many_soils.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.toxicgold180.many_soils.ManySoils;
import java.util.function.Function;

public class ModItems {
    public static final Item TEST_ITEM = registerItem("test_item", Item::new);


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(ManySoils.MOD_ID, name),
        function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ManySoils.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ManySoils.LOGGER.info("Registering Mod Items for " + ManySoils.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TEST_ITEM);
        });
    }
}
