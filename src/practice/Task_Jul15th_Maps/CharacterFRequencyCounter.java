package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class CharacterFRequencyCounter {
    public static void main(String[] args) {
        String input = "aabbccddeeff";
        Map<Character, Integer> Frequency = new HashMap();

        for(char c:input.toCharArray()){
            Frequency.put(c, Frequency.getOrDefault(c,0)+1);
       }

/*
        for(Character  key:Frequency.keySet()){
            System.out.println(Frequency.get(key));

        }
*/

        for(Map.Entry<Character, Integer> value: Frequency.entrySet()){
            System.out.println(value.getKey()+" -->  "+value.getValue());
        }
    }
}
