/*
 * 
 *    * 
    * * * 
  * * * * * 
* * * * * * * 


 */



public class Pyrimid1 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            // First Print empty Space

            for(int j=0;j<3-i;j++){
                System.out.print("  ");
            }
            // The print the star
            for(int k=0;k<2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
