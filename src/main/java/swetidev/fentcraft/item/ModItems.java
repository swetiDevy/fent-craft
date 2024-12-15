package swetidev.fentcraft.item;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import swetidev.fentcraft.FentCraft;
import swetidev.fentcraft.block.ModBlocks;


public class ModItems {

    public static final Item RAW_FENTANYL = registerItem("raw_fentanyl", new Item(new Item.Settings().food(ModFoodComponents.RAW_FENTANYL)));
    public static final Item RAW_HEROIN = registerItem("raw_heroin", new Item(new Item.Settings().food(ModFoodComponents.RAW_HEROIN)));
    public static final Item OPIUM_NEEDLE = registerItem("opium_needle", new Item(new Item.Settings().food(ModFoodComponents.OPIUM_NEEDLE)));
    public static final Item EMPTY_NEEDLE = registerItem("empty_needle", new Item(new Item.Settings()));
    public static final Item TRANQ_NEEDLE = registerItem("tranq_needle", new Item(new Item.Settings()));
    public static final Item XYLAZINE = registerItem("xylazine", new Item(new Item.Settings()));
    public static final Item RAW_OPIUM = registerItem("raw_opium", new Item(new Item.Settings()));
    public static final Item OPIUM_SEEDS = registerItem("opium_seeds",
            new AliasedBlockItem(ModBlocks.OPIUM_CROP,new Item.Settings()) );


    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FentCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FentCraft.LOGGER.info("Registering Mod items for " + FentCraft.MOD_ID);
    }
}
