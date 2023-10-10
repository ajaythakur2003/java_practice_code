package PracticeCode;

import java.util.ArrayList;
import java.util.Arrays;

// ---------------------------Brute-force approach-------------------------

public class Zeroes {
    public static void main(String[] args) {
        int[] arr = {1,4,0,3,5,0,8,0,9,7};
        int n = arr.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if(arr[i] != 0){
//                list.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//
//        for (int i = list.size(); i < n; i++) {
//            arr[i] = 0;
//        }
//
//        System.out.println(PracticeCode.Arrays.toString(arr));


//-------------------------------Optimal Solution--------------------------

        int j = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j+1; i < n; i++) {
            if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
