package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 44, 66, 76};
        int target = 44;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target){
            return search(arr, target,m + 1, e);
        }
        return search(arr, target, s, m - 1);
    }
}
