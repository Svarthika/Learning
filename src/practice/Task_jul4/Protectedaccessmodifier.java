package practice.Task_jul4;

public class Protectedaccessmodifier {
    public static void main(String[] args) {
     dog d = new dog();
     d.doEat();
    }
}

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class dog extends Animal{
    void doEat(){
        super.eat();
    }
}


