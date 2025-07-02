package practice.Jul2nd;

public class ex1_Animal_Sound {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.makesound();
        c1.makeSound();
        c1.meow();
        Animal_Sound_simulator c2 = new cat();
        c2.makeSound();

    }
}

class Animal_Sound_simulator {
    void makeSound(){
        System.out.println("animal sound parent");
    }
}

class cat extends Animal_Sound_simulator {

    void meow(){
        System.out.println("Meow Meow");

    }
    void makesound(){
        System.out.println("animal sound child");

    }
}
