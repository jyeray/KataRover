import org.junit.*;
import org.junit.Test;

public class RoverTest {

    @org.junit.Test
    public void test_start(){
        Rover rover = new Rover();
        Position roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getX(), 0);
        Assert.assertEquals(roverPosition.getY(), 0);
        Assert.assertEquals(roverPosition.getDirection(), 'N');
    }

    @Test
    public void test_turn_left()
    {
        Rover rover = new Rover();
        rover.turnLeft();
        Position roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'W');

        rover.turnLeft();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'S');
        rover.turnLeft();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'E');
        rover.turnLeft();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'N');
    }

    @Test
    public void test_turn_right()
    {
        Rover rover = new Rover();
        rover.turnRight();
        Position roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'E');

        rover.turnRight();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'S');
        rover.turnRight();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'W');
        rover.turnRight();
        roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getDirection(),'N');
    }
}