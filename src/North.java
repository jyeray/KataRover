public class North  implements  CardinalPointInterface{

    @Override
    public CardinalPointInterface left() {
        return new West();
    }

    @Override
    public CardinalPointInterface right() {
        return new East();
    }

    @Override
    public char getDirection() {
        return 'N';
    }
}
