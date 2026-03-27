package lab1.task1;

import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.println("Enter number (Q to quit):");
            String input = s.next(); //it can be break case

            if(input.equalsIgnoreCase("Q")) break;  // not case sensitive
            try {
            double num = Double.parseDouble(input);
            data.add(num);
            } catch (NumberFormatException e) { // Can write just (Exception e), catches all exceptions
                System.out.println("Invalid input, input number or (Q/q)");
            }

        }
        System.out.println("Average = " + data.getAvg());
        System.out.println("Maximum = " + data.getLargest());

    }
}
