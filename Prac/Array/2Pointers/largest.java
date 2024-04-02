public class largest {
    

    public static int getlargest(int nums[]){
        int largestnum=Integer.MIN_VALUE;//-Infinity

        int smallest=Integer.MAX_VALUE;//+Infinity

        for(int i=0;i<nums.length;i++){
            if(largestnum<nums[i]){
                largestnum=nums[i];
            }
            if(smallest>nums[i]){
                smallest=nums[i];
            }
        }
       System.out.println("Smallest  number is:"+smallest);

        return largestnum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,22,34};
       System.out.println("Largest number is:"+getlargest(arr));
    //    System.out.println("Largest number is:"+getlargest(arr));
    }
}
