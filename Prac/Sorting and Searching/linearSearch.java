import java.util.Scanner;

public class linearSearch {

    static void linear(int arr[], int target) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Item not found at index ");
        } else {
            System.out.println("Item is present in the array at " + idx);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of element in the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elemet:");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();

        linear(arr, target);
    }
}