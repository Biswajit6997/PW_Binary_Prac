package Array;
public class reverseArray {
    public static void rev(int arr[]){
        int n=arr.length;
        //swap betwwen arr[i]and arr[in-i-1]
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        
        rev(arr);
        // for display
        System.out.println("Reversed array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
