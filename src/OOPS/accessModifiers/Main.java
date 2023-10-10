package OOPS.accessModifiers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        A obj = new A(30, "Ajay Thakur");
//        System.out.println(obj.getNum());
//
//        obj.setNum(10);
//        System.out.println(obj.getNum());
//        StringBuilder s = new StringBuilder();
//                s.append(22);
//                s.append(23);
//        System.out.println(s);

        String a = "22";
        String b = "3";

//        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
//        String c = a.concat("b");
//        System.out.println(c);
//        int t = I;
//        System.out.println(t);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        System.out.println(map.get('D'));


    }
}
