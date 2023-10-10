package patternQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < rows - 1; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }

}
