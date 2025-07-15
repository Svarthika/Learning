package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TasKJul15th_Maps {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("name","varthika");
        m.put("rollno",123);
        m.put("phone", 123456789);

        System.out.println(m);

        Map m1 = new LinkedHashMap();

        m1.put("name","varthika");
        m1.put("rollno",123);
        m1.put("phone", 123456789);

        System.out.println(m1);

        Map m2 = new TreeMap();

        m2.put("name","varthika");
        m2.put("rollno",123);
        m2.put("phone", 123456789);

        System.out.println(m2);

    }
}
