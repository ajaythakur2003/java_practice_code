import java.util.Scanner;

public class NewQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if(s == 1) System.out.println(1);

        while(true){
            int sum = 0;
            int first = 2;
            int second = 3;

//            StringBuilder temp = new StringBuilder();
            String temp1 = String.valueOf(first);
            String temp2 = String.valueOf(second);
//            temp.append(first);
//            temp.append(second);
            String temp3 = temp1.concat(temp2);
            int n = temp3.length();
            while(n >= 0){
                int t = Integer.parseInt(temp3.substring(n));
                sum += t;
                n--;
            }
            if(sum == s) {
                System.out.println(first);
                break;
            }
            else if (sum < s) {
                first++;
                second++;
            }
            else {
                System.out.println("false");
                break;
            }

        }



    }

}

