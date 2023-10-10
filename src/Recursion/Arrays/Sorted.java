package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7};
        int index = 0;
        System.out.println(sortedOrNot(arr, index));

    }

    static boolean sortedOrNot(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sortedOrNot(arr,index + 1);
    }
}
