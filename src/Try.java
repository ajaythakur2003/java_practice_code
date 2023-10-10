import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        int[] arr = {1,2,4,7,5,6,3,8,9};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 2; i <= 6; i++) {
                 largest = Math.max(largest, arr[i]);
        }

        for (int i = 2; i <= 6; i++) {
            if(arr[i] != largest){
                second = Math.max(second, arr[i]);
            }
        }

        System.out.println(second);






    }
}

