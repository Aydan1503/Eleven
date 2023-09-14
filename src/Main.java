// Abstract class Vehicle
abstract class Vehicle {
    abstract void startEngine();
    abstract void drive();
}


// Subclass Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the car's engine...");
    }


    @Override
    void drive() {
        System.out.println("The car is now in motion.");
    }
}


// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the motorcycle's engine...");
    }


    @Override
    void drive() {
        System.out.println("The motorcycle is now in motion.");
    }
}


// Subclass Truck
class Truck extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the truck's engine...");
    }


    @Override
    void drive() {
        System.out.println("The truck is now in motion.");
    }
}


public class Main {
    public static void main(String[] args) {




        Vehicle car = new Car();
        car.startEngine();
        car.drive();


        System.out.println("-----------------------");


        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.drive();


        System.out.println("-----------------------");


        Vehicle truck = new Truck();
        truck.startEngine();
        truck.drive();
    }
}
