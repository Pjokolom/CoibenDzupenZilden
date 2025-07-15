/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coibendzupenzildenperdun.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.coibendzupenzildenperdun.CoibendzupenzildenperdunMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CoibendzupenzildenperdunModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoibendzupenzildenperdunMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CoibendzupenzildenperdunModBlocks.COYBENITEMBLOCK.get().asItem());
		}
	}
}