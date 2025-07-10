package practice.Task_Exceptions;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        int a=100;
        try{
            a=a/0;
        }
      catch(ArithmeticException e){
          System.out.println("Division by Zero");
        }
        try {
            System.out.println(args[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of Bound exception");
        }

    }

    public static class Throw_Exception {
        public static void main(String[] args) {
            divideByZero(0);

            }
        static void divideByZero(int a ){
            if(a ==0){
                throw new ArithmeticException("Error a == 0");
            }
        }
    }
}
