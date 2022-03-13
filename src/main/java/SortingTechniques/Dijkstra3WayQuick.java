package SortingTechniques;

import java.util.Arrays;

public class Dijkstra3WayQuick {
    private Dijkstra3WayQuick() { }

    public static void Sort(Comparable[] array) {
        Sort(array, 0, array.length - 1);
    }

    private static void Sort(Comparable[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int lt = lo;
        int gt = hi;
        int i = lo;

        Comparable key = array[lo];

        while (i <= gt) {
            int c = array[i].compareTo(key);

            if (c < 0) {
                exchange(array, i++, lt++);
            } else if (c > 0) {
                exchange(array, i, gt--);
            } else {
                i++;
            }
        }

        Sort(array, lo, lt - 1);
        Sort(array, gt + 1, hi);
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static boolean isSorted(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if(!less(array[i], array[i + 1])) {
                return false;
            }
        }

        return true;
    }
}
