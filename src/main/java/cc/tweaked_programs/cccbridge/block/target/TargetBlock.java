package cc.tweaked_programs.cccbridge.block.target;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

public class TargetBlock extends Block implements BlockEntityProvider {
    public TargetBlock() {
        super(FabricBlockSettings.of(Material.METAL).strength(2.8f).requiresTool().sounds(BlockSoundGroup.COPPER));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TargetBlockEntity(pos, state);
    }
}
