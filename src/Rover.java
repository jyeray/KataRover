import Positions.NorthPosition;
import Positions.PositionInterface;

public class Rover {

    private PositionInterface position;

    public Rover() {
        this.position = new NorthPosition(0, 0);
    }

    public PositionInterface getPosition() {
        return position;
    }

    public void turnLeft() {
        position = position.turnLeft();
    }

    public void turnRight() {
        position = position.turnRight();
    }

    public void move() {

    }
}
