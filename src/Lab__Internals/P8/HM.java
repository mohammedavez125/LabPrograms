package Lab__Internals.P8;

/*
B) Write a Java program to illustrate collection classes like Array List,
    Linked List, Tree map and Hash map.
*/

import java.util.*;
class HM {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>(); //Creating HashMap
        hm.put(101, "Mango"); //Put elements in Map
        hm.put(21, "Apple");
        hm.put(30, "Banana");
        hm.put(101, "Grapes"); //trying duplicate key
        System.out.println(hm);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
