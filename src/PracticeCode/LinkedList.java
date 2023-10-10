package PracticeCode;

public class LinkedList {
    public static void main(String[] args){
        int a = 2048;
        int sum = 0;
        foo(a,sum);
        System.out.println(sum);

    }

    private static void foo(int n, int sum) {
        int k = 0, j = 0;
        if(n == 0) {
            return;
        }
            else{
                k = 4;
                j = 2;
                sum = sum + k;
                foo(j, sum);
            }
        System.out.println(k);
        }

}


