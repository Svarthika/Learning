package practice.June27th.set2;

import java.util.Scanner;

public class Determine_Website_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String s = sc.next();

        String[] words =s.split("\\.");

        switch(words[1]){
            case "com" :
                System.out.println("The website type is: Commercial website");
                break;
            case "org" :
                System.out.println("The website type is: Non-profit organization");
                break;
            case "edu" :
                System.out.println("The website type is: Educational institution");
                break;
            case "gov" :
                System.out.println("The website type is: Government website");
                break;
            case "net" :
                System.out.println("The website type is: Network-related website");
                break;
            case "ino" :
                System.out.println("The website type is: Informational website");
                break;
           default :
                System.out.println("The website type is: Unknown or other types of websites");
                break;
        }

    }
}
