package Recursion;

public class FiboNum {
    public static void main(String[] args) {
//        System.out.println(fibo(6));
        int counter = 0;
        int num1 = 0, num2 = 1;
        int n = 10;
        while(counter < n){
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;

        }
    }

//    static int fibo(int n){
//
//        if(n < 2){
//            return n;
//        }
//        return fibo(n-1) + fibo(n-2);
//    }
}
