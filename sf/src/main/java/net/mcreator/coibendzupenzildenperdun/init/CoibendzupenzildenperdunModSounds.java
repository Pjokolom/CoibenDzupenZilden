/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coibendzupenzildenperdun.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.coibendzupenzildenperdun.CoibendzupenzildenperdunMod;

public class CoibendzupenzildenperdunModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CoibendzupenzildenperdunMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC1 = REGISTRY.register("music1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coibendzupenzildenperdun", "music1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOUND1 = REGISTRY.register("sound1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coibendzupenzildenperdun", "sound1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOUND2 = REGISTRY.register("sound2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coibendzupenzildenperdun", "sound2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOUND3 = REGISTRY.register("sound3", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coibendzupenzildenperdun", "sound3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOUND4 = REGISTRY.register("sound4", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coibendzupenzildenperdun", "sound4")));
}