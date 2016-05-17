public class Rover {

    private Position position;

    public Rover() {
        this.position = new Position(0, 0, new North());
    }

    public Position getPosition() {
        return position;
    }

    public void turnLeft() {
        position.turnLeft();
    }

    public void turnRight() {
        position.turnRight();
    }
}
