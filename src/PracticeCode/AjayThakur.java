package PracticeCode;

import java.util.*;
import java.util.Arrays;

public class AjayThakur {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(1);
        System.out.println(list);

        Set<Integer> arrSet = new HashSet<>(list);
        Set<Integer> arrSet1 = new TreeSet<>(list);
        Set<Integer> arrSet2 = new LinkedHashSet<>(list);

        System.out.println(arrSet);
        System.out.println(arrSet1);
        System.out.println(arrSet2);
    }
    }


