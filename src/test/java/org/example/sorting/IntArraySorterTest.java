package org.example.sorting;
import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.sorting.IntArraySorter.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rival
 * @since 2023-09-30
 */
class IntArraySorterTest {

    private final Random RANDOM = new Random();
    public int[] generateRandomIntArray(int max, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(max + 1);  // nextInt(n) returns values between 0 (inclusive) and n (exclusive)
        }
        return array;
    }

    @DisplayName("1. selection sort")
    @Test
    void test_1() {
        int[] arr= generateRandomIntArray(20,10);
        selectionSort(arr);
        assertTrue(isSorted(arr));
    }

    @DisplayName("2. insertion sort")
    @Test
    void test_2(){
        int[] arr= generateRandomIntArray(20,10);
        insertionSort(arr);
        assertTrue(isSorted(arr));

    }

    @DisplayName("3. bubble sort")
    @Test
    void test_3(){
        int[] arr= generateRandomIntArray(20,10);
        bubbleSort(arr);
        assertTrue(isSorted(arr));
    }

    @DisplayName("4. shell sort")
    @Test
    void test_4(){
        int[] arr= generateRandomIntArray(20,10);
        shellSort(arr);
        assertTrue(isSorted(arr));

    }

}