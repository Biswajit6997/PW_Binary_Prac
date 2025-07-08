//Abstraction in Java is a process of hiding the implementation details and showing only the essential features of the object.

abstract class Animal {
    abstract void sound(); // Abstract method
    public void eat() { // Regular method
        System.out.println("Animal eats");
    }
}


class Dog extends Animal {
    void sound() { // Implementation of the abstract method
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() { // Implementation of the abstract method
        System.out.println("Cat meows");
    }
}



public class AbstractionEg {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound(); // Calls the sound() method of the Cat class
        c.eat(); // Calls the eat() method of the Animal class 
        Dog d = new Dog();  
        d.sound(); // Calls the sound() method of the Dog class
        // Animal a = new Animal(); // Cannot create an instance of the abstract class

    }
}
