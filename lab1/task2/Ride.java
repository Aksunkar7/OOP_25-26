package lab1.task2;
public class Ride {
    public final String rideId;
    private String passengerName;
    private int distanceInKm;
    private final double BASE_FARE = 2.5;
    private static int totalRides;
    private RideType rideType = RideType.ECONOM;


    // block initialization
    {
        totalRides++;
        this.rideId = "SuperTaxi-" + totalRides;
    }

    public Ride(String name, int distance) {
        this.passengerName = name;
        this.distanceInKm = distance;
    }

    // Overloading
    public Ride(String name, int distance, RideType type) {
        this(name, distance);
        this.rideType = type;
    }

    public double calculateFare() {
        double multiplier = switch (this.rideType) {
            case ECONOM -> 1.0;
            case COMFORT -> 1.5;
            case BUSINESS -> 2.5;
        };
        return BASE_FARE + (distanceInKm * multiplier);
    }

    public int getDistanceInKm() {
        return this.distanceInKm;
    }

    // Час пик болып қалса, немесе ауа-райы нашарлап кетсе
    public double calculateFare(double surgeMultiplier) {
        return this.calculateFare() * surgeMultiplier;
    }

    public static int getTotalRides() {
        return totalRides;
    }

    public void getInfo() {
        System.out.println("Last ride: " + rideId + " | Passenger: " + passengerName);
        System.out.println("Last ride type: " + rideType + " | Last fare: $" + calculateFare());
    }
}
