package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final Map<WoodType, Block> crafting_tables = new HashMap<>();
    public static final Map<WoodType, Block> bookshelves = new HashMap<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        for(WoodType type : WoodType.values())
        {
            crafting_tables.put(type, new CraftingTableBlock(Block.Properties.from(Blocks.CRAFTING_TABLE)).setRegistryName(Woodstyles.MOD_ID, type + "_crafting_table"));
            bookshelves.put(type, new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)).setRegistryName(Woodstyles.MOD_ID, type + "_bookshelf"));
        }

        event.getRegistry().registerAll(crafting_tables.values().toArray(new Block[crafting_tables.size()]));
        event.getRegistry().registerAll(bookshelves.values().toArray(new Block[bookshelves.size()]));
    }
}
