package lab2.task2.models;

public class Position {
    private char x;
    private int y;

    public Position(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {return this.x;}
    public int getY() {return this.y;}

    public String getPosition() {
        return String.format("x: %s, y: %s", this.x, this.y);
    }
}
