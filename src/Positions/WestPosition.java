package Positions;

public class WestPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'W';

    public WestPosition(int x, int y) {
        this.x = x;
        this.y = y;
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
        return new SouthPosition(x, y);
    }

    @Override
    public PositionInterface turnRight() {
        return new NorthPosition(x, y);
    }
}
