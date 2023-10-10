package bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int number = 3452;
        int base = 10;

        int ans = (int)((Math.log(number) / Math.log(base)) + 1);
        System.out.println(ans);
    }
}
