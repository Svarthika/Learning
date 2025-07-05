package practice.polymorphism.overloading;

public class Max_number {
    public static void main(String[] args) {
        maximum m = new maximum();
        System.out.println(m.max(87,98));
        System.out.println(m.max(45,87,65));
        System.out.println(m.max(87.98d, 98.09d));
    }
}
class maximum{
    int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

    int max(int a, int b, int c){
        if(a>b && a>c)
            return a;
        else if(b>c && b>a)
            return b;
        else
            return c;
    }

    double max(double a, double b){
        if(a>b)
            return a;
        else
            return b;
    }
}
