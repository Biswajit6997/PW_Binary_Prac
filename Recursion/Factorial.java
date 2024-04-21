// Time complexity: O(n)
// Space complexity: O(n)



import java.util.Scanner;

public class Factorial {
    static int findfact(int n) {
        int result=0;
        //1. base case condition
        if (n == 0 || n == 1) {
            return 1;
        } else {
            //rescursive function calling 
            result = n * findfact(n - 1);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nuber to see it's factoroial  : ");
        int n = sc.nextInt();

        System.out.print("Factorial of " + n + " is : " + findfact(n));

    }
}