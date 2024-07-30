
//  Q 2: Check if a Given number is Power of 2 or Not


public class CheckPowerof2 {
    static boolean isPowerof2(int n){
        return (n &(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerof2(10));//false
        System.out.println(isPowerof2(16));//true
        
    }
    
}
