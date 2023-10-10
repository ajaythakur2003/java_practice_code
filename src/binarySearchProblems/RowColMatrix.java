package binarySearchProblems;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {2,5,7,9},
                {6,13,15,16},
                {12,56,89,90}
            };

        int target = 56;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[] {r, c};
            } else if (arr[r][c] < target) {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}
