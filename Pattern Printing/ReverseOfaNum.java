public class ReverseOfaNum {
    static void findLastDigit(int n){
        int lastdigt=1;
        while (n>0) {
            lastdigt=n%10;
            n=n/10;
            System.out.print(lastdigt);

            
           
        }
        System.out.println();
    }
    // Method 2
    static int LastDigit(int n){
        int reverse=0;
        while (n>0) {
            int LastDigit=n%10;
            reverse =(10*reverse)+LastDigit;
            n=n/10;

            
        }
        return reverse;
    }
    public static void main(String[] args) {
        findLastDigit(1234569);
       
        System.out.println(LastDigit(123467));

        
    }
}
