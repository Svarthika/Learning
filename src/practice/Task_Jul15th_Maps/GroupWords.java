package practice.Task_Jul15th_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWords {
    public static void main(String[] args) {
        String[] input = {"Java", "is", "fun", "cool", "Hi"};
        Map<Integer, List<String>> groupwords = new HashMap<>();
        //List<String> newlist = new ArrayList();


        for (String word : input) {
            Integer size = word.length();

            //if the length not present crear a entry eith length and new list
            if (!groupwords.containsKey(size)) {
                groupwords.put(size, new ArrayList());
            }
// return the list and add word to it
              groupwords.get(size).add(word);

        }

        for(Map.Entry<Integer, List<String>> entry :groupwords.entrySet()){
            System.out.println(entry.getKey() +"  --  " +entry.getValue());
        }
    }
}
