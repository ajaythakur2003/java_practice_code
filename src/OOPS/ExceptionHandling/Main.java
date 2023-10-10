package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            int c = a/b;
        }
        catch (Exception e){
            divide(a,b);
        }
        finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
