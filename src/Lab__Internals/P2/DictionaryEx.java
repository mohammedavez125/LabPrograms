package Lab__Internals.P2;

import java.util.*;

/*
B) Write a Java program to illustrate Legacy classes like Vector, Hash table,
        Dictionary & Enumeration interface.
*/

class DictionaryEx {
    public static void main(String[] args){
        //creating a dictionary
        Dictionary<Integer, String> dict = new Hashtable<Integer, String>();
        //adding values in the dictionary
        dict.put(101, "Sydney");
        dict.put(102, "Brisbane");
        dict.put(103, "Melbourne");
        dict.put(104, "Perth");
        dict.put(105, "Lismore");
        System.out.println("Dictionary keys are: \n");
        //loop iterate over the keys stored in the dictionary
        Enumeration e = dict.keys();
        while (e.hasMoreElements()) {
            //prints the keys
            System.out.println(e.nextElement());
        }
        System.out.println("Dictionary values are: \n");
        //loop iterate over the values stored in the dictionary
        for (Enumeration enm = dict.elements(); enm.hasMoreElements(); ) {
            //prints the value
            System.out.println(enm.nextElement());
        }
    }
}

