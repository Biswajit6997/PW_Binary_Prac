
/*
 *    1 
    1 2 
  1 2 3 
1 2 3 4 
 
 * 
 *     
 */


public class pattern5 {
    public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         if(i+j>=3){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<4;i++){
            int count=1;
            for(int j=0;j<4;j++){
                if(i+j>=3){
                    System.out.print(count++ + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
