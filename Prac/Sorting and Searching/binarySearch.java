import java.util.Scanner;

public class binarySearch {

    static int Binary(int arr[],int target){
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<= target){//right side of the array
                low=mid+1;
            }
            else{//left side of the array
                high=mid-1;
            }
            
        }
        return 0;
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
        int result=Binary(arr, target);
        if(result==0){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at Index "+result);
        }

    }
}