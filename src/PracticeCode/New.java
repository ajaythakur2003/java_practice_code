package PracticeCode;

import java.util.ArrayList;
import java.util.List;

public class New {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(i,arr[i]);
        }
        System.out.println(list);
    }
}
