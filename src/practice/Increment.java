package practice;

public class Increment {
    public static void main(String[] args) {

        int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);
        int x = 5;

        System.out.println(x++ + ++x);

        int i = 1;

        i = i++ + ++i;

        System.out.println("i:"+ i);

        int y = 5;

        System.out.println(++y); // Output: ?

        System.out.println(y++); // Output: ?

        System.out.println("y:"+y);

        int a1 = 5;

        int b1 = a1++ + ++a1;

        System.out.println("a: " + a1); // Output: ?

        System.out.println("b: " + b1); // Output: ?

        int x1 = 5;

        int y1 = x1++ + ++x1 + x1++ + ++x1;

        System.out.println("x = " + x1 + ", y = " + y1);
    }
}
