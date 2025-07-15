package practice.MyPractice;

import java.util.Scanner;

public class StringReverse {
    String stringReverse = "";
    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        System.out.println(c.length);
         reverseWords(c);
        System.out.println(c);

    }

    public static void reverseWords(char[] sentence){

        //reverse the entire sentence
        reverse(sentence,0,sentence.length-1);

      int start =0;
      for(int end=0;end<sentence.length;end++){
          if(sentence[end]==' '){
              //reverse correct word
              reverse(sentence,start,end-1);
              start=end+1;
          }
      }
//reverse last word
        reverse(sentence, start, sentence.length-1);
    }

    public static void reverse(char[] arr, int i, int j) {
        char temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}
