/*
 
**********
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
**********


 */

package Module_17;

public class c_pattern3 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1||i==j || j==0 ||i==n-1||i==0 || j==n-1){
                    System.out.print("*");
                   
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
