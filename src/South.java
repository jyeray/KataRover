public class South implements CardinalPointInterface {
    @Override
    public CardinalPointInterface left() {
        return new East();
    }

    @Override
    public CardinalPointInterface right() {
        return new West();
    }

    @Override
    public char getDirection() {
        return 'S';
    }
}
