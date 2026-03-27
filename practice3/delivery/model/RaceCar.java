package practice3.delivery.model;

public class RaceCar extends Car {
    public RaceCar(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine, numberOfSeats);
    }

    @Override
    public double calculateDeliveryCost(double extraWeight) {
        return this.calculateDeliveryCost() + extraWeight * 3;
    }
}
