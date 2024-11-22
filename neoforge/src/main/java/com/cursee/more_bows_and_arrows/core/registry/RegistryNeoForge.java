package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class RegistryNeoForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModArrowItemsNeoForge.register();
        ModBowItemsNeoForge.register();
        ModEntityTypesNeoForge.register();
        ModTabsNeoForge.register();

        ITEMS.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    protected static <T extends Item> DeferredHolder<Item, T> registerItem(String itemID, Supplier<T> itemSupplier) {
        return ITEMS.register(itemID, itemSupplier);
    }

    protected static <T extends EntityType<?>> DeferredHolder<EntityType<?>, T> registerEntityType(String entityTypeID, Supplier<T> entityTypeSupplier) {
        return ENTITY_TYPES.register(entityTypeID, entityTypeSupplier);
    }

    protected static <T extends CreativeModeTab> DeferredHolder<CreativeModeTab, T> registerTab(String tabID, Supplier<T> tabSupplier) {
        return CREATIVE_MODE_TABS.register(tabID, tabSupplier);
    }
}
