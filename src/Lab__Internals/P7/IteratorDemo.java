package Lab__Internals.P7;

import java.util.*;

class IterateDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        Iterator itr = list.iterator();
        System.out.println("Iterator:");
        System.out.println("Forward traversal using Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        ListIterator i = list.listIterator();
        System.out.println("ListIterator:");
        System.out.println("Forward Traversal using List Iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        System.out.println("Backward Traversal using ListIterator: ");
        while (i.hasPrevious()) {
            System.out.print(i.previous() + " ");
        }
        System.out.println();
    }
}
