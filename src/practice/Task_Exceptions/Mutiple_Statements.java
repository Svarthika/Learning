package practice.Task_Exceptions;

public class Mutiple_Statements {
    public static void main(String[] args) {
        int a =100;
        int b=0;
        int c=10;

        try{
            a=a/b;
            a=a+b+c;
            System.out.println(a);
            c=c/10;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not possible");
        }
    }
}
