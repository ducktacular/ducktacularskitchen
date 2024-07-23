package com.ducktacular.ducktacularskitchen.block;

import com.ducktacular.ducktacularskitchen.procedures.CounterConnectProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Drawer extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty EAST = BlockStateProperties.EAST;
    public static final BooleanProperty WEST = BlockStateProperties.WEST;
    public static final BooleanProperty NORTH = BlockStateProperties.NORTH;
    public static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public Drawer() {
        super(Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false).setValue(EAST, false).setValue(WEST, false).setValue(NORTH, false).setValue(SOUTH, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        VoxelShape e = box(0, 0, 0, 0, 0, 0);
        if (state.getValue(EAST)) {
            e = box(15, 0, 1, 16, 12, 15);
        }
        VoxelShape w = box(0, 0, 0, 0, 0, 0);
        if (state.getValue(WEST)) {
            w = box(0, 0, 1, 1, 12, 15);
        }
        VoxelShape n = box(0, 0, 0, 0, 0, 0);
        if (state.getValue(NORTH)) {
            n = box(1, 0, 0, 15, 12, 1);
        }
        VoxelShape s = box(0, 0, 0, 0, 0, 0);
        if (state.getValue(SOUTH)) {
            s = box(1, 0, 15, 15, 12, 16);
        }
        return Shapes.or(box(1, 0, 1, 15, 12, 15), box(0, 12, 0, 16, 16, 16), e, w, n, s);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, EAST, WEST, NORTH, SOUTH);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag).setValue(EAST, false).setValue(WEST, false).setValue(NORTH, false).setValue(SOUTH, false);
    }

    @Override
    public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        CounterConnectProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
    }
}
