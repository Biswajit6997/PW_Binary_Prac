import java.util.WeakHashMap;
import java.util.HashMap.*;

class Employee{
    private String name;
    private int empId;
    public Employee(String name,int empId){
        this.name=name;
        this.empId=empId;

    }
    public String toString(){
        return empId+" ";
    }
    @Override
    public void finalize()
    {
        System.out.println("Clean up work by GC before de allocating memory from heap");

    }
}


public class Map5 {
    public static void main(String[] args) {
        Employee e=new Employee("Biswajit", 123);
        //
        // WeakHashMap hs=new WeakHashMap<>();
        // hs.put(e, "Biswa");
        // System.out.println(hs);


        e=null;// Eligible for garbage collection
        System.gc();// Invoking garbage collector
        

        System.out.println("Last Line");
    }
}
