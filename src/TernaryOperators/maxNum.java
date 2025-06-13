package TernaryOperators;

public class maxNum {
    public static void main(String[] args) {
        int a = 30;
        int b= 40;
        int c= 100;
         int MaxNumber;

        System.out.println(a>b?a:b);

        MaxNumber = ((a>b)?((a>c)?a:c):((b>c)?b:c));

        System.out.println("Maximum number is "+MaxNumber);


    }
}
