import java.util.Scanner;

public class PrefixSumBrute {
public static int prefix(int arr[][],int r1,int c1,int r2,int c2){
    int sum=0;
    for(int i=r1;i<=c2;i++){
        for(int j=c1;j<=c2;j++){
            sum+=arr[i][j];
        }
    }
    return sum;
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

        int result=prefix(arr,r1,c1,r2,c2);
        System.out.println("Sum of rectangle is :"+result);

    }
}
