// i/p: 16
//o/p:4
// Time complexity:O(logn)
// Space complexity:O(1)

import java.util.Scanner;

public class SquareRoot {

    static int findSquareRoot(int num) {
        int low = 0, high = num, result = -1;
        // modified binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = mid * mid;

            if (val == num) {
                // perfect sqaure root
                return mid;
            } else if (val < num) {
                // store the floor value ,incase the number is not perfect square rrot ,we can
                // print the floor value
                result = mid;
                low = mid + 1;
            } else {// val > num
                high = mid - 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to cal its square root :");
        int n = sc.nextInt();
        int result = findSquareRoot(n);
        System.out.println("THe Square Root of the Number is " + result);
    }
}
