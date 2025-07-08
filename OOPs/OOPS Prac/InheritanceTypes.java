
//Inheritance And its types
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (Not supported in Java)
// 5. Hybrid Inheritance (Not supported in Java)

class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat can meow");
    }
}
class Tiger extends Dog{
    void run(){
        System.out.println("Tiger can run");
    }
}



public class InheritanceTypes {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat(); // Inherited from Animal
        t.bark(); // Inherited from Dog
        t.run(); // Inherited from Tiger
        // t.meow(); // Not inherited from Cat
        
    }
}