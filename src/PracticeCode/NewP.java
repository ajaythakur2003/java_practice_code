package PracticeCode;

import java.util.Scanner;

public class NewP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        int res = 0;
        while(num > 0){
            rem = num % 10;
            res = (res*10) + rem;
            num /= 10;
        }
        System.out.println(res);
    }
}
