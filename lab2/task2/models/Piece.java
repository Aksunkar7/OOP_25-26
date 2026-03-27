package lab2.task2.models;

public abstract class Piece {
    protected Position a;
    protected final Color color;


    public Piece(Position a, Color color) {
        this.a = a;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setPosition(Position p)  { this.a = p; }

    public abstract boolean isLegalMove(Position b);
    protected int dc(Position b) { return Math.abs(b.getX() - a.getX()); }
    protected int dr(Position b) { return Math.abs(b.getY() - a.getY()); }
}
