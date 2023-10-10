package Recursion;

import java.util.Arrays;

public class ReverseTest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,4,9};
        int n = arr.length - 1;
        reverse(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        swap(arr, l , r);
        reverse(arr, l+1, r-1);
    }

     static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
