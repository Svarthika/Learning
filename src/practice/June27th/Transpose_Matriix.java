package practice.June27th;

import java.util.Scanner;

public class Transpose_Matriix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Size of Matrix m,n");
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] arr1 = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Enter the value for [%d],[%d]/t", i,j);
                arr[i][j]= sc.nextInt();

            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"||");
                  }
            System.out.println();
        }

int temp;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[j][i]= arr[i][j];;
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

    }
}
