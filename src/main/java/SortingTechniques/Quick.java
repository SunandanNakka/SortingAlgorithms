package SortingTechniques;

public class Quick {
    private Quick() { }

    public static void Sort(Comparable[] array) {
        Sort(array, 0, array.length - 1);

        assert isSorted(array);
    }

    public static Comparable Select(Comparable[] array, int k) {
        int lo = 0;
        int hi = array.length - 1;
        k = k - 1;

        while (hi > lo) {
            int p = partition(array, lo, hi);
            if (p > k) {
                hi = p - 1;
            } else if (p < k) {
                lo = p + 1;
            } else {
                return array[p];
            }
        }

        return array[k];
    }

    private static void Sort(Comparable[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int p = partition(array, lo, hi);

        Sort(array, lo, p - 1);
        Sort(array, p + 1, hi);
    }

    private static int partition(Comparable[] array, int lo, int hi) {
        int key = lo;
        int i = lo + 1;
        int j = hi;

        while (true) {
            while (less(array[i], array[key])) {
                if (i >= hi) {
                    break;
                } else {
                    i++;
                }
            }

            while (less(array[key], array[j])) {
                if (j <= lo) {
                    break;
                } else {
                    j--;
                }
            }

            if (i >= j) {
                break;
            }

            exchange(array, i, j);
        }
        exchange(array, key, j);

        return j;
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
