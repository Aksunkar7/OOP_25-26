package practice3.delivery.app;

import practice3.delivery.model.*;
import practice3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Engines
        Engine audi = new Engine("audi", 500);
        Engine mers = new Engine("Mers", 600);
        // Vehicles
        Vehicle car = new Car("Audi", 1000, audi, 4);
        Vehicle truck = new Truck("Mers", 1000, mers, 10);

        List<Vehicle> vehicles = List.of(car, truck);

        DeliveryService d = new DeliveryService();
        d.printAllVehicles(vehicles);
        System.out.println();

        System.out.println(car.getVehicleInfo());
        System.out.println();
        System.out.println(truck.getVehicleInfo());
        System.out.println();

        d.calculateAllDeliveries(vehicles);
        System.out.println();
        System.out.println(String.format("Total cost of all deliveries: %s", d.calculateTotalCost(vehicles)));
        System.out.println();
        d.calculateAllDeliveries(vehicles);


        Car rc = new RaceCar("Toyoto", 1100, audi, 4);
//        Systrc.calculateDeliveryCost(5)
    }
}
