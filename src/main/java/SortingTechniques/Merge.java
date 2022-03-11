package SortingTechniques;

public class Merge {
    private Merge() { }

    public static void Sort(Comparable[] array) {
        Integer[] aux = new Integer[array.length];
        divideAndConquer(array, aux, 0, array.length - 1);
    }

    private static void divideAndConquer(Comparable[] array, Comparable[] aux, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo)/2;

        divideAndConquer(array, aux, lo, mid);
        divideAndConquer(array, aux, mid + 1, hi);

        merge(array, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {
                array[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                array[k] = aux[i++];
            } else {
                array[k] = aux[j++];
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
