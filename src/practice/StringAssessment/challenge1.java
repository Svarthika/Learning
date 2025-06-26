package practice.StringAssessment;

import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1");
        String s1= sc.next();
        System.out.println("Enter the string2");
        String s2 = sc.next();
        String s3 = s1+" ".concat(s2);
        System.out.println(s3);
        System.out.println("String length"+s3.length());
        System.out.println("Substring:"+s3.substring(6,11));
        System.out.println("First Character:"+s3.charAt(0));



    }
}
