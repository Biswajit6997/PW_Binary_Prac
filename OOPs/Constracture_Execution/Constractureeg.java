// package Constracture_Execution;
// Constructure execution in time of Inheritance

class Demo1 {
    int x, y;
    // constructure

    public Demo1() {
        System.out.println("Calling Parent Constacture");
    }
    // constructure with parameter

    public Demo1(int a, int b) {
        System.out.println("Calling Parent with parameterized constructure");
        a = x;
        b = y;

    }
}

class Demo2 extends Demo1 {
    int x, y;
    // constructure
    public Demo2() {
        // super(5,10);
        this(3, 5);
        System.out.println("Calling Child Constacture");

    }
    // constructure with parameter

    public Demo2(int a, int b) {
        System.out.println("Callimg Child With paramertized constructure");
        a = x;
        b = y;
    }
}

public class Constractureeg {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
    }

}
