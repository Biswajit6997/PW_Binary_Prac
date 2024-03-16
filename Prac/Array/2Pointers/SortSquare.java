import java.util.Scanner;

public class SortSquare {


    static int[] sortSuare(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans[]=new int[n];
        int k=0;
        while (left<=right) {
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;

            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
            
        }
        return ans;
    }
    static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    static void reverse(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            
        }
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");;
        int n=sc.nextInt();
        System.out.println("Enter "+n +"Element");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("orginal array is");
        Printarr(arr);
        System.out.println("After Square and sorted array is :");
        int ans[]=sortSuare(arr);
        reverse(ans);
        Printarr(ans);
        
    }
}
