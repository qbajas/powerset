package main;

import algorithms.PowersetCollection;
import algorithms.PowersetNoRecursion;
import algorithms.PowersetRecursion;

/**
 * 3 different methods of generating power set
 */
public class Main {

    public static void main(String[] args) {

        Integer[] data = new Integer[]{2, 4, 6};
        Powerset[] powersets = new Powerset[]{
                new PowersetRecursion<Integer>(data),
                new PowersetNoRecursion<Integer>(data),
                new PowersetCollection<Integer>(data)
        };

        for (Powerset p : powersets) {
            p.printInfo();
            p.generateAndPrintPowersets();
        }
    }

}
