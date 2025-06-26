package practice;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {2,0,1,4};
        int[] arr2 = new int[arr1.length] ;
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);


        }
        Arrays.sort(arr1);
        System.arraycopy(arr1,0, arr2 ,0,arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);



        }


       //for Interger data type
        // Arrays.sort(arr1,Comparator.reverseOrder());


    }
}
