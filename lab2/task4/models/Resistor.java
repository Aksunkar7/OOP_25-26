package lab2.task4.models;

// A single resistor — the leaf node of a circuit tree.
//Resistance is fixed at construction time. A potential difference
//can be applied (and read back) via applyPotentialDiff
public class Resistor extends Circuit {

    private final double resistance;       // Ohms
    private double potentialDifference;    // Volts

// Constructs a resistor with the given resistance.
//resistance in Ohms (must be positive)
    public Resistor(double resistance) {
        if (resistance <= 0) {
            System.out.println("Resistance must be positive, try again (default 0)");
            this.resistance = 0;
        } else {
            this.resistance = resistance;
        }
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }

    @Override
    public String toString() {
        return String.format("Resistor(R=%.2f, V=%.2f V)", resistance, potentialDifference);
    }
}
