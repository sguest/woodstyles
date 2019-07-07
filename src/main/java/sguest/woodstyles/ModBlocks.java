package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Woodstyles.MOD_ID)
public class ModBlocks {
    public static final Block acacia_crafting_table = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
            new CraftingTableBlock(Block.Properties.from(Blocks.CRAFTING_TABLE)).setRegistryName(Woodstyles.MOD_ID, "acacia_crafting_table")
        );
    }
}
