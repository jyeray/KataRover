public class Position {

    private final int x;
    private final int y;
    private CardinalPointInterface direction;

    public Position(int x, int y, CardinalPointInterface direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction.getDirection();
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }
}
