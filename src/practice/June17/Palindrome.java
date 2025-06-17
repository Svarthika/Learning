package practice.June17;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
//using for loop
        if(isPalindrome(str)) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");

        }
/// using Rever string method
        if(palindrome1(str)) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");

        }
    }

    public static boolean isPalindrome(String input)
    {
       input = input.toLowerCase();
       for(int i=0;i<input.length()/2;i++){
           char first = input.charAt(i);
           char last= input.charAt(input.length()-1-i);
           if(first!=last){
               return false;
           }
       }
        return true;
    }

    public static boolean palindrome1(String s){
        String revStr = new StringBuilder(s).reverse().toString();
        if(s.equals(revStr)) {
            return true;
        }
        return false;


    }

}
