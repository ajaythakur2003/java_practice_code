import java.util.Arrays;

public class NewTest {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,9};
        int[] arr1 = {2,1};
        int profit = 0;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < sum; i++) {
            profit += arr[i];
        }
        System.out.println(profit);

        }
    }

