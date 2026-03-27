package lab1.task3;

public class Temperature {
    // not accessible outside class
    private double value;
    private char scale;
    // private char scale = 'C'; We may do like that, but it breaks DRY. Instead we do only one call
    // otherwise, in case of changes we would change all constructors. DRY broken

    public Temperature() {
        this(0.0, 'C');
    }

    public Temperature(char sc) {
        this(0.0, sc);

    }

    public Temperature(double val) {
        this(val, 'C');
    }

    public Temperature(double val, char sc) {
        this.value = val;
        this.scale = sc;  
    }

    // Getters
    public double getCelsius() {
        if (this.scale == 'C') return this.value;
        return 5.0 * (this.value - 32) / 9.0; // If we write as 5/9 it may round it 
    }

    public double getFahrenheit() {
        if (this.scale == 'F') return this.value;
        return 9.0 * this.value / 5.0 + 32;
    }

    public char getScale() {
        return this.scale;
    }

    // Setters
    public void setValue(double val) {
        this.value = val;
    }

    public void setScale(char sc) {
        this.scale = sc;
    }

    public void setBoth(double val, char sc) {
        this.scale = sc;
        this.value = val;
    }
        
    @Override
    public String toString() {
        return this.value + " °" + this.scale;
    }
}