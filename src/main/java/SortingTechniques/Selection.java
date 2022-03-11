package SortingTechniques;

public class Selection {
    private Selection() { }

    public static void Sort(Comparable[] array) {
        int min;

        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }

            exchange(array, min, i);
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
