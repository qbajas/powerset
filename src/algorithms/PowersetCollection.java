package algorithms;

import main.Powerset;

import java.util.*;

/**
 * Generates physical set of subsets
 * subsets cannot be arrays so they are represented as lists
 */
public class PowersetCollection<T> implements Powerset {

    List<T> orignalList;

    public PowersetCollection(T[] data) {
        orignalList = Arrays.asList(data);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Powersets from PowersetCollection: ===");
    }

    @Override
    public void generateAndPrintPowersets() {
        print(powersets(orignalList));
    }

    private Set<List<T>> powersets(List<T> list) {
        Set<List<T>> sets = new HashSet<List<T>>();
        if (list.isEmpty()) {
            sets.add(list);
            return sets;
        }
        T head = list.get(0);
        List<T> rest = list.subList(1, list.size());
        for (List<T> restPowerset : powersets(rest)) {
            // add subset without head
            sets.add(restPowerset);
            // add subset with head
            List<T> restWithHead = new LinkedList<T>(restPowerset);
            restWithHead.add(0, head);
            sets.add(restWithHead);
        }
        return sets;
    }

    private void print(Set<List<T>> sets) {
        for (List<T> list : sets) {
            boolean first = true;
            System.out.print("{");
            for (T el : list) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(",");
                }
                System.out.print(el);
            }
            System.out.println("}");
        }
    }

}
