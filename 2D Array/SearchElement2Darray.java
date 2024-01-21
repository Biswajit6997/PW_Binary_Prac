
// Search element in the 2D array

import java.util.Scanner;

public class SearchElement2Darray {

    // largest element in the 2D array
    public static int largeElement(int matrix[][]){
        int largest=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }
    // Smallest number from the 2D array
    public static int smallestElement(int matrix[][]){
        int largest=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }


    // search element in 2D matrix
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.println("Key found at ("+i+","+j+")");
                return true;
            }
           }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;
        System.out.println("Enter your matrix :");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        // search(matrix, 7);
        
        System.out.println("Largest element is "+largeElement(matrix));
    }
}
