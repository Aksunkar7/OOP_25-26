package practice3.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() + this.numberOfSeats * 5;
    }

    // Overloading
    public double calculateDeliveryCost(double extraWeight) {
        return this.calculateDeliveryCost() + extraWeight * 2;
    }
}
