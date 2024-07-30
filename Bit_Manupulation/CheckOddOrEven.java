public class CheckOddOrEven {

    static void check(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //Even
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        check(10);//Even
        check(3);//Odd
        
    }
}
