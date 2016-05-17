import org.junit.*;

public class RoverTest {

    @org.junit.Test
    public void test_start(){
        Rover rover = new Rover();
        Position roverPosition = rover.getPosition();
        Assert.assertEquals(roverPosition.getX(), 0);
        Assert.assertEquals(roverPosition.getY(), 0);
        Assert.assertEquals(roverPosition.getDirection(), 'N');
    }
}