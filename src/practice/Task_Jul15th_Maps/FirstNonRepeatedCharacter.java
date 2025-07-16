package practice.Task_Jul15th_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String input = "aabbccdeefferrttyuuiio";
        
        Map<Character, Integer> frequency = new LinkedHashMap();
        
        for(char c: input.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c,0) + 1);
        }
        
        for(Map.Entry<Character,Integer> ch :  frequency.entrySet()){
            if(ch.getValue()==1){
                System.out.println("Non Repeated character: " +ch.getKey());
            }
        }
    }
}
