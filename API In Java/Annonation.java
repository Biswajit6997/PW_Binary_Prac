// Annotation ---> are representd using " @ " symbol followed by the name of annotation, amd they can take that provide additional information

// Functional Interface --> it don't contain more than 1 abstarct method
@FunctionalInterface
interface Demo{
    void disp();
    // void disp1();
}


// this is Parent class
@Deprecated
class Plane{
    public void CanFly(){
        System.out.println("Plane is Flying..");
    }
}
// this is clild class
class Aeroplane extends Plane{
    // overridden method from parent class
    @Override //--> this is annotation
    public void CanFly(){
        System.out.println("Aeroplane is Flying");
    }
}




public class Annonation {
    
    public static void main(String[] args) {

    //    object of child class;
    Plane p=new Aeroplane();
    p.CanFly();
        
    }
}
