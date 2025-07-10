package practice.Task_Exceptions;

public class Mutiple_TryCatch {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            a=a/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
        

    }
}
