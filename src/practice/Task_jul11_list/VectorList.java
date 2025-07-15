package practice.Task_jul11_list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");
        vector.add("Item6");
// listiterator available for list only
        // listIterator has previous value
        ListIterator listIterator = vector.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        Iterator iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
