package PracticeCode;

import java.util.Arrays;

public class Reverse {

    static void reverse(int[] arr, int start, int end) {
        if (start > end) return;
        swap(arr, start, end);
        reverse(arr, start + 1, end - 1);

    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,0};

        int start = 0;
        int end = arr.length- 1;
        reverse(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
