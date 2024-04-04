// Time Complexity :O(log n)
// Space Complexity :O(1)          

public class BinarySearch {
    // 1st aproach
    public static int binary(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
    // 2nd approach by recursion by pw

    static boolean recBinarySearch(int[] a, int st, int end, int target){
        if(st > end) return false; // base case
        int mid = (st + end)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]){
            return recBinarySearch(a, st, mid-1, target); // subproblems
        } else {
            return recBinarySearch(a, mid+1, end, target); // subproblems
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 8, 9 };
        int target = 5;
        int result = binary(arr, target);
        if (result == -1) {
        System.out.println("Element not present in the array");
        } else {
        System.out.println("Element present at idx" + result);
        }

        // while(target != 10) {
        //     System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(arr, 0, arr.length-1, target));


        //     target++;
        // }

    }
}
