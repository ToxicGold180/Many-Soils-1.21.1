package net.toxicgold180.many_soils.sound;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModBlockSoundGroup extends BlockSoundGroup {
    public ModBlockSoundGroup(float volume, float pitch, SoundEvent breakSound, SoundEvent stepSound, SoundEvent placeSound, SoundEvent hitSound, SoundEvent fallSound) {
        super(volume, pitch, breakSound, stepSound, placeSound, hitSound, fallSound);
    }

    public static final BlockSoundGroup GRASSY_STONE = new BlockSoundGroup(
            1.0F,
            1.0F,
            SoundEvents.BLOCK_STONE_BREAK,
            SoundEvents.BLOCK_GRASS_STEP,
            SoundEvents.BLOCK_STONE_PLACE,
            SoundEvents.BLOCK_STONE_HIT,
            SoundEvents.BLOCK_GRASS_FALL
    );
}
