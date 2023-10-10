package Recursion.strings;

public class PalindromOrNot {
    public static void main(String[] args) {
        String num = "MADAM";
        int n = num.length();
        System.out.println(check(num, 0, n));
    }

    static boolean check(String num, int i, int n){
        if(i >= n/2){
            return true;
        }

        if(num.charAt(i) != num.charAt(n-i-1)){
            return false;
        }

        return check(num, i+1, n);
    }
}
