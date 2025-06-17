package practice.June17;

import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        str.toLowerCase();
        int vowelCount =0;
        int cosonantCount=0;
        for(int i=0;i<str.length();i++){
         char c =str.charAt(i);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
             vowelCount=vowelCount+1;
         }
         else
             cosonantCount=cosonantCount+1;
        }

        System.out.println("No of Vowels in "+str+"\t"+vowelCount);
        System.out.println("No of consonants in "+str+"\t"+cosonantCount);
    }
}
