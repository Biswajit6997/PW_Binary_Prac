// public package Polymorphism;
// Overriding
// Method overriding

class Aeroplane {
    void fly() {
        System.out.println("Aeroplane can fly");
    }

    void carry() {
        System.out.println("Aeroplane can carry goods");
    }
}
class Ship extends Aeroplane {
    @Override
    void fly() { // Method overrididng
        System.out.println("Ship are not fly");
    }
    @Override
    void carry() {
        System.out.println("Ship can carry goods");
    }

}



public class Overrriding {
    public static void main(String[] args) {
        Aeroplane ae = new Ship();
        ae.fly();
        ae.carry();
        Ship s = new Ship();
        s.fly();

        s.carry();

    }

    
}