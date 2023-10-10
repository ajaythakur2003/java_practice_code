package patternQuestions;

public class Pattern2 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        int originalN = n;
         n = 2 * n;
        for (int rows = 0; rows <= n; rows++) {
            for(int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(rows, col), Math.min(n - rows, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
