package lab2.task2.models;

public class Queen extends Piece{
    public Queen(Position a, Color color) {
        super(a, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        // as rook and bishop
        boolean rookMove   = (b.getX() == a.getX()) || (b.getY() == a.getY());
        boolean bishopMove = dc(b) == dr(b) && dc(b) != 0;
        return rookMove || bishopMove;
    }
}


