package org.example.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.sorting.IntArraySorter.isSorted;
import static org.example.sorting.IntArraySorter.selectionSort;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rival
 * @since 2023-09-30
 */
class IntArraySorterTest {


    @DisplayName("1. Sort Int Array")
    @Test
    void test_1() {
        int[] arr= {50,20,30,10,40};
        selectionSort(arr);
        assertTrue(isSorted(arr));
    }

}