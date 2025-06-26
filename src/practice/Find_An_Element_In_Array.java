package practice;

import java.util.Scanner;

public class Find_An_Element_In_Array {
    public static <scanner> void main(String[] args) {
        int[] a = {23,43,45,67,87,80};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be Found");
        int b=sc.nextInt();

        for(int i=0;i<a.length-1;i++){
            if(a[i]==b){
                System.out.println("Element is found at index "+i);
            }
        }
    }
}
