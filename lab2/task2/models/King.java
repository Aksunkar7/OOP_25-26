package lab2.task2.models;

public class King extends Piece{
    public King(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
//      One step any side
        return dc(b) <= 1 && dr(b) <= 1 && !(dc(b) == 0 && dr(b) == 0);
    }
}
