package net.toxicgold180.many_soils.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.MyceliumBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.toxicgold180.many_soils.ManySoils;
import net.toxicgold180.many_soils.sound.ModBlockSoundGroup;

public class ModBlocks {
    public static final Block MYCELIUM_STONE = registerBlock(
            "mycelium_stone",
            new MyceliumBlock(
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .mapColor(MapColor.PURPLE)
                            .ticksRandomly()
                            .strength(1.6F, 6.1F)
                            .sounds(ModBlockSoundGroup.GRASSY_STONE)
            )
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ManySoils.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ManySoils.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ManySoils.LOGGER.info("Registering Mod Blocks for " + ManySoils.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.MYCELIUM_STONE);
        });
    }
}
