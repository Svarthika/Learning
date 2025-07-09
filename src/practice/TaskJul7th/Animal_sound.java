package practice.TaskJul7th;

public class Animal_sound{
    public static void main(String[] args) {
        dog d= new dog();
        cat c= new cat();
        d.makeSound();
        c.makeSound();

    }
}

abstract class Animal {
    abstract void makeSound();
}

class dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Braks!!");
    }
}

class cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat Meows!!");
    }
}
