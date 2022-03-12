package SortingTechniques;

public class Bubble {
    private Bubble() { }

    public static void Sort(Comparable[] array) {
        int arrayLen = array.length;

        for (int i = 0; i < arrayLen; i++) {
            for (int j = 0; j < arrayLen - i - 1; j++) {
                if (less(array[j + 1], array[j])) {
                    exchange(array, j+1, j);
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
