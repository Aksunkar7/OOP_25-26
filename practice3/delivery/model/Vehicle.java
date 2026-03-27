package practice3.delivery.model;

import java.lang.invoke.VarHandle;

public abstract class Vehicle {
    private String model;
    private double baseCost;
    private Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public double calculateDeliveryCost() {
        return this.baseCost + this.engine.getHorsePower() * 0.1;
    }

    public double getBaseCost() {
        return this.baseCost;
    }


    public String getModel() {
        return this.model;
    }

    public String getVehicleInfo() {
        return String.format(
                "Model: %s \nBase cost: %.2f \nEngine type: %s \nEngine's horsepower: %s",
                model,
                baseCost,
                engine.getType(),
                engine.getHorsePower()
        );
    }
}
