package Positions;

public interface PositionInterface {
    int getX();
    int getY();
    char getDirection();
    PositionInterface turnLeft();
    PositionInterface turnRight();
    void move();
}
