package swetidev.fentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import swetidev.fentcraft.FentCraft;



public class ModItems {

    public static final Item FENTANYL = registerItem("fentanyl", new Item(new Item.Settings()));
    public static final Item EMPTY_NEEDLE = registerItem("empty_needle", new Item(new Item.Settings()));
    public static final Item TRANQ_NEEDLE = registerItem("tranq_needle", new Item(new Item.Settings()));
    public static final Item XYLAZINE = registerItem("xylazine", new Item(new Item.Settings()));


    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FentCraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FentCraft.LOGGER.info("Registering Mod items for " + FentCraft.MOD_ID);

       /* ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FENTANYL );
            entries.add(EMPTY_NEEDLE);
            entries.add(TRANQ_NEEDLE);
            entries.add(XYLAZINE);
        });*/
    }
}
