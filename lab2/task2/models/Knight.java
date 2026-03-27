package lab2.task2.models;

public class Knight extends Piece {
    public Knight(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        // Г step
        return (dc(b) == 2 && dr(b) == 1) || (dc(b) == 1 && dr(b) == 2);
    }
}
