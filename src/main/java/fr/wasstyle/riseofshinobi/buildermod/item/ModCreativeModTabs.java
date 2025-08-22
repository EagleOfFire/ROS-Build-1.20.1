package fr.wasstyle.riseofshinobi.buildermod.item;

import fr.wasstyle.riseofshinobi.buildermod.ROSBuilder;
import fr.wasstyle.riseofshinobi.buildermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ROSBuilder.MODID);

    public static final RegistryObject<CreativeModeTab> BUILDER_TAB = CREATIVE_MODE_TABS.register("builder_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROS_LOGO.get()))
                    .title(Component.translatable("creative.builder_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.SOUL_SOIL.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
