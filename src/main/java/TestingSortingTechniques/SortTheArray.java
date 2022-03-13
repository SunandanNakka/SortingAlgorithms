package TestingSortingTechniques;

import SortingTechniques.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class SortTheArray {
    private static final Logger logger = LogManager.getLogger(SortTheArray.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("====================");

        Integer[] array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Insertion Sort");
        Insertion.Sort(array);
        logger.info(Arrays.toString(array));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Selection Sort");
        Selection.Sort(array);
        logger.info(Arrays.toString(array));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Merge Sort");
        Merge.Sort(array);
        logger.info(Arrays.toString(array));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Bubble Sort");
        Bubble.Sort(array);
        logger.info(Arrays.toString(array));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Quick Sort");
        Quick.Sort(array);
        logger.info(Arrays.toString(array));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Finding Kth lowest: 4th lowest Element Using Quick Sort");
        logger.info(Quick.Select(array, 4));

        logger.info("====================");

        array = new Integer[]{4, 6, 1, 2, 9, 8, 3, 0, -9, -2, -5, 4, 6, 10, 13, 124, -99};
        logger.info("Array to be sorted: " + Arrays.toString(array));
        logger.info("Using Dijkstra's 3-Way Partitioning Quick Sort");
        Dijkstra3WayQuick.Sort(array);
        logger.info(Arrays.toString(array));
    }
}
