package practice.Task_Jul15th_Maps;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map m = new java.util.HashMap<>();
        m.put("id",1);
        m.put("id",2);
        m.put("id3",13);
        m.put("id4",13);
        m.put("id5",44);
        m.put("id6",16);
        m.put(null,1);
        m.put(null,5);
        m.put("id7",null);
        m.put("id8",null);
        //Hashmap allows multiple null value bit single null key
        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.get("id6"));
        System.out.println(m.remove("id"));
        System.out.println(m.keySet());
    }
}
