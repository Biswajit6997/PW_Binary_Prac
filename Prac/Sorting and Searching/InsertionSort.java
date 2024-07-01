
// Time:O(n^2)
// Space :O(1)


import java.util.Arrays;

public class InsertionSort {

    static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,14,17,67,79,18};
        insertionsort(arr);
        System.out.println("Sorted arrray is:");
        System.out.println(Arrays.toString(arr));
        
    }
}
