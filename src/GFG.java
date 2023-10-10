import java.util.*;
import java.io.*;
import java.util.Scanner;
public class GFG {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            boolean result = false;
            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < s1.length(); i++){
                char ch = s1.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                }
                else{
                    map.put(ch, 1);
                }
            }

            for(int i = 0; i < s2.length(); i++){
                char ch = s2.charAt(i);
                if(!map.containsKey(ch)){
                    System.out.println("No");
                    return;
                }
                else {
                    map.put(ch, map.get(ch) - 1);
                }
            }
            Set<Character> keys1 = map.keySet();

            for(Character key : keys1){
                if(map.get(key) != 0){
                    System.out.println("no");
                    return;
                }
            }
            result = true;

            if(result){
                for(int i = 0; i < s1.length(); i++){
                    char ch = s1.charAt(i);
                    if(map.containsKey(ch)){
                        map.put(ch, map.get(ch) + 1);
                    }
                    else{
                        map.put(ch, 1);
                    }
                }
                for(int i = 0; i < s3.length(); i++){
                    char ch = s3.charAt(i);
                    if(!map.containsKey(ch)){
                        System.out.println("No");
                        return;
                    }
                    else {
                        map.put(ch, map.get(ch) - 1);
                    }
                }
                Set<Character> keys2 = map.keySet();

                for(Character key : keys2){
                    if(map.get(key) != 0){
                        System.out.println("no");
                        return;
                    }
                }
                result = true;

            }
            System.out.println(result);



        }
    }

