package practice.Task_jul11_list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Input_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        String ContinueInput ="y";

        while(ContinueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);
            System.out.println("Enter the Age");
            int age = sc.nextInt();
            ages.add(age);

            sc.nextLine();

            System.out.println("Do you want enetr another records? Y/N");
            ContinueInput = sc.next();


        }

        for (Object o1:names)
        {
            System.out.println(o1);
        }
        for (Object o2:ages)
        {
            System.out.println(o2);
        }
//Scanner.close();
    }

}
