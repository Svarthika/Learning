package practice.Task_jul11;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayLIst_LinkedList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        LinkedList l = new LinkedList();

        //Arraylist performance time
        long ArrayListstart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
          a.add(i);
        }
        long ArrayListEnd = System.currentTimeMillis();
        long duration1 = ArrayListEnd-ArrayListstart;
        System.out.println("Time taken for Array List: "+duration1);

        long LinkedListStart = System.currentTimeMillis();
        for(int i=0; i<100000;i++){
              l.add(i);
        }

        long LinkedListEnd = System.currentTimeMillis();
        long duration2 = LinkedListEnd-LinkedListStart;
        System.out.println("Time taken for LinkedList: "+duration2);
    }
}
