package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> vehicles = new HashMap();
        vehicles.put("Tesla", 2);
        vehicles.put("I10", 3);
        vehicles.put("Honda", 5);
        vehicles.put("BMW", 2);
        vehicles.put("Baleno", 1);
        vehicles.put("Baleno", 2);
        //override the latest key value

        System.out.println("total vehicles  "+vehicles.size());

        //Iterator over map
        for(String key: vehicles.keySet()){
            System.out.println(key +" --> " +vehicles.get(key));
        }

        System.out.println(vehicles.containsKey("audi"));

        vehicles.clear();
        System.out.println(vehicles.size());

    }
}
