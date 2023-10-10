package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    static int sum(int n){
        if(n == 0){
            return n;
        }
//        int rem = n % 10;
//        n /= 10;

//        return rem + sum(n);

        return (n % 10) + sum(n / 10);
    }
}
