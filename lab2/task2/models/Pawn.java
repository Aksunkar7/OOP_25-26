package lab2.task2.models;

public class Pawn extends Piece{
    private boolean hasMoved;

    public Pawn(Position a, Color color) {
        super(a, color);
        this.hasMoved = false;
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dy = b.getY() - a.getY();
        int dx = dc(b);

        if (dx != 0) return false;

        if (color == Color.WHITE) {
            if (dy == 1) return true;
            if (dy == 2 && !hasMoved) return true;
        } else {
            if (dy == -1) return true;
            if (dy == -2 && !hasMoved) return true;
        }
        return false;
    }

    public boolean eat(Position b) {
        int dy = b.getY() - a.getY();
        int direction = (color == Color.WHITE) ? 1 : -1;
        return dc(b) == 1 && dy == direction;
    }

    public void markMoved() {
        this.hasMoved = true;
    }
}

