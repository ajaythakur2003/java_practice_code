package binarySearchProblems;

public class GreaterChar {
    public static void main(String[] args) {
        char[] arr = {'c', 'h', 'k', 'm'};
        char target = 'n';
        char ans = greatestCharSearch(arr,target);
        System.out.println(ans);
    }

    static char greatestCharSearch(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            else {
                if(target < arr[mid]){
                    start = mid + 1;
                }

                else{
                    end = mid - 1;
                }
            }
        }
            return arr[start % arr.length];
    }
}
