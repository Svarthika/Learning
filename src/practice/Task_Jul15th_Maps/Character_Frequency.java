package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class Character_Frequency {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            // System.out.println(frequency.getOrDefault(c,0));
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

