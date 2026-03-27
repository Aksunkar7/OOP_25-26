package lab2.task4.models;


//    Two circuits connected in parallel
//    Equivalent resistance (reciprocal rule): 1/R = 1/R₁ + 1/R₂
//    Voltage across both branches equals the voltage across the
//        whole parallel block: V₁ = V₂ = V

public class Parallel extends Circuit {

    private final Circuit first;
    private final Circuit second;
    private double potentialDifference;


//     Constructs a parallel circuit from two sub-circuits.
//     first  the first branch
//     second the second branch
    public Parallel(Circuit first, Circuit second) {
        this.first  = first;
        this.second = second;
    }

//    1/R_parallel = 1/R₁ + 1/R₂  →  R = (R₁ × R₂) / (R₁ + R₂) */
    @Override
    public double getResistance() {
        double r1 = first.getResistance();
        double r2 = second.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }


//     Applies V across the whole parallel block; each branch sees the
//     same potential difference V
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return String.format("Parallel(R=%.2f Ω, V=%.2f V) [%s, %s]",
                getResistance(), potentialDifference, first, second);
    }
}
