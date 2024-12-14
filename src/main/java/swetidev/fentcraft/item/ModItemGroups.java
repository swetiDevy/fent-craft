package swetidev.fentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import swetidev.fentcraft.FentCraft;
import swetidev.fentcraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup OPIOIDS_AND_OTHER_PSYCHEDELIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FentCraft.MOD_ID,"opioids_and_other_psychedelic"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FENTANYL))
                    .displayName(Text.translatable("itemgroup.fentcraft.opioids_and_other_psychedelic"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FENTANYL);
                        entries.add(ModItems.EMPTY_NEEDLE);
                        entries.add(ModItems.TRANQ_NEEDLE);
                        entries.add(ModItems.XYLAZINE);
                        entries.add(ModBlocks.FENT_BLOCK);
                    }).build());


    public static void registerItemGroups(){
        FentCraft.LOGGER.info("registracja itemy grupa dla "+ FentCraft.MOD_ID);
    }
}
