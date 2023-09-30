package org.example.sorting;

/**
 * @author rival
 * @since 2023-09-30
 */
public class IntArraySorter {


    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted)break;
        }
    }

    public static void selectionSort(int[] arr) {
        int min_index;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;

            // Select index of smallest number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swap(arr, i, min_index);
        }
    }


    public static void insertionSort(int[] arr) {
        int key, key_index;

        for (int i = 1; i < arr.length; i++) {
            // Remember new element
            key = arr[i];

            // Move
            for (key_index = i; key_index >= 1 && arr[key_index - 1] > key; key_index--) {
                arr[key_index] = arr[key_index - 1];
            }
            arr[key_index] = key;
        }
    }


    public static void shellSort(int[] arr){
        for(int gap=arr.length/2;gap>0;gap/=2){
            insertionSortWithGap(arr,gap);
        }
    }



    private static void insertionSortWithGap(int[] arr, int gap){

        int key, key_index;
        for(int i=gap; i<arr.length ; i++){
            key = arr[i];
            for(key_index=i; key_index>=gap && arr[key_index-gap] > key; key_index-=gap){
                arr[key_index] = arr[key_index-gap];
            }
            if(i!= key_index)arr[key_index] = key;
        }
    }


    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
