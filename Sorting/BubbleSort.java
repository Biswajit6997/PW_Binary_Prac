// t(n)=O(n^2)
// Space :O(1)
 
import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

static void Bubblesort(int arr[]){
    for(int i=0;i<arr.length;i++){
        boolean isswapped=false;

        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                // swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isswapped=true;
            }
        }
        if(!isswapped){
            break;
        }
    }

}

public static void main(String[] args) {
    int arr[]={2,1,10,5,18};
    Bubblesort(arr);
    System.out.print("Sorted Array is:");
    System.out.print(Arrays.toString(arr));
     
}
}