package practice.polymorphism.overriding;

public class Employee {
    void role(){
        System.out.println("General Employee");
    }
}

class manager {
    public static void main(String[] args) {
        manager m = new manager();
        m.role();
    }
    void role(){
        System.out.println("Manager");
    }
}

class clerk{
    public static void main(String[] args) {
        clerk c = new clerk();
        c.role();
    }
    void role(){
        System.out.println("Clerk");
    }
}

class Tester{
    public static void main(String[] args) {
        Tester t = new Tester();
        t.role();
    }
    void role(){
        System.out.println("Tester");
    }
}

