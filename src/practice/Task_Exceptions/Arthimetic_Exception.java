package practice.Task_Exceptions;

public class Arthimetic_Exception {
    public static void main(String[] args) {
        int a =100;
        try{
            int c= a/0;
        }
        catch(ArithmeticException  e){

            System.out.println("Division by Zero not allowed");
        }


    }
}
