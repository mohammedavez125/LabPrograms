package Lab__Internals.P2;

import java.util.*;
class VDemo
{
    public static void main(String[] args)
    {
        // initial size is 3, increment is 2
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after four additions: " + v.capacity());
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
    }
}
