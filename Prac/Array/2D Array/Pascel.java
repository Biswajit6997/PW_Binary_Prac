// pascel matrix
/*Enter n :7

1 
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1 
*/

import java.util.Scanner;

public class Pascel {
    // print the array
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
// Main pascel methods
    static int[][] pascel(int n) {

        int ans[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i+1 column
            ans[i] = new int[i + 1];
            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int ans[][] = pascel(n);
        printMatrix(ans);

    }
}
