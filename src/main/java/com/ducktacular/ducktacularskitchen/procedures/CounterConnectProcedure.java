package com.ducktacular.ducktacularskitchen.procedures;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CounterConnectProcedure {
    public static final TagKey<Block> counterTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("ducktacularskitchen", "counters"));
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(counterTag)) {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("east") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x + 1, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("west") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
        } else {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("east") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x + 1, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("west") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
        }
        if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(counterTag)) {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("west") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x - 1, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("east") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
        } else {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("west") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x - 1, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("east") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
        }
        if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(counterTag)) {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("south") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x, y, z + 1);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("north") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
        } else {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("south") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x, y, z + 1);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("north") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
        }
        if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(counterTag)) {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("north") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x, y, z - 1);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("south") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
            }
        } else {
            {
                BlockPos _pos = BlockPos.containing(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("north") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
            {
                BlockPos _pos = BlockPos.containing(x, y, z - 1);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("south") instanceof BooleanProperty _booleanProp)
                    world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
            }
        }
    }
}
