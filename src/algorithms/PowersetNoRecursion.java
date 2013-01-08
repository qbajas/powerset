package algorithms;

import main.Powerset;

/**
 * Using bit mask and bit operations
 * bit mask is an integer used as a binary number
 */
public class PowersetNoRecursion<T> implements Powerset {

    T[] data;
    boolean first;

    public PowersetNoRecursion(T[] data) {
        this.data = data;
    }

    @Override
    public void printInfo() {
        System.out.println("=== Powersets from PowersetNoRecursion: ===");
    }

    @Override
    public void generateAndPrintPowersets() {
//        1<<data.length is the same as (int)Math.pow(2,data.length)
        for (int bitMask = 0; bitMask < 1 << data.length; bitMask++) {
            first = true;
            System.out.print("{");
//            1<<i represents bit on position i
//            bitMask serves as a bit vector (true if to include element)
            for (int i = data.length - 1; i >= 0; i--) {
                if ((bitMask & (1 << i)) != 0) {
                    printElement(data[i]);
                }
            }
            System.out.println("}");
        }
    }

    private void printElement(T element) {
        if (first) {
            first = false;
        } else {
            System.out.print(",");
        }
        System.out.print(element);
    }
}
