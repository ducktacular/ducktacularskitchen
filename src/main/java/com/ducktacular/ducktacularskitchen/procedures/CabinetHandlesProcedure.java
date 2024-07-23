package com.ducktacular.ducktacularskitchen.procedures;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CabinetHandlesProcedure {
    public static final TagKey<Block> cabinetTag = BlockTags.create(ResourceLocation.fromNamespaceAndPath("ducktacularskitchen", "cabinets"));
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
            if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(cabinetTag)) {
                {
                    String _value = "right";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
            if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(cabinetTag)) {
                {
                    String _value = "left";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
        } else if ((new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
            if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(cabinetTag)) {
                {
                    String _value = "right";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
            if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(cabinetTag)) {
                {
                    String _value = "left";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
        } else if ((new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
            if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(cabinetTag)) {
                {
                    String _value = "right";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(cabinetTag)) {
                {
                    String _value = "left";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
        } else if ((new Object() {
            public Direction getDirection(BlockState _bs) {
                Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_prop instanceof DirectionProperty _dp)
                    return _bs.getValue(_dp);
                _prop = _bs.getBlock().getStateDefinition().getProperty("axis");
                return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
            if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(cabinetTag)) {
                {
                    String _value = "right";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
            if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(cabinetTag)) {
                {
                    String _value = "left";
                    BlockPos _pos = BlockPos.containing(x, y, z);
                    BlockState _bs = world.getBlockState(_pos);
                    if (_bs.getBlock().getStateDefinition().getProperty("hinge") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
                        world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
                }
            }
        }
    }
}
