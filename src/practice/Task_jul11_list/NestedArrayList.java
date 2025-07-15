package practice.Task_jul11_list;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayList {
    public static void main(String[] args) {
        List lfruit1 = new ArrayList();
        lfruit1.add("Mango");
        lfruit1.add("Banana");
        lfruit1.add("Orange");
        System.out.println(lfruit1);

        List lfruit2 = new ArrayList();
        lfruit2.add("Kiwi");
        lfruit2.add("Apple");
        lfruit2.add("Cherry");
        System.out.println(lfruit2);
        List lVegetables = new ArrayList();
        lVegetables.add("Carrot");
        lVegetables.add("LadyFinger");
        lVegetables.add("Lemon");
        System.out.println(lVegetables);
        List all_lists = new ArrayList();
        all_lists.add(lfruit1);
        all_lists.add(lfruit2);
        all_lists.add(lVegetables);

        System.out.println(all_lists);
        System.out.println(all_lists.get(2));
    }


}
