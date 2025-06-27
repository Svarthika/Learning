package practice.June23rd;

import java.util.Scanner;

public class Smallest_of_2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2");
        int num2 = sc.nextInt();

        if(num2<num1){
            System.out.println(num2+ " is Smaller");
        }
        else if(num1==num2)
        {
            System.out.println("Numbers are equal");
        }
        else
            System.out.println(num1+" is smaller");
    }
    }

