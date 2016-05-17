public class Rover {

    private Position position;

    public Rover() {
        this.position = new Position(0, 0, 'N');
    }

    public Position getPosition() {
        return position;
    }
}
