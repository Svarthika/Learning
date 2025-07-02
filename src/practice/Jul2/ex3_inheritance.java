package practice.Jul2;

public class ex3_inheritance {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();

    }
}

class SuperAdmin extends AdminUser {
    void shutdownSystem()
    {
        System.out.println("shut down system");
    }
}
class User {
    void login(){
        System.out.println("user logged in");
    }
}
class AdminUser extends User{
    void accessAdminPanel()
    {
        System.out.println("admin panel");
    }
}