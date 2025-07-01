package practice.June27th_Set2;

import java.util.Scanner;

public class Age_classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int Age = sc.nextInt();

        if (Age <= 12) {
            System.out.println("is Child");
        } else if (Age >= 13 && Age <= 19) {
            System.out.println("is Teenager");
        } else if (Age >= 20 && Age <= 64) {
            System.out.println("is Adult");

        }
        else {
            System.out.println("is Senior Citizen");
        }
    }
}