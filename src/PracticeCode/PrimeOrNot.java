package PracticeCode;

import java.util.Scanner;

public class PrimeOrNot {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        if(n<=1){
//            System.out.println("Not a prime");
//        }
//
//        int c  = 2;
//        while(n>=c*c){
//            if(n%c==0){
//                System.out.println("Not a prime");
//                break;
//            }
//            c++;
//            System.out.println("prime");
//            break;
//        }
//    }


    public static void main(String[] args) {
        int n = 50;
        boolean[] prime = new boolean[n + 1];
        sieve(prime,n);
    }

    public static void sieve(boolean[] prime, int n){
        for(int i = 2; i*i <= n; i++){
            if(!prime[i]) {
                for (int j = i*2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }


    }

