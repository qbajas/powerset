package main;

import algorithms.PowersetNoRecursion;
import algorithms.PowersetRecursion;

/**
 * Created with IntelliJ IDEA.
 * User: Qba
 * Date: 08.01.13
 * Time: 17:05
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        int[] data = new int[]{2, 4, 6, 8};
        Powerset[] powersets = new Powerset[]{new PowersetRecursion(data), new PowersetNoRecursion(data)};

        for (Powerset p : powersets) {
            p.printInfo();
            p.printPowersets();
        }
    }

}
