public class PrintSubArrays {
    public static void SubARrays(int arr[]){
        int count=0;//for count subarrays
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                count++;//for count subarrays
                System.out.println();
            }
            System.out.println();
        }
        //for count subarrays
        System.out.println("Total subarray is :"+count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SubARrays(arr);

    }
}
