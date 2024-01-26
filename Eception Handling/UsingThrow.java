//v.195 Exception handling using throw 



// Created own Exception
class BiswajitException extends Exception{
    public BiswajitException(){
        
    }
    public BiswajitException (String msg){
        super(msg);
        
    }
    
}
public class UsingThrow {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;

        try {
            if (num2 < 0) {
                //  Careated my own exception

                Exception e=new BiswajitException("Negative Number");
                throw e;


                /*
                Exception e = new Exception("Negative number");
                throw e;// in throw we are created a object
                */

            } 
            else {
                int result = num1 / num2;
                System.out.println(result);

            }

        } catch (Exception e) {
            System.out.println("Enter a valid number..."+e);
        }
    }

}
