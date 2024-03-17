// Pw skills video 21 
// Q: Rotate  a  matrix 90 degree clockwise 
/*Input Matrix
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Rotation of matrix:
13 9 5 1
14 10 6 2
15 11 7 3
16 12 8 4*/

import java.util.Scanner;

public class RotateAmatrix {
    //print the array
    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    //rotation matrix 
    static void transposeInPlace(int [][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }


    static void reversearray(int arr[]){
        int h=arr.length;
        for(int i=0;i<h/2;i++){
            int temp=arr[i];
            arr[i]=arr[h-i-1];
            arr[h-i-1]=temp;
        }
    }
    // main method for rotation 90degree
    static void rotate(int mmatrix[][],int n){//here n =r or c beeacuse in question given square matrix
       
        // transpose
        transposeInPlace(mmatrix, n,n); 
        //reverse of the 1D array
        for(int i=0;i<n;i++){
            reversearray(mmatrix[i]);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and coloumns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter" + +r + " * " + c + "Elements :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        rotate(matrix,r);

        System.out.println("Rotation of matrix:");
        printMatrix(matrix);


    }
}
