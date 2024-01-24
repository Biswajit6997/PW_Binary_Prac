// package ExceptionHAndlaing;

public class tryandcatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

    }

}
/*
 * import java.io.*;
 * class GFG {
 * public static void main (String[] args) {
 * int a=5;
 * int b=0;
 * try{
 * System.out.println(a/b);
 * }
 * catch(ArithmeticException e){
 * e.printStackTrace();
 * }
 * }
 * }
 *   System.out.println(e.getMessage());
 * System.out.println(e.toString());
 */