package practice.Task_Jul15th_Maps;

import java.util.HashMap;
import java.util.Map;

public class FliterStudentsbyA {
    public static void main(String[] args) {
        Map<Integer,String> FilterAWords = new HashMap<>() ;

        FilterAWords.put(101,"Anjali");
        FilterAWords.put(102,"Dipak");
        FilterAWords.put(103,"Aman");
        FilterAWords.put(104,"Ravi");
        FilterAWords.put(105,"Archana");
        FilterAWords.put(106,"amit");
        System.out.println("Students with names starting with 'A':");
        for(Integer Rollno: FilterAWords.keySet()){
            String Name = FilterAWords.get(Rollno);
            if(Name.charAt(0)=='A'||Name.charAt(0)=='a'){
                System.out.println(Rollno+ " --> "+Name);
            }

        }

        //Alternate way

         for(Map.Entry<Integer,String> entry: FilterAWords.entrySet()){

             if(entry.getValue().startsWith("A")||entry.getValue().startsWith("a")){
                 System.out.println(entry.getKey() + " -> " + entry.getValue());
             }
         }
    }
}
