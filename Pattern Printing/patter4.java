
/*
 *      
1 
1 2 
1 2 3 
1 2 3 4
 * 
 */

public class patter4 {
   public static void main(String[] args) {
    for(int i=0;i<4;i++){
        int count=1;
        for(int j=0;j<=i;j++){
            System.out.print(count++ + " ");
        }
        System.out.println();
    }
   } 
}
