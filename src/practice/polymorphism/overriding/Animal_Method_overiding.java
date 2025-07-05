package practice.polymorphism.overriding;


public class Animal_Method_overiding {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        cat c = new cat();
        c.sound();
        cow c1 = new cow();
        c1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Sound!!");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class cow extends Animal {
    void sound() {
        System.out.println("Moo");
    }
}

