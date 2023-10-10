package PracticeCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
class Result {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int d = 2;
        arr.add(0,2);

//        System.out.println(rotateLeft(d,arr));
        System.out.println(arr);
    }
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//        // Write your code here
//        int n = arr.size();
//        d %= arr.size();
//        reverse(arr,0,n-1);
//        reverse(arr,0,d);
//        reverse(arr, d+1, n-1);
//
//        return arr;
//    }
//
//    public static List<Integer> reverse(List<Integer> arr, int s, int e){
//        while(s < e){
//            int temp = arr.get(s);
//
//            arr.get(s) = arr.get(e);
//            arr.get(e) = temp;
//        }
//
//        return arr;
//    }

}