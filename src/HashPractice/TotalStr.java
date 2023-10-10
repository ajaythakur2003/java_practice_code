package HashPractice;

import java.util.Scanner;

public class TotalStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] hash = new int[256];
        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i)] += 1;
        }

        int q = sc.nextInt();
        while(q >= 1){
            String c = sc.next();
//            System.out.println(hash[c]);
            q--;
        }
    }
}
