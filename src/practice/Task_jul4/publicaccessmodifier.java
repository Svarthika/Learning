package practice.Task_jul4;

public class publicaccessmodifier {
    public static void main(String[] args) {
     student s = new student();
     s.showInfo();
    }
}

class student{
   public void showInfo(){
        System.out.println("Public Access: Student Info");
    }
}


