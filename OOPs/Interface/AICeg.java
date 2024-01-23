// Anoymous inner class example
interface car{
    void drive();
}
/*class car1 implements car{
   public  void drive(){
        System.out.println("driving");
    }
}*/
// instead of create a new class we use anonomous class

public class AICeg {
    public static void main(String[] args) {
        // anoymous class
        car c=new car() {
            public void drive(){
                System.out.println("Driving");
            }
        };
        c.drive();
    }
    
}
