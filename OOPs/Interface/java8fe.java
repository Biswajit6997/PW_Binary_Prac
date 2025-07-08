// Java 8 Features 
interface A{
    public void show();
    
    // Default method in interface

    default void config(){
        System.out.println("From config");
    }
    //  Static method in interface
    
    static void abc(){
        System.out.println("From abc");
    }
}

class B implements A{
    public void show(){
        System.out.println("From Show");
    }
}
public class java8fe {
    public static void main(String[] args) {
        A.abc();  // We can acess directly if the method is static
        B obj=new B();
        obj.config();
        obj.show();
        
    }
    
}
