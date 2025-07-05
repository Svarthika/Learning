package practice.Task_jul4;
public class private_AccessModifier_example{
    public static void main(String[] args) {
        User_Login u1 = new User_Login();
         u1.setUser_name("test1");
        System.out.println("USername\t"+u1.getUser_name());
        u1.setPassword("123456",false);
        System.out.println("Pasword\t"+u1.getPassword());
    }

}
 class User_Login {
    private String user_name;
     private String password;

     public String getUser_name() {
         return user_name;
     }

     public void setUser_name(String user_name) {
         this.user_name = user_name;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password, boolean adminuser) {
        if(adminuser) this.password = password;
                else System.out.println("Not a Admin user");
     }

}
