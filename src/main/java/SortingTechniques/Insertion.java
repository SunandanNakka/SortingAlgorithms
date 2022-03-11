package SortingTechniques;

public class Insertion {
    private Insertion() { }

    public static void Sort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array[j], array[j - 1])) {
                    exchange(array, j, j - 1);
                } else {
                    break;
                }
            }
        }

        assert isSorted(array);
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
