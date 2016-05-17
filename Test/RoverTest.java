import org.junit.Assert;

import static org.junit.Assert.*;

public class RoverTest {

    public void test_start(){
        Rover rover = new Rover();
        Position roverPosition = rover.getPosition();
        Assert.assertEquals(Position.getX, 0);
        Assert.assertEquals(Position.getY, 0);
        Assert.assertEquals(Position.getDirection, 'N');
    }
}