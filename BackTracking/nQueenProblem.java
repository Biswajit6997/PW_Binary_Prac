/*
 n Queen problem --- 4*4 
 */

public class nQueenProblem {
    static void PrintSolution(int board[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    // isSafe Methods
    static boolean isSafe(int board[][],int row,int column,int n){
        int i,j;
        //check this row on left side
        for( i=0;i<column;i++){
            if (board[row][i]==1) {
                return false;
                
            }
            //check upper diagonal on left side 
            for(i=row,j=column;i>=0 && j>=0;i--,j--){
                if (board[i][j]==1) {
                    return false;
                    
                }

            }
            //check lower diagnoalon left side 
            for(i=row,j=column;j>=0&&i<n;i++,j--){
                if (board[i][j]==1) {
                    return false;
                    
                }
            }

        }
        return true;
    }

    //function to solve n Queen Problem
    static boolean solvenQueen(int board[][],int column,int n){
        //base case:
        if (column>=n) {
            return true;
            
        }
        // consider this column and try placing all the queens one by one in all the rows

        for(int i=0;i<n;i++){
            //check if it is safe to place queen or not
            if (isSafe(board, i, column, n)) {
                //place thwe queen
                board[i][column]=1;
                //recursively call for remaining queens
                if(solvenQueen(board, column+  1, n)==true){

                    return true;
                }
                //if placing the queens does not lead to solution then backtrack
                board[i][column]=0;
                
            }

        }
        return false;
    }



    public static void main(String[] args) {
        int board[][]={{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};
        
       
        if (solvenQueen(board, 0, board.length)==true) {
            PrintSolution(board, board.length);
            
        }else{
            System.out.println("solution not exxist");
        }
    }
}
