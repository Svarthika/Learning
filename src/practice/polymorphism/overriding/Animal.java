package practice.polymorphism.overriding;

public class Animal {
    void sound(){
        System.out.println("Animal Sound!!");
    }
    }

    class dog extends Animal{
        public static void main(String[] args) {
            dog d = new dog();
            d.sound();
        }
    void sound(){
        System.out.println("Bark");
    }
    }

class cat extends Animal{
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
    }
    void sound(){
        System.out.println("Meow");
    }
}

class cow extends Animal{
    public static void main(String[] args) {
        cow c = new cow();
        c.sound();
    }
    void sound(){
        System.out.println("Moo");
    }
}

