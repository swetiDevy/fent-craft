package swetidev.fentcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import swetidev.fentcraft.block.ModBlocks;
import swetidev.fentcraft.block.custom.OpiumCropBlock;
import swetidev.fentcraft.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //gona drop it self
        addDrop(ModBlocks.FENT_BLOCK);

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.OPIUM_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(OpiumCropBlock.AGE, OpiumCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.OPIUM_CROP, this.cropDrops(ModBlocks.OPIUM_CROP, ModItems.RAW_OPIUM, ModItems.OPIUM_SEEDS, builder2));
    }
}
