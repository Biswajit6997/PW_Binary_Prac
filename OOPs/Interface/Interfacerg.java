//Interface example

// package Interface;

interface A {
    public void show();

}

interface X {
    public void abc();
}

class B implements A, X {
    public void show() {
        System.out.println("From Show");
    }

    public void abc() {
        System.out.println("From abc");
    }
}

public class Interfacerg {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        // obj.abc();
    }

}
