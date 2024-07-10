import java.util.Arrays;

public class SelectionSort {

    static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // swap between arr[i] and arr[min_idx];
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 2, 34, 50, 40 };
        selectionsort(arr);
        System.out.println("Sorted array is " + Arrays.toString(arr));

    }
}
