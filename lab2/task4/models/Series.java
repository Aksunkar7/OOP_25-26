package lab2.task4.models;
// Two circuits connected in series
// Equivalent resistance: R = R₁ + R₂
// Current is the same through both branches: I = V / R
// Voltage splits proportionally: Vₙ = I × Rₙ

public class Series extends Circuit {

    private final Circuit first;
    private final Circuit second;
    private double potentialDifference;


//     first  the first component
//     second the second component

    public Series(Circuit first, Circuit second) {
        this.first  = first;
        this.second = second;
    }

//    R_series = R₁ + R₂
    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

//     circuit, so the voltage across each component is Vₙ = I × Rₙ.
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;

        double I = getCurrent(); // I = V / R_total
        first.applyPotentialDiff(I * first.getResistance());
        second.applyPotentialDiff(I * second.getResistance());
    }

    @Override
    public String toString() {
        return String.format("Series(R=%.2f Ω, V=%.2f V) [%s, %s]",
                getResistance(), potentialDifference, first, second);
    }
}
