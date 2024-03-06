import java.util.Scanner;

public class PrefixSumOptimize{

    public static void prefixSumMatrix(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    public static int sumRegion(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0,repeated_region=0,result=0;


        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_region=arr[r2][c1-1];
        result=sum-up-left+repeated_region;
        return result;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of coloumn:");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the Matrix Element:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of Row1 Cooridanate");
        int r1=sc.nextInt();
        System.out.println("Enter the value of Coloumn1 Cooridanate");
        int c1=sc.nextInt();
        System.out.println("Enter the value of Row2 Cooridanate");
        int r2=sc.nextInt();
        System.out.println("Enter the value of Coloumn2 Cooridanate");
        int c2=sc.nextInt();

        prefixSumMatrix(arr);
        int reasult=sumRegion(arr,r1,c1,r2,c2);
        System.out.println("Sum of the region is :"+reasult);



    }
}