public class East implements CardinalPointInterface {
    @Override
    public CardinalPointInterface left() {
        return new North();
    }

    @Override
    public CardinalPointInterface right() {
        return new South();
    }

    @Override
    public char getDirection() {
        return 'E';
    }
}
