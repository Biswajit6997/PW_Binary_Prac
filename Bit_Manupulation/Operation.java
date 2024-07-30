public class Operation {

// GetIthBit
 public static int getIthBit(int n,int i){
    int BitMask=1<<i;
    if((n&BitMask)==0){
        return 0;
    }
    else return 1;
 }
 //SetithBit
 public static int SetithBit(int n,int i){
    int bitMask=1<<i;
    return n |bitMask;
 }
// ClearithBit
public static int ClearithBit(int n,int i){
    int bitMask=~(1<<i);
    return n &bitMask;
}
// UpdateithBit
public static int UpdateithBit(int n,int i,int newBit){
    if(newBit==0){
        return ClearithBit(n, i);
    }else{
        return SetithBit(n, i);
    }
}

// ClearLastBits
public static int LastBits(int n,int i){
    int bitMask=((-1)<<i);
    return n & bitMask;
}

// ClearBitInRange
public static int ClearBitInRange(int n,int i,int j){
    int a =((~0)<<(j+1));
    int b=(1<<i)-1;
    int BitMask=a|b;
    return n &BitMask;
}

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));

        System.out.println(SetithBit(10, 2));
        System.out.println(ClearithBit(10, 1));

        // Update IthBit
        System.out.println(UpdateithBit(10, 2, 1));
        // ClearithBit
        ClearithBit(15, 2);

        // 
        System.out.println(ClearBitInRange(10, 2, 4));//2
        
    }
}
