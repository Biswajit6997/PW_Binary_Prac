// Brute Force approach

// Time complexity is:O(m*n)
// Space Complexity is:O(1)

import java.util.Scanner;

public class PrefixSumBrute {

    public static int PrefixSum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        int m = sc.nextInt();
        System.out.print("Enter the number of Coloums:");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix element:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value of row1 coordinate:");
        int r1 = sc.nextInt();
        System.out.print("Enter the value of coloumn1 coordinate:");
        int c1 = sc.nextInt();
        System.out.print("Enter the value of row2 coordinate:");
        int r2 = sc.nextInt();
        System.out.print("Enter the value of column2 coordinate:");
        int c2 = sc.nextInt();

        // function calling
        int result = PrefixSum(arr, r1, c1, r2, c2);  
        System.out.print("Sum of the array is " + result);

    }
}