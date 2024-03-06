// package Array;

public class missingnum {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=arr.length;
        
        int sumofn=(n*(n+1))/2;
        // or ((n+1)(n+2))/2
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int finalsum=sum-sumofn;
        System.out.println("The missing numver is :"+finalsum);

    }
}
