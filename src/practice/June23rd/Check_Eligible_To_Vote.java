package practice.June23rd;

import java.util.Scanner;

public class Check_Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else
        {
            System.out.println("Not eligible or vote");
        }
    }
}
