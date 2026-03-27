package midterm;
import static java.lang.Math.abs;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getDistanceOfPoints(int x, int y){
            return abs(x - y);
    }


}
