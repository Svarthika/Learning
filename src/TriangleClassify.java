import java.util.Scanner;

public class TriangleClassify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the 3 sides of Triagnle");
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("isosceles  Triangle");
        } else {
            System.out.println("scalene Triangle - No sides equal");
        }


    }
}
