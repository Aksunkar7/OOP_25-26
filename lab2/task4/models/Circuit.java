package lab2.task4.models;

public abstract class Circuit {

//  return the equivalent resistance of this circuit in Ohms
    public abstract double getResistance();

//    return the potential difference currently across this circuit in Volts
    public abstract double getPotentialDiff();


//     Applies a potential difference across this circuit, propagating it
//     to subcomponents according to series/parallel rules.
//     V the potential difference in Volts
     public abstract void applyPotentialDiff(double V);


//     Returns the power dissipated by this circuit: P = V² / R
//     return power in Watts
    public double getPower() {
        double V = getPotentialDiff();
        double R = getResistance();
        return (V * V) / R;
    }

//      Returns the current drawn by this circuit: I = V / R
//     return current in Amperes
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}
