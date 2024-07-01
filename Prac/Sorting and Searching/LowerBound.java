// arr: 2 4 4 5 6 7 target =4
// 0/p: 1

import java.util.Scanner;

public class LowerBound {

    static int findFirstOccurnace(int arr[],int target){
        int low=0,high=arr.length-1;
        int result=-1;
        while (low<=high) {

            // toa avoide overflow condition 
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                result=mid;
                // traverse the left side of the array
                high=mid-1;
            }
            else if(arr[mid]<target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the sorted element of the arrray:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int result=findFirstOccurnace(arr, target);
        if(result==-1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at Index "+result);
        }

    }
    
}
