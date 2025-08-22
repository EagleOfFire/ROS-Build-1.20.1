package fr.wasstyle.riseofshinobi.buildermod.item;

import fr.wasstyle.riseofshinobi.buildermod.ROSBuilder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ROSBuilder.MODID);

    public static final RegistryObject<Item> ROS_LOGO = ITEMS.register("ros_logo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
