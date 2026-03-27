package practice3.delivery.model;

public class Engine {
    private String type;
    private double horsepower;

    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void getEngineInfo() {
        System.out.println(String.format("Type of engine: %s \nhorsepower is: %s", this.type, this.horsepower));
    }

    public String getType() { return  this.type; }
    public double getHorsePower() {
        return this.horsepower;
    }
}
