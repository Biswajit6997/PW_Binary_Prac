// package Divide & Conquer;

public class MergeSort {

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // 1.Divide the array into two subproblemes

        int mid = si + (ei - si) / 2;
        // 2. Conquare the subproblems using Recursion
        // left Subarray
        mergeSort(arr, si, mid);

        // Right Subarray
        mergeSort(arr, mid + 1, ei);

        // 3.Combining the solution of all subproblems
        mergeProcedure(arr, si, mid, ei);

    }

    // Main mergeProcedure Function
    // si-->lower index
    // ei-->higer index
    static void mergeProcedure(int arr[], int si, int mid, int ei) {
        // left(0,3)=4 element right(4,6) =3 ==> 6-0+1=7 element total
        int temp[] = new int[ei - si + 1];// *

        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// idx for temp arr;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {// arr[i]>arr[j]
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        // for rightover element of 1st sorted part

        while (j <= ei) {
            temp[k++] = arr[j++];

        }

        // copy temp to orginal array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 15, 30, 35, 48,-1 };
        int n = arr.length;
        System.out.println("Array after sorting:");
        printArray(arr, n);

        mergeSort(arr, 0, n - 1);
        System.out.println("After Sorting:");
        printArray(arr, n);
    }

}
