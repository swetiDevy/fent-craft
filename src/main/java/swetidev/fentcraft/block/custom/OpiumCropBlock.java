package swetidev.fentcraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import swetidev.fentcraft.item.ModItems;

public class OpiumCropBlock extends CropBlock {
    public static final int MAX_AGE = 6;
    public static final IntProperty AGE = IntProperty.of("age", 0,6);

    public OpiumCropBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.OPIUM_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
       builder.add(AGE);
    }
}
