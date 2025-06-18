package practice.June17;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
                       while (true) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break;
            } else {
                System.out.println("Enter the valid integer number");
                sc.next();
            }
        }

        long factorial = 1;
        if (num < 0) {
            System.out.println("Factorial is not allowed for negative integers");
            return;
        }

        if (num == 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;

            }
        }

        System.out.println(factorial);
    }


}
