package practice.Task_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
// no order no duplicates (overridden by latest value)
        hs.add("varthy");
        hs.add("varthy");
        hs.add("Mengji");
        System.out.println(hs);
        //order is maintained no duplicate
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Watermelon"));
        System.out.println(lhs.size());
      //naturally sorted
        //null not allowed
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("Watermelon");
        ts.add("apple");
        System.out.println(ts);

        System.out.println(ts.isEmpty());
        System.out.println(ts.contains("Watermelon"));
        System.out.println(ts.size());




    }
}
