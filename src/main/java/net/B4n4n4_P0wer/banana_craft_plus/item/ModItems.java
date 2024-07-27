package net.B4n4n4_P0wer.banana_craft_plus.item;

import net.B4n4n4_P0wer.banana_craft_plus.BananaCraftPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BananaCraftPlus.MOD_ID);

    public static final RegistryObject<Item> FATHER_STRETCH_MY_HANDS  = ITEMS.register("father_stretch_my_hands",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
