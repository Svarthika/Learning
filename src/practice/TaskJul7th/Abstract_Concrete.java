package practice.TaskJul7th;

public class Abstract_Concrete {
    public static void main(String[] args) {
        child c= new child();
        c.show();
        c.display();

        }
    }

abstract class parent{
    abstract void show();
    void display(){
        System.out.println("This class has abstract and concrete methods");
    }
}

class child extends parent{

    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}
