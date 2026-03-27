package lab2.task2.models;

public class Bishop extends Piece{
    public Bishop(Position a, Color color) {
        super(a, color);
    }
    @Override
    public boolean isLegalMove(Position b) {
        // Only diagonal
        return dc(b) == dr(b) && dc(b) != 0;
    }
}
