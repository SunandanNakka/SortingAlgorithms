package ComparatorUsage.SortingTechniques;

import java.util.Comparator;

public class Insertion {
    private Insertion() { }

    public static void Sort(Object[] array, Comparator c) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(c, array[j], array[j - 1])) {
                    exchange(array, j, j - 1);
                } else {
                    break;
                }
            }
        }

        assert isSorted(array, c);
    }

    private static boolean less(Comparator c, Object a, Object b) {
        return c.compare(a, b) < 0;
    }

    private static void exchange(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static boolean isSorted(Object[] array, Comparator c) {
        for (int i = 0; i < array.length - 1; i++) {
            if(!less(c, array[i], array[i + 1])) {
                return false;
            }
        }

        return true;
    }
}
