package practice.Task_Exceptions;

public class Throw_Exception {
    public static void main(String[] args) {
        divideByZero(0);
    }

    static void divideByZero(int a) {
        if (a == 0) {
            throw new ArithmeticException("Error a == 0");
        }
    }
}
