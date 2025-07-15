package practice.Task_jul11_list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
//print the list elements
        System.out.println(l);
//Reverse the linked list
        Collections.reverse(l);
        System.out.println(l);
           }
}
