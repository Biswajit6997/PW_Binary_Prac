// package OOPS Prac;
class Car {
    int speed;

    void run() {
        speed = 100;
        System.out.println("Car is running at speed: " + speed);

    }
    void ru() {
        speed = 100;
        System.out.println("Car is running at speed: " + speed);

    }
}

class BMW extends Car {
    int speed;
    @Override
    void run() {
        speed = 200;
        System.out.println("BMW is running at speed: " + speed);

    }
}

public class inheritanceEg {

    public static void main(String[] args) {
        // Car obj =new Car();
        // obj.run();
        BMW obj1 = new BMW();
        obj1.run();
        Car obj2 = new BMW();
        obj2.run();
        obj2.ru();


    }

}
