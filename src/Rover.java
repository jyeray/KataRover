import Positions.NorthPosition;
import Positions.PositionInterface;

import java.util.HashMap;

public class Rover {

    private PositionInterface position;

    private static final HashMap<Integer, Integer> GRID = new HashMap<>();

    public Rover() {
        initializeGrid();
        this.position = new NorthPosition(0, 0, GRID);
    }

    private void initializeGrid() {
        for (int i = 0; i <= 10; i++) {
            GRID.put(i, i);
        }
        GRID.put(-1, 10);
        GRID.put(11, 0);
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
        position.move();
    }
}
