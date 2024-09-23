package Prac;
 /*
 * Suppose 15 --> 1111 findIthBit find the postion of the index wheather it is 0 or 1 ..it search from right to left 
 * 1111--> i=2 so output=1 
 * 
 */

public class GetIthBit {
    static int findIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    // SetIthBit
    static int SetIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    // ClearithBit
    static int ClearithBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    // Update Ith Bit
    static int UpdateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return ClearithBit(n, i);
        // }else{
        //     return SetIthBit(n, i);
        // }
        
        // Another Approach
        n=ClearithBit(n, i);
        int Bitmask=newBit<<i;
        return n|Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(findIthBit(15, 3));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearithBit(10, 1));
        // 
        System.out.println(UpdateIthBit(10, 2, 1));
        
    }
}
