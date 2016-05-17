package Positions;

import java.util.HashMap;

public class SouthPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'S';

    private static HashMap<Integer, Integer> GRID;

    public SouthPosition(int x, int y, HashMap<Integer, Integer> GRID) {
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
        return new EastPosition(x, y, GRID);
    }

    @Override
    public PositionInterface turnRight() {
        return new WestPosition(x, y, GRID);
    }

    @Override
    public void move() {
        y--;
        y = GRID.get(y);
    }
}
