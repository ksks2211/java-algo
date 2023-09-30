package org.example.sorting;

/**
 * @author rival
 * @since 2023-09-30
 */
public class IntArraySorter {


    private static void swap(int[] arr, int i, int j){
        if(i==j) return;

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectionSort(int[] arr){
        int min_index;
        for(int i=0;i<arr.length-1;i++){
            min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_index]){
                    min_index=j;
                }
            }
            swap(arr,i,min_index);
        }
    }



    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
