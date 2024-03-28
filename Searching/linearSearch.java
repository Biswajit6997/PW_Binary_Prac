// Time Complexity :O(n)
// Space Complexity :O(1)


import java.util.Scanner;

public class linearSearch {
    //Pw skills
    static void liner(int arr[],int target){
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element not pesent in the array");
        }
        else{
            System.out.println("Element preseny in the arrray at "+idx);
        }
    }

    // Apna college

    static int linearSe(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the array element in the array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element in the array");
        int target = sc.nextInt();


         
        // /1st methods
        liner(arr, target);

        // 2nd approach
        // int idx = linearSe(arr, target);
        // if (idx == -1) {
        //     System.out.println("Search element not present in the array");
        // } else {
        //     System.out.println("Eelment present in the array at index " + idx);
        // }

    }
}
