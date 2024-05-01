// T(n)=O(log n )
//Space:O(1)
import java.util.*;
public class BinarySeaRecu {

    static int binarySeacrch(int arr[],int low ,int high,int target){
        int result=-1;

        while (low<=high) {
            int mid=low+(high-low)/2;
            // condition 1
            if(arr[mid]==target){
                return mid;
            }
            // condition 2
            else if(arr[mid]<target){
               return binarySeacrch(arr, mid+1, high, target);
            }
            else{
               return binarySeacrch(arr,low, mid-1, target);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10,12};
        System.out.print("Enter the target value :");
        int target=sc.nextInt();

        int result=binarySeacrch(arr, 0, arr.length-1, target);
        if(result==-1){
            System.out.println("No target value found in the array");
        }
        else{

            System.out.println("The target index is  :"+result);
        }

        
    }
}
