package lab2.task4.app;

import lab2.task4.models.*;

public class CircuitTest {

    public static void main(String[] args) {

        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        double R = circuit.getResistance();
        System.out.printf("Equivalent resistance : %.4f Ω%n", R);

        double V = 12.0; // Volts
        circuit.applyPotentialDiff(V);

        System.out.printf("%nApplied voltage: %.2f V%n", V);
        System.out.printf("Total current: %.4f A%n",  circuit.getCurrent());
        System.out.printf("Total power: %.4f W%n",  circuit.getPower());

        System.out.println("\n Branch details ");
        printCircuit("r1", r1);
        printCircuit("r2", r2);
        printCircuit("r3", r3);
        printCircuit("r4", r4);
        printCircuit("c1 (r1 ∥ r2)", c1);
        printCircuit("c2 (r3+r4)", c2);
        printCircuit("circuit", circuit);
    }

    private static void printCircuit(String label, Circuit c) {
        System.out.printf("%-20s R=%6.4f Ω V=%6.4f V I=%6.4f A P=%7.4f W%n",
                label,
                c.getResistance(),
                c.getPotentialDiff(),
                c.getCurrent(),
                c.getPower());
    }
}
