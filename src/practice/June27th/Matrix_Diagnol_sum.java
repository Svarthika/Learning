package practice.June27th;

import java.util.Scanner;

public class Matrix_Diagnol_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix m,n");
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] arr = new int[m][n];
        int sum =0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Enter the value at [%d][%d]",i,j);
                arr[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Diagnol Matrix sum"+sum);

    }
}
