package PracticeCode;

import java.util.HashSet;
public class MissingNum {
    public static void main(String[] args) {
        int N = 5;
        int A[] = {1, 5, 3, 2, 4};
        System.out.println(missingNumber(A,N));
    }

    public static int missingNumber(int A[], int N)
    {
        // Your code goes here

        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<N;i++){
            hash.add(A[i]);
        }
        int c=1;
        for(int i=0;i<N;i++){
            if(!hash.contains(c)){
                return c;
            }
            c++;
        }
        return c;
    }
}
