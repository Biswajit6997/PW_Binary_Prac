public class reverseArray1 {

    public static void reversearray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        
    }

    //logic by apna college

    public static void reverse(int arr[]){
        int first=0;int last=arr.length-1;
        while (first<last) {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,23,4,5,56,67};
        // reversearray(arr);
        reverse(arr);
        System.out.println("Reversed of the array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
