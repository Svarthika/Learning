package practice.Task_jul11;

import java.util.ArrayList;

public class ArrayList_RemoveIItem {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Amit");
        l.add("Neha");
        l.add("Suresh");

        System.out.println(l);

        l.remove("Neha");
        System.out.println(l);
    }
}
