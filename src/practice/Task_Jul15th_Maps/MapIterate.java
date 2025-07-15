package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<>();
        m.put("id",1);
        m.put("id",2);
        m.put("id3",13);
        m.put("id4",13);
        m.put("id5",44);
        m.put("id6",16);
        m.put(null,1);

        for(Map.Entry<String,Integer> item: m.entrySet()){
            System.out.println(item.getKey()+" -->  "+item.getValue());

        }
    }
}
