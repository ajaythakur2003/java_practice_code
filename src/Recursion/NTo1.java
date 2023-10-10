package Recursion;

public class NTo1 {

    public static void main(String[] args) {
        int n = 5;
//        countRev(n);
        countBoth(n);
    }

    static void countRev(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        countRev(n - 1);
        System.out.println(n);
    }

    static void countBoth(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        countBoth(n - 1);
        System.out.println(n);
    }
}
