
// Prefix sum by pw yt

import java.util.Scanner;

public class PrefixSum1 {
    static int[] makeprefixsuum(int arr[]){
        // int n=arr.length;
        // int pref[]=new int[n];
        // pref[0]=arr[0];

        // for(int i=1;i<n;i++){
        //     pref[i]=pref[i-1]+arr[i];
        // }
        // return pref;
        
// Optimize approach
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;

    }
    
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+ n +" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Input array :");
        printarray(arr);

        System.out.print("Prefix sum is:");

        int result[]=makeprefixsuum(arr);
        printarray(result);

    }

}
