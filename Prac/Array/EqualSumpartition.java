
// pw java yt lec 19 3rd question


import java.util.Scanner;

public class EqualSumpartition {


    static int findArraySum(int arr[]){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartation(int arr[]){
        int totalsum=findArraySum                                          (arr);
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];

            int suffixSum=totalsum-prefixSum;//totalsum=prefixsum+suffixsum;so,we get this

            if(prefixSum==suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+ n +" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int arr[]={1,1,1,1,1,1};
        System.out.println("Parttaion are possible:"+equalSumPartation(arr));
    }
}
