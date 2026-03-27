package practice3.delivery.model;

public class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() + maxLoad * 3;
    }

    // Overloading
    public double calculateDeliveryCost(double distance, double fuelPrice) {
        double extraCost = distance * fuelPrice * 0.3;
        return this.calculateDeliveryCost() + extraCost;
    }
}
