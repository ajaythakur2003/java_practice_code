package bitwise;

public class FIndUnique {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3,6,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
