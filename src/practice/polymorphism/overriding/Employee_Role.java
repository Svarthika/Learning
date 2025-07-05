package practice.polymorphism.overriding;

public class Employee_Role {
    public static void main(String[] args) {
        manager m = new manager();
        m.role();
        clerk c = new clerk();
        c.role();
        Tester t = new Tester();
        t.role();
    }
}

class Employee {
    void role() {
        System.out.println("General Employee");
    }
}

class manager {

    void role() {
        System.out.println("Manager");
    }
}

class clerk {

    void role() {
        System.out.println("Clerk");
    }
}

class Tester {
    void role() {
        System.out.println("Tester");
    }
}

