package sortingAlgorithms.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {4, 7, 13, 78, 43, 2, 1};
//        mergeSortInPlace(arr,0,arr.length);


       mergeSort2(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return ;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr,s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }



    public static void mergeSort2(int[] inputArray){
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }

        int mid = inputLength / 2;

        int[] left = new int[mid];
        int[] right = new int[inputLength - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];
        }

        for (int i = mid; i < inputLength; i++) {
            right[i - mid] = inputArray[i];
        }

        mergeSort2(left);
        mergeSort2(right);

        merge2(inputArray, left, right);
    }

    static void merge2(int[] inputArray, int[] left, int[] right){
        int leftSize = left.length;
        int rightsize = right.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightsize){
            if(left[i] <= right[j]){
                inputArray[k] = left[i];
                i++;
            }
            else{
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            inputArray[k] = left[i];
            i++;
            k++;
        }

        while(j < rightsize){
            inputArray[k] = right[j];
            j++;
            k++;
        }

    }
}
