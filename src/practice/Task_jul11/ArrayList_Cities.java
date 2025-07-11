package practice.Task_jul11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Cities {
    public static void main(String[] args) {
        ArrayList a =new ArrayList();
        a.add("Mumbai");
        a.add("Delhi");
        a.add("pune");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = sc.next();


        if(city.equals("pune")){
            System.out.println("Pune city is present");
        }
        else{
            System.out.println("Not present in list");
        }


    }

    static void CheckCityPresent(String city){
        if (city.equals("pune")){
            System.out.println("Pune City is presenr");
        }

    }
}
