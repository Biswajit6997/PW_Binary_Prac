import java.util.Scanner;

public class Fibonacci {
    public static int findfibonacci(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return n;
        } else {
            // recusrive function call
            return findfibonacci(n - 1) + findfibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number is :" + findfibonacci(n));
    }
}
