package Lab__Internals.P8;
import java.util.*;

class TM {
    public static void main(String[] args){
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();//Creating HashMap
        tm.put(101, "Mango"); //Put elements in Map
        tm.put(21, "Apple");
        tm.put(30, "Banana");
        tm.put(101, "Grapes"); //trying duplicate key
        System.out.println(tm);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        tm.remove(101);
        System.out.println(tm);
    }
}