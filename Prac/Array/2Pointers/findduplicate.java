// package Array.2Pointers;

public class findduplicate {
    

    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicates is : "+arr[i]);
                }
            }
        }
    }
}
 