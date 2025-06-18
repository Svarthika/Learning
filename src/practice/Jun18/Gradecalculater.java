package practice.Jun18;

import java.util.Scanner;

public class Gradecalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score;
        while(true){
            if(sc.hasNextInt()){
                 score = sc.nextInt();
                 break;
            }
            else{
                System.out.println("Enter valid score");
                sc.next();
            }
        }


       if(score>=90 && score<=100){
           System.out.println("Grade A");
       }
       else if(score>=80 && score<=89){
           System.out.println("Grade B");
       }
       else if(score>=70 && score<=79){
           System.out.println("Grade C");
       }
       else if(score>=60 && score<=69){
           System.out.println("Grade D");
       }
       else if(score>=0 && score<=59){
           System.out.println("Grade E");
       }
       else {
           System.out.println("Not a valid score");
       }

    }
}
