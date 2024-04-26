public class reverse{

    static void swap(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,23,4,234,423};
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}