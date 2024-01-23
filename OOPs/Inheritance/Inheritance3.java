// Multiple inheritance 

class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{

}
class Tiger extends Dog{

}

public class Inheritance3 {
    public static void main(String[] args) {
        Tiger a=new Tiger();
        a.eat();
    }

    
}

// Java does not support multiple inheritance 
// It supported by using interface