package PracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
public class IntersectionArray {
    public static void main(String[] args) {

        int A[]= {1,2,3,3,4,5,6,7};
        int B[]= {3,3,4,4,5,8};
        int n = A.length;
        int m = B.length;
//------------------------Brute-force-----------------------

//        ArrayList<Integer> list = new ArrayList<>();
//        int [] visited = new int[B.length];
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < B.length; j++) {
//                if(A[i] == B[j] && visited[j] == 0){
//                    list.add(A[i]);
//                    visited[j] = 1;
//                    break;
//                } else if (B[j] > A[i])
//                    break;
//
//            }
//
//        }
//
//        System.out.println(list);


        //----------------------optimal solution---------------

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m){
            if(A[i] < B[j]){
                i++;
            } else if (B[j] < A[i]) {
                j++;
            }
            else {
                list.add(A[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }

}
