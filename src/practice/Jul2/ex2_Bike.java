package practice.Jul2nd;

public class ex2_Bike {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Vehicle b2 = new Bike();
    }
}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}
class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is ready");

    }
}
