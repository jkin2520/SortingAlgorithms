package SortingAlgorithms.src.test;
import org.junit.jupiter.api.Test;

import SortingAlgorithms.src.main.SortingAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    @Test
    void testQuickSort() {
        int[] array = {9, 4, 7, 3, 1, 8};
        SortingAlgorithms.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 3, 4, 7, 8, 9}, array);
    }

    @Test
    void testMergeSort() {
        int[] array = {5, 1, 6, 3, 8, 2};
        int[] sortedArray = SortingAlgorithms.mergeSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 8}, sortedArray);
    }

    @Test
    void testBubbleSort() {
        int[] array = {6, 3, 2, 8, 1, 5};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 8}, array);
    }
}
