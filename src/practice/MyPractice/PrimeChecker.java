package practice.MyPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeChecker {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (isprimeChecker(num)){
            System.out.println(" is Prime number");
        }
        else
        {
            System.out.println("Is not a Prime number");
        }


    }




static boolean isprimeChecker(int num){
    if(num<=1)
        return false;
    if(num<=2 || num<=3)
        return true;
   if(num%2==0||num%3==0)
       return false;

   for(int i=5; i<Math.sqrt(num);i+=6){
            if(num%i==0){
                return false;
            }
            break;

        }
    return true;
    }

}
