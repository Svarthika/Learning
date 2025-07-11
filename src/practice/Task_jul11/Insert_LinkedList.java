package practice.Task_jul11;

import java.util.LinkedList;

public class Insert_LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Apple");
        l.add("Banana");
        l.add("Mango");

        System.out.println(l);

        l.add(0,"Orange");
        System.out.println(l);
    }
}
