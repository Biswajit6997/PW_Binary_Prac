public class sumAndMul {
    static void PrintMul(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }
         PrintMul(num, k-1);
         System.out.println(num*k);
        
        

    }
    public static void main(String[] args) {
        int num=4,k=5;
        PrintMul(num, k);
        // System.out.println();
        
    }
}
