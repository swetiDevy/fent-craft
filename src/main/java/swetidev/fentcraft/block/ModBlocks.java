package swetidev.fentcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import swetidev.fentcraft.FentCraft;
import swetidev.fentcraft.block.custom.OpiumCropBlock;

public class ModBlocks {

    public static final Block FENT_BLOCK = registerBlock("fent_block",new Block(AbstractBlock.Settings.create()
            .strength(3f)
            //.requiresTool()
            .sounds(BlockSoundGroup.SNOW)));

    public static final Block OPIUM_CROP = registerBlockWithoutBlockItem("opium_crop",new OpiumCropBlock(AbstractBlock.Settings.create()
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.CROP)
            .pistonBehavior(PistonBehavior.DESTROY)
            .mapColor(MapColor.DARK_GREEN)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FentCraft.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(FentCraft.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(FentCraft.MOD_ID, name), new BlockItem(block, new Item.Settings()) );
    }


    public static void registerModBlocks(){
        FentCraft.LOGGER.info("Registering Mod blocks for " + FentCraft.MOD_ID);
    }
}
