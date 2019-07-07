package sguest.woodstyles;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Woodstyles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Woodstyles.MOD_ID)
public class ModItems {
    public static final Item acacia_crafting_table = null;
    public static final Item birch_crafting_table = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
            new BlockItem(ModBlocks.acacia_crafting_table, new Item.Properties()).setRegistryName(Woodstyles.MOD_ID, "acacia_crafting_table"),
            new BlockItem(ModBlocks.birch_crafting_table, new Item.Properties()).setRegistryName(Woodstyles.MOD_ID, "birch_crafting_table")
        );
    }
}
