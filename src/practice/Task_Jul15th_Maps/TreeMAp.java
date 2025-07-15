package practice.Task_Jul15th_Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMAp {
    public static void main(String[] args) {
        Map<String,Integer> tm = new TreeMap();

        tm.put("First",11);
        tm.put("Third",22);
        tm.put("Second",33);

        System.out.println("Tree(Sorted bu keys)" + tm);

       tm.replace("First",1);
       tm.replace("Second",2);




    }
}
