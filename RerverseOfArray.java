// Time complexity :O(n)
// Space  complexity :O(1)

public class RerverseOfArray {
    public static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {

            // swap btween arr[i] and arr[n-i-1];
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 34, 122, 3234, 34 };
        reverse(arr);
        // for print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
