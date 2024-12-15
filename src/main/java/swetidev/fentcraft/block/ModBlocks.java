package swetidev.fentcraft.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import swetidev.fentcraft.FentCraft;

public class ModBlocks {

    public static final Block FENT_BLOCK = registerBlock("fent_block",new Block(AbstractBlock.Settings.create()
            .strength(3f)
            //.requiresTool()
            .sounds(BlockSoundGroup.SNOW)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FentCraft.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(FentCraft.MOD_ID, name), new BlockItem(block, new Item.Settings()) );
    }


    public static void registerModBlocks(){
        FentCraft.LOGGER.info("Registering Mod blocks for " + FentCraft.MOD_ID);

      /*  ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.FENT_BLOCK);
        });*/
    }
}
