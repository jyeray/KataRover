package Positions;

import java.util.HashMap;

public class WestPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'W';

    private static HashMap<Integer, Integer> GRID;

    public WestPosition(int x, int y, HashMap<Integer, Integer> GRID) {
        this.x = x;
        this.y = y;
        this.GRID = GRID;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public char getDirection() {
        return DIRECTION;
    }

    @Override
    public PositionInterface turnLeft() {
        return new SouthPosition(x, y, GRID);
    }

    @Override
    public PositionInterface turnRight() {
        return new NorthPosition(x, y, GRID);
    }

    @Override
    public void move() {
        x--;
        x = GRID.get(x);
    }
}
