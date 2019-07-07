package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CraftingTableBlock extends net.minecraft.block.CraftingTableBlock {
    private static final ITextComponent title = new TranslationTextComponent("container.crafting", new Object[0]);

    public CraftingTableBlock(Properties properties) {
        super(properties);
    }

    public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
        return new SimpleNamedContainerProvider((var1, playerInventory, playerEntity) -> {
            return new WorkbenchContainer(var1, playerInventory, IWorldPosCallable.of(worldIn, pos), this);
        }, this.title);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
