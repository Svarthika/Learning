package practice.Task_Exceptions;

import java.util.Scanner;

public class Try_Finally_Executes {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num and1 num2");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
       try{
           num1 =num1/num2;
        }
       catch(ArithmeticException e){
           System.out.println("Divide by Zero");
       }
       finally{
           System.out.println("Finally block executed");
       }
    }
}
