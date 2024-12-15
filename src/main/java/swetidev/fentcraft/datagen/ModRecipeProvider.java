package swetidev.fentcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import swetidev.fentcraft.block.ModBlocks;
import swetidev.fentcraft.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, ModItems.FENTANYL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FENT_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMPTY_NEEDLE)//empty needle
                .pattern(" N ")
                .pattern(" G ")
                .input('N', Items.IRON_NUGGET)//iron nugget
                .input('G',Items.GLASS)//glass
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .criterion(hasItem(Items.IRON_NUGGET),conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.OPIUM_SEEDS, 2).input(ModItems.OPIUM)//opium seeds
                .criterion(hasItem(ModItems.OPIUM),conditionsFromItem(ModItems.OPIUM))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.XYLAZINE, 2)//xylazine 2 sztuki
                .pattern("B  ")
                .pattern("SR ")
                .pattern("F  ")
                .input('B', Items.BLAZE_POWDER)
                .input('S', Items.SUGAR)
                .input('R', Items.REDSTONE)
                .input('F', Items.FERMENTED_SPIDER_EYE)
                .criterion(hasItem(Items.BLAZE_POWDER),conditionsFromItem(Items.BLAZE_POWDER))
                .criterion(hasItem(Items.SUGAR),conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(Items.REDSTONE),conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.FERMENTED_SPIDER_EYE),conditionsFromItem(Items.FERMENTED_SPIDER_EYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPIUM_NEEDLE, 1)
                .pattern("OEX")
                .input('O', ModItems.OPIUM)
                .input('E', ModItems.EMPTY_NEEDLE)
                .input('X', ModItems.XYLAZINE)
                .criterion(hasItem(ModItems.OPIUM),conditionsFromItem(ModItems.OPIUM))
                .criterion(hasItem(ModItems.EMPTY_NEEDLE),conditionsFromItem(ModItems.EMPTY_NEEDLE))
                .criterion(hasItem(ModItems.XYLAZINE),conditionsFromItem(ModItems.XYLAZINE))
                .offerTo(exporter);


    }
}
