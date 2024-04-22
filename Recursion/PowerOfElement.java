import java.util.Scanner;

public class PowerOfElement {
    // Approach 1: T(n)=O(b) depends on b
    static long power(long a, long b) {
        // base case
        if (b == 1) {
            return a;
        } else {
            // resursive call function
            return a * power(a, b - 1);
        }
    }

    // Approach 2 :Optimize
    // T(n)=O(b)
    static long powerElement(long a, long b) {
        long result = 0, finalresult = 0; 
        // base case
        if (b == 1) {
            return a;
        } else {

            result = powerElement(a, b / 2);// recursive function call
            finalresult = result * result;
            if (b % 2 == 0) {
                return finalresult;
            } else {
                return a * finalresult;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        long a = sc.nextLong();
        System.out.println("Enter b :");
        long b = sc.nextLong();
        // System.out.prlongln("Power of "+a+" to the power"+b+" is :"+power(a, b));
        System.out.println("Power of a^b  is :" + powerElement(a, b));

    }
}
