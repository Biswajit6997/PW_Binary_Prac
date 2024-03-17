//Multiplication of 2 Matrices

import java.util.Scanner;

public class MatrixMultiplaction {
    
    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
       }
   } 

   static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(c1 != r2){
        System.out.println("Multiplication not possible - wrong dimension");
        return;
    }

    int[][] mul = new int[r1][c2];

    for(int i = 0; i < r1; i++){ // row number
        for(int j = 0; j < c2; j++){ //column number
            for(int k = 0; k < c1; k++){
                /*
                  i = 1, j = 0
                  mul[i][j] = ith row of a * jth col of b
                */
                mul[i][j] += (a[i][k] * b[k][j]);
            }
        }
    }

    System.out.println("Multiplication of 2 matrices");
    printMatrix(mul);
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
        // 
        multiply(a, r1, c1, b, r2, c2);
        // printMatrix(b);
    }
}
