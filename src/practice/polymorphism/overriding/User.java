package practice.polymorphism.overriding;

public class User {
    void login(){
        System.out.println("user login");
    }
}

 class Adminuser extends User {
    public static void main(String[] args) {
        User u = new Adminuser();
        u.login();
   }
    void login(){
        System.out.println("Admin userLogin");
    }
}

 class RegularUser extends User {
    public static void main(String[] args) {
        User u = new RegularUser();
            u.login();
        }

    void login(){
        System.out.println("Regular userLogin");
    }
}
