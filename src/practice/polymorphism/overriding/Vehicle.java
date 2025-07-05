package practice.polymorphism.overriding;

public class Vehicle {
    void start(){
        System.out.println("start the vehicle");
    }
}

class bike extends Vehicle{
    public static void main(String[] args) {
        bike b = new bike();
        b.start();
    }

    void start(){
        System.out.println("Kick start the bike");
    }
}

class car extends Vehicle{

    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
