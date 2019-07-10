package sguest.woodstyles;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        registerItemType(ModBlocks.crafting_tables, "crafting_table", event);
        registerItemType(ModBlocks.bookshelves, "bookshelf", event);
    }

    private static void registerItemType(Map<WoodType, Block> blockMap, String baseName, RegistryEvent.Register<Item> event)
    {
        ArrayList<Item> items = new ArrayList<Item>();

        for(WoodType type: WoodType.values())
        {
            items.add(new BlockItem(blockMap.get(type), new Item.Properties()).setRegistryName(Woodstyles.MOD_ID, type + "_" + baseName));
        }

        event.getRegistry().registerAll(items.toArray(new Item[items.size()]));
    }

}
