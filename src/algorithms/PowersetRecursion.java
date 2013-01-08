package algorithms;

import main.Powerset;

/**
 * Using recursive calls and bit mask
 */
public class PowersetRecursion implements Powerset {

    int[] data;
    boolean[] used;

    public PowersetRecursion(int[] data) {
        this.data = data;
        used = new boolean[data.length];
    }

    @Override
    public void printInfo() {
        System.out.println("=== Powersets from PowersetRecursion: ===");
    }

    @Override
    public void printPowersets() {
        generate(0);
    }

    private void generate(int step) {
        if (step == data.length) {
            print();
            return;
        }
        used[step] = true;
        generate(step + 1);
        used[step] = false;
        generate(step + 1);
    }

    private void print() {
        boolean first = true;
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            if (used[i]) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(",");
                }
                System.out.print(data[i]);
            }
        }
        System.out.println("}");
    }

}
