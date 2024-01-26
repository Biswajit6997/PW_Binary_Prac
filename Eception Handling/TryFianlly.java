// try and finally with resource

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFianlly {
    public static void main(String[] args) {
        int num = 0;
        

        // try with close
        try(Scanner sc=new Scanner(System.in)) {
            num=sc.nextInt();
            
        }
        System.out.println(num);



        // try with finally
        /*Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number: ");
        }
        finally{// finally block always execute
            sc.close();
            System.out.println("Resource Closed");

        }
        System.out.println(num);*/
    }

}
