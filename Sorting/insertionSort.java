// T(n)=O(n^2)
// Space Coplixty :O(1)


public class insertionSort {
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                // swap between arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,12,1,45,34,9};
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
