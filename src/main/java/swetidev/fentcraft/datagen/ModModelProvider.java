package swetidev.fentcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import swetidev.fentcraft.block.ModBlocks;
import swetidev.fentcraft.block.custom.OpiumCropBlock;
import swetidev.fentcraft.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FENT_BLOCK);

        blockStateModelGenerator.registerCrop(ModBlocks.OPIUM_CROP, OpiumCropBlock.AGE, 0,1,2,3,4,5,6);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_FENTANYL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_OPIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_HEROIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.XYLAZINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_NEEDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRANQ_NEEDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPIUM_NEEDLE, Models.GENERATED);
    }
}
