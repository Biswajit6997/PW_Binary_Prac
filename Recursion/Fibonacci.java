
// Time Complexity: O(2N) --> Exponential time complexity 
// Auxiliary Space: O(n)


import java.util.Scanner;
//Fibonacci without Recursion 
// Time Complexity: O(N)  
// Auxiliary Space: O(1)

public class Fibonacci {
    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            // swap
            int c = a + b;
            a = b;
            b = c;
        }
    }

    // functional defination // with Recursion
    public static int findfibonacci(int n) {
        // Base Case
        if (n <= 1) {
            return n;
        } else {
            // recusrive function call
            return findfibonacci(n - 1) + findfibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number fibonacci series :");
        int n = sc.nextInt();

        System.out.println("Final output is :" + findfibonacci(n));

        // Print the first N numbers
        // for (int i = 0; i < n; i++) {

        // System.out.print(findfibonacci(i) + " ");
        // }

        // without recursion
        fibonacci(n);
    }
}
