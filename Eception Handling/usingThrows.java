// Exception handling using throws 
//v 194 . handling vs Ducking Exception

class Demo {
    void a() throws Exception{
        b();

    }

    public void b() throws Exception {
        int a = 6;
        int b = 0;

        int result = a / b;
        System.out.println(result);

        // catch(Exception e){
        // System.out.println("Error...."+e.getMessage());
        // }
    }
}

public class usingThrows {

    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        try{

            d.a();
        }
        catch(Exception e){
            System.out.println("Error...."+e);
        }

    }
}
