package practice.polymorphism.overriding;

public class Vehicle_Overriding {
    public static void main(String[] args) {
        bike b = new bike();
        b.start();
        car c = new car();
        c.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("start the vehicle");
    }
}

class bike extends Vehicle {
    void start() {
        System.out.println("Kick start the bike");
    }
}

class car extends Vehicle {
    void start() {
        System.out.println("Turn the key to start the car");
    }
}
