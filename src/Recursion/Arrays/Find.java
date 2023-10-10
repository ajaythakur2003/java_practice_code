package Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 6, 13};
        int target = 2;
//        System.out.println(findTarget(arr,target,0));
        System.out.println(findTargetIndex(arr,target,0,new ArrayList<>()));
    }

    static int findTarget(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        else{
           return findTarget(arr,target,index + 1);
        }
    }

    static ArrayList<Integer> findTargetIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
            return findTargetIndex(arr,target,index + 1, list);
    }

}
