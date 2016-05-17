import Positions.PositionInterface;
import org.junit.*;
import org.junit.Test;

public class RoverTest {

    @org.junit.Test
    public void testStart(){
        Rover rover = new Rover();
        PositionInterface roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getX(), 0);
        Assert.assertEquals(roverPosition.getY(), 0);
        Assert.assertEquals(roverPosition.getDirection(), 'N');
    }

    @Test
    public void testTurnLeft()
    {
        Rover rover = new Rover();
        rover.turnLeft();
        PositionInterface roverPosition = rover.getPosition();
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
    public void testTurnRight()
    {
        Rover rover = new Rover();
        rover.turnRight();
        PositionInterface roverPosition = rover.getPosition();
        Assert.assertEquals("test", roverPosition.getDirection(),'E');

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

    @Test
    public void testMoveNorth(){
        Rover rover = new Rover();
        rover.move();
        PositionInterface roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getX(), 0);
        Assert.assertEquals(roverPosition.getY(), 1);
        Assert.assertEquals(roverPosition.getDirection(), 'N');
    }

    @Test
    public void testMoveWestDintGoOut(){
        Rover rover = new Rover();
        rover.turnLeft();
        rover.move();
        PositionInterface roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getX(), 10);
        Assert.assertEquals(roverPosition.getY(), 0);
        Assert.assertEquals(roverPosition.getDirection(), 'W');
    }
}