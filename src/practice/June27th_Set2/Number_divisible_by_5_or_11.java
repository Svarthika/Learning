package practice.June27th_Set2;

import java.util.Scanner;

public class Number_divisible_by_5_or_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();

        if(num%5==0&&num%11==0){
            System.out.println("Number is divisble by 5 & 11");
        }
        else if(num%5==0){
            System.out.println("Number is divisble by 5");
        }
        else if(num%11==0){
            System.out.println("Number is divisble by 11");
        }
        else
            System.out.println("Number is not dovisible by 5 or 11");
    }



}
