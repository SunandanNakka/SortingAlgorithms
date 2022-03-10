package TestingSortingTechniques;

import SortingTechniques.InsertionSort;

import java.util.Arrays;

public class SortingTheArray {

    public static void main(String args[]) {
        Integer[] array = {4, 6, 1, 2, 9, 8, 3};
        System.out.println("Array to be sorted: " + Arrays.toString(array));
        InsertionSort.Sort(array);
        System.out.println("Sorted array using Insertion Sort: " + Arrays.toString(array));
    }
}
