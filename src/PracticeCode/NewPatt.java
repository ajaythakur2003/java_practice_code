package PracticeCode;

import java.util.ArrayList;
public class NewPatt {
//    public static void main(String[] args) {
//        int n = 4;
////
////            System.out.println();
////        }
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = n-1; j > 0 ; j--) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//            }
//        }

        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {
            // Your code here
            int low = 0;
            int high = 1;
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                while(low < high){
                    sum = sum + arr[low] + arr[high];
                    if(sum == s){
                        list.add(low);
                        list.add(high);
                        return list;
                    }

                    if(sum < s){
                        high++;
                    }
                    else{
                        high--;
                    }

                }
            }
            list.add(-1);
            list.add(-1);
            return list;
        }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
        int[] arr = {1,2,3,4,5,6};
        int s = 6;
        int n = arr.length;
        System.out.println(subarraySum(arr,n,s));
    }
    }



