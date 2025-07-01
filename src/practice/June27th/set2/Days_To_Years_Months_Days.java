package practice.June27th.set2;

import java.util.Scanner;

public class Days_To_Years_Months_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days");
        int days = sc.nextInt();
        int years;
        int months;

            years = days / 365;
            days = days%365;
            months = days/30;
            days=days%30;

        System.out.println("No of years"+years);
        System.out.println("No of months"+months);
        System.out.println("No of days"+days);

    }
}
