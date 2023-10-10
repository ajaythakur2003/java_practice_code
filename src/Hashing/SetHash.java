package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class SetHash {
    public static void main(String[] args) {
        //Creatng(same as ArrayList)(.add())
        HashSet<Integer> set = new java.util.HashSet<>();

        //insert
        set.add(1);
        set.add(5);
        set.add(8);
        set.add(1);
        //stores only unique values, so will appear only one time

        //size(.size())
        System.out.println(set.size());


        //print all elements
        System.out.println(set);


        //Iterator
        Iterator it = set.iterator();
        //.next - points to the next value in set
        //.hasNext - returns true if there are values next to it and false if there is no next value

        while(it.hasNext()){
            System.out.println(it.next());
        }


        //search(.contains())
        if(set.contains(1)){
            System.out.println("contains element");
        }
        if(!set.contains(6)){
            System.out.println("Does not contains element");
        }

        //remove (.remove())
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("element is removed");
        }

    }
}
