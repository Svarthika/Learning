package practice.Task_Jul15th_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name", "Diwakar");
        student1.put("phone", 343456789);
        student1.put("City", "Hyderabad");
        student1.put("postal", "500005");


        Map<String,Object> student2 = new HashMap<>();
        student2.put("name", "Shanker");
        student2.put("phone", 453456789);
        student2.put("City", "Hyderabad");
        student2.put("postal", "500090");

        List Students_list = new ArrayList();
        Students_list.add(student1);
        Students_list.add(student2);

        System.out.println(Students_list);

            }


}
