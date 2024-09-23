package Prac;

public class ClearIthBit {
    static int ClearithBit(int n,int i){
        int Bitmask=(~0)<<i;
        return n& Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearithBit(15, 2));
        
    }
}
