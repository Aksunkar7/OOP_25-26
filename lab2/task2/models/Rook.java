package lab2.task2.models;

public class Rook extends Piece{
    public Rook(Position a, Color color) {
        super(a, color);
    }
    @Override
    public boolean isLegalMove(Position b) {
        return (b.getX() == a.getX()) || (b.getY() == a.getY());
    }
}
