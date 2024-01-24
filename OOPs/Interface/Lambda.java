// Lambda eg..


interface car{
    void drive();
}

public class Lambda {
    public static void main(String[] args) {
        car obj=()->
            System.out.println("Driving....");
        
        obj.drive();
    }
    
}
