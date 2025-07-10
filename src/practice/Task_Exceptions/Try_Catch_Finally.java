package practice.Task_Exceptions;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        int a =100;
        try {
            a= a/0;
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero");
        }
        finally {
            System.out.println("Finally block is executed");
        }

    }
}
