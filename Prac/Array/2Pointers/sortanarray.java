// package 2D Pointers;

import java.util.Scanner;

public class sortanarray {

    static void printarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void sortZerosAndOnce(int arr[]) 
     {
        int n = arr.length;
        int zeroes = 0;
        // count number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        // 0 to zeroes -1 : 0 ,zeroes to n-1 :1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ::");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" Enter " + n + " Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Orginal Array is: ");
        printarray(arr);
        sortZerosAndOnce(arr);
        System.out.println("Sorted array is:");
        printarray(arr);
    }
}
