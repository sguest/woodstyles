package sguest.woodstyles;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final Map<WoodType, Item> crafting_tables = new HashMap<>();
    public static final Map<WoodType, Item> bookshelves = new HashMap<>();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        for(WoodType type : WoodType.values()) {
            crafting_tables.put(type, new BlockItem(ModBlocks.crafting_tables.get(type), new Item.Properties()).setRegistryName(Woodstyles.MOD_ID, type + "_crafting_table"));
            bookshelves.put(type, new BlockItem(ModBlocks.bookshelves.get(type), new Item.Properties()).setRegistryName(Woodstyles.MOD_ID, type + "_bookshelf"));
        }

        event.getRegistry().registerAll(crafting_tables.values().toArray(new Item[crafting_tables.size()]));
        event.getRegistry().registerAll(bookshelves.values().toArray(new Item[bookshelves.size()]));
    }
}
