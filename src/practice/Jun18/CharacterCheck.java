package practice.Jun18;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = sc.next().toLowerCase().charAt(0);

        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Character is vowel");
                break;
            default:
                System.out.println("charcter is not vowel");
                break;
        }


    }
}
