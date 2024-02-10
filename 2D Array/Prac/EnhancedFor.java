public class EnhancedFor {
    public static void main(String[] args) {
        int arr[] = { 2, 34, 56 };
        // Enhanced For Loop
        for (int a : arr) {
            System.out.println(a);
        }

        // Enhanced for loop for 2d array
        int nums[][] = { { 1, 2, 3, 4 }, { 5, 8, 14, 18 }, { 9, 10, 11, 12 } };
        for (int a[] : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
