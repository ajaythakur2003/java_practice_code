package binarySearchProblems;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 9, 20, 28, 29, 40, 45, 47, 48, 50};
        int target = 48;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target) {
        //fifrst find the range
        //first start with a box of two
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;

            //newEnd = previousEnd + boxSize*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return infiniteArray(arr, target, start, end);
    }

    static int infiniteArray(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
