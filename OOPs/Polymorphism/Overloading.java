// Method Overloading

class Car {
    void run() {
        System.out.println("Car is running");
    }

    void run(int speed) {
        System.out.println("Car is running at " + speed + " km/h");
    }

    void run(String name) {
        System.out.println(name + " is running");
    }
}
class Bike extends Car {
    void run() {
        System.out.println("Bike is running");
    }

    void run(int speed) {
        System.out.println("Bike is running at " + speed + " km/h");
    }

    void run(String name) {
        System.out.println(name + " is running");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Car c = new Bike();
        c.run();
        c.run(60);
        c.run("Car");

        // Bike b = new Bike();
        // b.run();
        // b.run(80);
        // b.run("Bike");

        // Upcasting
        // Car car = new Bike(); // Upcasting
        // car.run(); // Calls the run() method of the Bike class

       
    }
}
