package sguest.woodstyles.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sguest.woodstyles.WoodType;
import sguest.woodstyles.Woodstyles;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final Map<WoodType, Block> crafting_tables = new HashMap<>();
    public static final Map<WoodType, Block> bookshelves = new HashMap<>();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        registerBlockType(crafting_tables, () -> new CraftingTableBlock(Block.Properties.from(Blocks.CRAFTING_TABLE)), "crafting_table", event);
        registerBlockType(bookshelves, () -> new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF)), "bookshelf", event);
    }

    private static void registerBlockType(Map<WoodType, Block> map, Supplier<Block> blockGenerator, String baseName, RegistryEvent.Register<Block> event)
    {
        for(WoodType type: WoodType.values())
        {
            map.put(type, blockGenerator.get().setRegistryName(Woodstyles.MOD_ID, type + "_" + baseName));
        }

        event.getRegistry().registerAll(map.values().toArray(new Block[map.size()]));
    }
}
