package Positions;

import java.util.HashMap;

public class EastPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'E';

    private static HashMap<Integer, Integer> GRID;

    public EastPosition(int x, int y, HashMap<Integer, Integer> GRID) {
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
        return new NorthPosition(x, y, GRID);
    }

    @Override
    public PositionInterface turnRight() {
        return new SouthPosition(x, y, GRID);
    }

    @Override
    public void move() {
        x++;
        x = GRID.get(x);
    }
}
