//sorted array by even num comes first and odd num go last
//lec 18: q-3 

// i/p: 1 2 3 4 5 6 7 8 9 10
// o/p: 10 2 8 4 6 5 7 3 9 1

import java.util.Scanner;

public class Parity {

    static void printarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortByparity(int arr[]) {
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right) {
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[right]%2==0){
                left++;
            }
            if(arr[left]%2==0){
                right--;
            }

        }

    }

    // static void sortByparityodd(int arr[]) {
    //     int n=arr.length;
    //     int left=0,right=n-1;
    //     while (left<right) {
    //         if(arr[left]%2==1 && arr[right]%2==0){
    //             swap(arr,left,right);
    //             left--;
    //             right++;
    //         }
    //         if(arr[right]%2==0){
    //             left--;
    //         }
    //         if(arr[left]%2==0){
    //             right++;
    //         }

    //     }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printarray(arr);
        sortByparity(arr);
        // sortByparityodd(arr);
        System.out.println("After Sorted array :");
        printarray(arr);

    }
}
