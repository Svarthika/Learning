package practice.Generics;

public class GenericDemo {
    public static void main(String[] args) {
        display(3,6,8);
        display(4.54,6.45,8.56);
        display("test", "user","new");

    }

    static <T> T display(T a, T b, T c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return null;

    }
}
