package sortingAlgorithms.quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,7,8,1, 1, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int hi){
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;

        int pivot = arr[m];

        while(s <= e){
            while (arr[s] < arr[m]){
                s++;
            }
            while (arr[e] > arr[m]){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, hi);

    }
}
