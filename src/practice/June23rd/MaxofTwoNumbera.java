package practice.June23rd;

import java.util.Scanner;

public class MaxofTwoNumbera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Number 1 is greater");
        }
        else if(num1==num2)
        {
            System.out.println("Numbers are equal");
        }
        else
            System.out.println("Number 2 is greater");
    }
}
