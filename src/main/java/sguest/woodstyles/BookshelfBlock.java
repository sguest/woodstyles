package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BookshelfBlock extends Block {
    public BookshelfBlock(Properties properties) {
        super(properties);
    }

    public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
        return 1.0F;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
