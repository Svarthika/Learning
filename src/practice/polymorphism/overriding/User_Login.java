package practice.polymorphism.overriding;

public class User_Login {

    public static void main(String[] args) {
        User u1 = new Adminuser();
        u1.login();
        User u2 = new RegularUser();
        u2.login();
    }
}

class User {
    void login() {
        System.out.println("user login");
    }
}

class Adminuser extends User {
    void login() {
        System.out.println("Admin userLogin");
    }
}

class RegularUser extends User {
    void login() {
        System.out.println("Regular userLogin");
    }
}
