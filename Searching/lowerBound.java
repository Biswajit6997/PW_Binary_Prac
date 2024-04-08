// Module :56
// Interview Problem :Lower Bound 
//T(n)=O(logn)
// Space complexity:O(1)
// i/p :1 2 1 3 5 1 target =1
// o/p :0 because 1 occurence at first at index 1

import java.util.Scanner;

public class lowerBound {

    static int findfirstoccurence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                // traverse to the left side of the array
                high = mid - 1;
            } else if (arr[mid] > target) 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rhe element of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter thr array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Element");
        int target = sc.nextInt();
        // function calling
        int result = findfirstoccurence(arr, target);
        if (result == -1) {
            System.out.println("Target element is not in thr present in the array");
        } else {
            System.out.println("Target element first occurence is presence at index : " + result);
        }
    }
}
