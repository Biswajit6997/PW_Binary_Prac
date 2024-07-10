public class QuickSort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
       //Base Case
        if (si >= ei) {
            return;
        }
        // left element
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right

    }

    static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];

        int i = si - 1;// To make place for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];//* call by value 
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 20, 25, 30, 200, 100 };
        quickSort(arr, 0, arr.length - 1);
        PrintArr(arr);

    }

}
