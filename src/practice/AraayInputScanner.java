package practice;

import java.util.Scanner;

public class AraayInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the element at"+i);
            a[i]= sc.nextInt();
            }
        for(int i=0;i<size;i++){
            System.out.println(a[i]);

        }



    }
}

