

// Addation of 2 matrix


import java.util.Scanner;

public class Addtion2Matrix {

    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
       }
   }

    static void add(int a[][], int r1,int c1,int [][] b,int r2,int c2){
        int sum[][]=new int[r1][c1];
        //validate the same size of the 2 arraay
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input --Addition not possible");
            return;
        }
        for(int i=0;i<r1;i++){//row num
            for(int j=0;j<c1;j++){//col num
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        //Print the matrix 
        System.out.println("Sum of Matrix 1and Matrix 2 is");
        printMatrix(sum);
    }





    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st matrix's rows of the array");
        int r1=sc.nextInt();
        System.out.println("Enter the 1st matrix's  coloumn of the array");
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter the "+r1 +"*"+c1 +"Matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
       
        System.out.println("Enter the 2nd matrix's rows of the array");
        int r2=sc.nextInt();
        System.out.println("Enter the  2nd matrix's  cols of the array");
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter the "+r2 +" * "+c2 +"Matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 :");
        printMatrix(a);
        System.out.println("Matrix 2 : ");
        printMatrix(b);
        add(a, r1, c1, b, r2, c2);
    }
}
