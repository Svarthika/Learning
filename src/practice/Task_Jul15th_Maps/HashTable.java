package practice.Task_Jul15th_Maps;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable();
//Synchronised----Thread safe
        ht.put(1,"one");
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");

        //hashtable does not allow null value/key -nullpointer exception
        //hash map - null key, multiple null values

        System.out.println(ht);

        //hashtable is legacy class --- enumeration is available

        Enumeration<Integer> e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



    }
}
