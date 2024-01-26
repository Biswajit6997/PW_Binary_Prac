// try with multiple catch block eg

public class trywithmultiple {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        int result=0;
        int arr[]={2,3,44,55,6};
        String ab=null;
        try {
            result=a/b;
            // result=a/ab.length();
            System.out.println(arr[5]);

            
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero"+e);
        }
        // ArrayIndexOutOfBoundsException is for array bound size
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(arr[arr.length-2]);//55

            System.out.println("please put value in range");


        }
        catch(Exception e){
            System.out.println("Somrthing went wrong...");
        }
        System.out.println(result);
        System.out.println("bye........");
    }
    
}
