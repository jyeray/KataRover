package Positions;

import java.util.HashMap;

public class NorthPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'N';

    private static HashMap<Integer, Integer> GRID;


    public NorthPosition(int x, int y, HashMap<Integer, Integer> GRID) {
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
        return new WestPosition(x, y, GRID);
    }

    @Override
    public PositionInterface turnRight() {
        return new EastPosition(x, y, GRID);
    }

    @Override
    public void move() {
        y++;
        y = GRID.get(y);
    }
}
