package lab1.task1;
public class Data {
    private double sum;
    private double mx;
    private int cnt;

    public Data(){
        this.mx = Double.NEGATIVE_INFINITY;
    }

    public void add(double value){
        this.sum += value;
        this.cnt ++;
        if(this.mx <= value) this.mx = value;
    }

    public double getAvg(){
        if(cnt == 0) return 0;
        return this.sum / cnt;
    }

    public double getLargest(){
        if(cnt == 0) return 0;
        return this.mx;
    }
}
