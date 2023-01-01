package Lab__Internals.P2;

import java.util.*;
class HTDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(100,"Amit");
        ht.put(102,"Ravi");
        ht.put(101,"Vijay");
        ht.put(103,"Rahul");
        System.out.println(ht);
        for(int i:ht.keySet()) {
            System.out.println(i+" "+ht.get(i));
        }
        ht.remove(101);
        System.out.println(ht);
        System.out.println(ht.get(100));
        System.out.println(ht.isEmpty());
        System.out.println(ht.keySet());
        System.out.println(ht.values());
    }
}

