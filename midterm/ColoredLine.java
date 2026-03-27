package midterm;

public class ColoredLine extends Line {
    private String color;

    public ColoredLine(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color;
    }
}
