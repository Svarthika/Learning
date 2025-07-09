package practice.TaskJul7th;

public class Abstrac_with_Constructor {
    public static void main(String[] args) {
      Staff s = new Staff();
      s.print();
    }
    }
abstract class Employee{
   abstract void print();
   Employee(){
       System.out.println("DC");
   }
}

class Staff extends Employee{

    @Override
    void print() {
        System.out.println("Abstract method implemented");
    }
}
