package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.IWorldPosCallable;

public class WorkbenchContainer extends net.minecraft.inventory.container.WorkbenchContainer {
    private final IWorldPosCallable world_pos;
    private final Block block_type;

    public WorkbenchContainer(int var1, PlayerInventory inventory, Block blockType) {
        this(var1, inventory, IWorldPosCallable.DUMMY, blockType);
    }

    public WorkbenchContainer(int var1, PlayerInventory inventory, IWorldPosCallable worldPos, Block block_type) {
        super(var1, inventory, worldPos);

        this.world_pos = worldPos;
        this.block_type = block_type;
    }

    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(this.world_pos, playerIn, this.block_type);
    }
}
