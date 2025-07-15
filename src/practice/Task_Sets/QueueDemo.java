package practice.Task_Sets;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Varthika");
        pq.add("surthy");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        Queue<Integer> q = new LinkedList();
        q.add(6);
        q.add(3);
        q.add(1);

        Iterator<Integer> iterator = q.iterator();
        while(iterator.hasNext()){
            Integer value =iterator.next();
            System.out.println(value);

            //ArrayDeque

            ArrayDeque<Integer> ad = new ArrayDeque<>();
            ad.add(23);
            ad.add(34);
            System.out.println(ad);
            System.out.println(ad.peek());
            System.out.println(ad.poll());
            System.out.println(ad);

        }

    }
}
