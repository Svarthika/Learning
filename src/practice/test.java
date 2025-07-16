package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test
{
    public static void main(String[] args)
    {
        // Input list of words
        String[] words = {"Java", "is", "fun", "cool", "Hi"};

        // Map to store length as key and list of words as value
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        // Loop through each word
        for (String word : words)
        {
            int length = word.length();

            // If the length already exists, add the word to the list
            if (!lengthMap.containsKey(length))
            {
                lengthMap.put(length, new ArrayList<>());
            }

            lengthMap.get(length).add(word);
        }

        // Print the grouped words
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}