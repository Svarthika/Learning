package practice.Task_Exceptions;

public class Generic_exception {
    public static void main(String[] args) {
        int a=100;
        try{
            a=a/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero not allowed");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
