import java.util.Scanner;

public class Transpose2Dmatrix {

    static void printMatrix(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
//Transpose matrix method

    static int[][] findTranspose(int matrix[][],int r,int c){
        int [][]ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }



    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows and coloumns:");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int [][] matrix=new int[r][c];
    System.out.println("Enter"+ +r +" * "+c +"Elements :");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    System.out.println("Input Matrix");
    printMatrix(matrix);
    // 
    System.out.println("Transpose Matrix :");
   int ans[][]= findTranspose(matrix, r, c);
    printMatrix(ans);
    }
}
