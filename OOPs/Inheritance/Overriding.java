
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
    void fly() {// Method overrididng
        System.out.println("Ship are not fly");
    }

}

class Boat extends Aeroplane {

}

public class Overriding {

    public static void main(String[] args) {
        Ship ae = new Ship();
        ae.fly();
        Boat b = new Boat();
        b.carry();

    }
}