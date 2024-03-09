public class MaxSubarraySum {

    public static void sum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 currsum=0;
                for(int k=i;k<=j;k++){
                    // System.out.println();
                    currsum+=arr[k];
                }
                System.out.print(currsum + " ");
                //For max sum
                
                 if(maxsum<currsum){
                    maxsum=currsum;
                 }
                // for min sum
                if (minsum>currsum) {
                    minsum=currsum;
                    
                }
            }
        }
        System.out.println("max sum is : "+maxsum);
        System.out.println("max sum is : "+minsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        sum(arr);
    }
}
