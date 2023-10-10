package sortingAlgorithms;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
       int ans = fact(5);
        System.out.println(ans);

    }

    public static int sum(int n) {
        if(n < 1){
            return n;
        }
        return n + sum(n - 1);

    }

    static int sum2(int i, int sum){
        if(i < 1) return sum;

        return sum2(i - 1, sum + i);
    }

    static int fact(int n){
        if(n < 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}

