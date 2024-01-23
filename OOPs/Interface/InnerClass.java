// Inner class example


class A{
    public void show(){
        System.out.println("From show");
    }
    static class B{
        public void display(){
            System.out.println("From display");
        }
    }
}



public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();

        A.B obj1=new A.B();// if the inner  method is static


        // A.B obj1=obj.new  B();//if the inner class in non static 
        obj.show();
        obj1.display();
        
    }
    
}
