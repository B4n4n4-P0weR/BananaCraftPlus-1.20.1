package net.B4n4n4_P0wer.banana_craft_plus.item;

import net.B4n4n4_P0wer.banana_craft_plus.BananaCraftPlus;
//import net.B4n4n4_P0wer.banana_craft_plus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BananaCraftPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BANANA_CRAFT_PLUS_TUB = CREATIVE_MODE_TABS.register("banana_craft_plus_tub",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FATHER_STRETCH_MY_HANDS.get()))
                    .title(Component.translatable("creativetab.banana_craft_plus_tub"))
                    .displayItems((pParameters, pOutput) -> {

//                       pOutput.accept(ModItems.FATHER_STRETCH_MY_HANDS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
