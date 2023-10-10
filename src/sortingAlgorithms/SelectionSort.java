package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 6, 1};
//        selection(arr);
        selectionUsingRecursion(arr,0,arr.length - 1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }


    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void selectionUsingRecursion(int[] arr, int s, int e, int max){
        if(e == 0){
            return;
        }

        if(s <= e){
            if(arr[s] > arr[max]){
                selectionUsingRecursion(arr, s+1, e, s);
            }
            else{
                selectionUsingRecursion(arr, s+1, e, max);
            }
        }

        else{
            int temp = arr[max];
            arr[max] = arr[e];
            arr[e] = temp;

            selectionUsingRecursion(arr, 0,e-1, 0);
        }
    }
}
