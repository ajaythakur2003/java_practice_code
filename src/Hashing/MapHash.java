package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {
               //<Key , Value>
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 141);
        map.put("US", 120);
        map.put("China", 100);

        System.out.println(map);

        //Search
        // for key search (.containsKey())
        if(map.containsKey("India")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        //for value search (.get())
        System.out.println(map.get("India"));  // print the value of the key
        System.out.println(map.get("Indonesia")); // print null because key is not in map


        //Iteration in HashMap
        for(Map.Entry<String, Integer> elmt : map.entrySet()){
            System.out.println(elmt.getKey()); //print the keys present in map one by one
            System.out.println(elmt.getValue());//print the values present in the map one by one
        }

        //remove (.remove(keyName))
        map.remove("China");//remove the key and value from the map
        System.out.println(map);
    }
}
