public class West implements CardinalPointInterface {
    @Override
    public CardinalPointInterface left() {
        return new South();
    }

    @Override
    public CardinalPointInterface right() {
        return new North();
    }

    @Override
    public char getDirection() {
        return 'W';
    }
}
