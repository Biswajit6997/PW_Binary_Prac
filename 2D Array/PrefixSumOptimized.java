// Optimized approach

// T(n)=O(n)
// O(n)=O(1)

import java.util.Scanner;

public class PrefixSumOptimized {

    public static void PrefixSumMatrix(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        // traversed the array row-wise to calculate the row wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];

            }
        }
        // traversed the array coloumn-wise to calculate the coloumn -wise prefix sum
        // Final 2D array
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }

        }
    }
// T(n)=O(n)
// Space complexity:O(1)
    public static int sumRegion(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0,repeted_region=0,result=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeted_region=arr[r1-1][c1-1];
        result =sum-up-left+repeted_region;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        int m = sc.nextInt();
        System.out.print("Enter the number of Coloums:");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the Matrix element:");
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
        PrefixSumMatrix(arr);
        int result=sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of the element of given rectangle is:"+result);


    }

}
