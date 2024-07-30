
/*
 * Q 3 Count Set Bits In Number
 */


public class CountBitsInNum {
    static int Count(int n){
        int count=0;
        while (n>0) {
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
            
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Count(10));//2
        System.out.println(Count(15));//4
        
    }
    
}
