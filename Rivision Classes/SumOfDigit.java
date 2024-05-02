// i/p:12345
// o/p:15

// T(n)=O(lon n)
// Space =O(logn)

public class SumOfDigit {
    static int sum(int num){
        if(num==0){
            return 0;
        }
       return (num%10)+sum(num/10);
    }
    public static void main(String[] args) {
        int num=12345;
        System.out.println("The sum of the given number is :"+sum(num));
        
    }

    
}