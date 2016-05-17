package Positions;

public class EastPosition implements PositionInterface {

    private int x;
    private int y;
    private final char DIRECTION = 'E';

    public EastPosition(int x, int y) {
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
        return new NorthPosition(x, y);
    }

    @Override
    public PositionInterface turnRight() {
        return new SouthPosition(x, y);
    }
}
