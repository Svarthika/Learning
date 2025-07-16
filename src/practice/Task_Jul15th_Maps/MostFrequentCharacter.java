package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "aaaabbbccccccc";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char frequentchar = 0;
        Integer maxcount = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxcount) {
                maxcount = entry.getValue();
                frequentchar= entry.getKey();

            }
            
        }
        System.out.println(frequentchar+ "  -->  " +maxcount);


        }
    }

