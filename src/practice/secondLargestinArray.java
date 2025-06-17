package practice;

import java.util.Arrays;

public class secondLargestinArray {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Using for loop to traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }


        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {12, 14, 17, 17, 56, 03};
        int secondLargest = findSecondLargest(arr);

        if (secondLargest != Integer.MIN_VALUE)
            System.out.println("Second largest number: " + secondLargest);
        else
            System.out.println("No second largest number found.");

        System.out.println("***** second method*********");
           Arrays.sort(arr);
           for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}
           int seclargest = Integer.MIN_VALUE;
           int largest = arr[arr.length-1];
           for(int i= arr.length-2; i>=0;i--){
               if(arr[i]!=largest) {
                   seclargest = arr[i];

                   break;
               }
           }

        System.out.println(seclargest);
    }


}
