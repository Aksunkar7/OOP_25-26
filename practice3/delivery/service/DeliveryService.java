package practice3.delivery.service;

import practice3.delivery.model.Vehicle;

import java.util.List;

public class DeliveryService {
    public void printAllVehicles (List<Vehicle> vehicles) {
        System.out.println("---Vehicles---");
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel());
        }
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Delivery cost for " +
                    v.getModel() + ": " +
                    v.calculateDeliveryCost());
        }
    }

    public double calculateTotalCost (List<Vehicle> vehicles) {
        double sumOfDeliveries = 0;
        for(Vehicle v : vehicles) {
            sumOfDeliveries += v.calculateDeliveryCost();
        }
        return sumOfDeliveries;
    }
}
