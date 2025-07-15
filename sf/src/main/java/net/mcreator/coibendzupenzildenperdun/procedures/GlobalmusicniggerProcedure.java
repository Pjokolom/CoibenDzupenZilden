package net.mcreator.coibendzupenzildenperdun.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GlobalmusicniggerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 1, 1000) <= 1 && Mth.nextDouble(RandomSource.create(), 1, 1000) >= 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound1")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound1")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Mth.nextDouble(RandomSource.create(), 1, 1000) <= 2 && Mth.nextDouble(RandomSource.create(), 1, 1000) >= 2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound2")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound2")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Mth.nextDouble(RandomSource.create(), 1, 1000) <= 3 && Mth.nextDouble(RandomSource.create(), 1, 1000) >= 3) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound3")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound3")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Mth.nextDouble(RandomSource.create(), 1, 1000) <= 4 && Mth.nextDouble(RandomSource.create(), 1, 1000) >= 4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound4")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("coibendzupenzildenperdun:sound4")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}