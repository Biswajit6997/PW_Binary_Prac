// Q: Check a given array is Sorted or Not
// i/p:{1 ,2,3,4,5,6}
// o/p:true



public class CheckAgivenArraySortedOrNot {

    static boolean isSortted(int arr[],int i){
        // base case
        if(i==arr.length-1){
            return true;
        }
        else if(arr[i]>arr[i+1]){
            return false;

        }
       
        return isSortted(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,6,2,3,4,5};
        System.out.println(isSortted(arr, 0));
        
    }
}
