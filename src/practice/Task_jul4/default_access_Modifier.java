package practice.Task_jul4;

public class default_access_Modifier {

        public static void main(String[] args) {
            user_Login u1 = new user_Login();
            u1.display("test1",1203);

        }

    }
    class user_Login {
         String user_name;
         int user_id;

         void display(String username, int user_id){
             System.out.println(username);
             System.out.println(user_id);
         }
        }
