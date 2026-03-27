package lab1.task2;
public class App {
    public static void main(String[] args) {
        Ride r1 = new Ride("Aksungkar", 25);
        Ride r2 = new Ride("Arman", 20, RideType.COMFORT); // using overloading constructor

        System.out.println(r1.calculateFare());
        System.out.println(r2.calculateFare()); 
        System.out.println(r2.calculateFare(2.0)); // Overloading by case, When it's raining 2x fare
        r2.getInfo(); 


    }
}
