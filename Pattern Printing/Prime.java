public class Prime {
    static boolean isPrime(int n){
        boolean isPrime=true;
        if (n==2) {
            return true;
            
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime= false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));
        System.out.println(isPrime(12));
        System.out.println(isPrime(100));
        
    }
}
