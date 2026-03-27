package lab1.task3;
public class App {
    public static void main(String[] args) {
        // Instances
        Temperature morning = new Temperature(3); 
        Temperature night = new Temperature(-1);  

        System.out.println("Morning Temperature");
        System.out.println("Celsius: " + morning.getCelsius()); 
        
        morning.setValue(5);
        System.out.println("Celsius: " + morning.getCelsius()); 
        System.out.println("In Fahrenheit: " + morning.getFahrenheit()); 

        System.out.println("\n\nNight Temperature");
        System.out.println("In Fahrenheit: " + night.getFahrenheit()); 
        System.out.println("In Celsius: " + night.getCelsius());

        // toString()
        System.out.println("\n\nString Representation");
        System.out.println("Morning object: " + morning.toString()); // May just write ~morning~
        System.out.println("Night object: " + night);
    }
}