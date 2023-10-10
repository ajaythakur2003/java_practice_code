package binarySearchProblems;

public class peekIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        int ans = peekValueIndexInArray(arr);
        System.out.println(ans);
    }

    public static int peekValueIndexInArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return start; // or end because both will point to the max value at the end.

    }
}
