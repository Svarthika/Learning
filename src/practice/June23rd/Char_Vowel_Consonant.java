package practice.June23rd;

import java.util.Scanner;

public class Char_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = sc.next().toLowerCase().charAt(0);
        switch(c){
            case 'a','e','i','o','u':
                System.out.println("character is vowel");break;
            default:
                System.out.println("Character is constant");break;
        }
    }
}
