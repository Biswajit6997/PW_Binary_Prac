// package 2D Array;

import java.util.Scanner;

public class Twodarrayeg {

    static void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr[][]=new int[6][];
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows of the array");
        int r=sc.nextInt();
        System.out.println("Enter the rows of the array");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the "+r +"*"+c +"Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is :");
        printarr(arr);

    }
}
