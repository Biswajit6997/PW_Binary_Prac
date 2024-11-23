import java.util.*;

class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj=obj;

    }
    void display(){
        System.out.println("The type of data is "+obj.getClass().getName());

    }
    public T getobj(){
        return obj;
    }
}


public class Generic2 {
    public static void main(String[] args) {
        // ArrayList<String> list1=new ArrayList<String>();
        // List<String> list2=new ArrayList<String>();
        // Collection <Integer>list3=new ArrayList<Integer>();
        Gen<Integer> g=new Gen<Integer>(10);
        g.display();;
        System.out.println(g.getobj());
        System.out.println("..............................................");
        Gen<String> g1=new Gen<String>("Pw");
        g1.display();;
        System.out.println(g1.getobj());
        



    }
}
