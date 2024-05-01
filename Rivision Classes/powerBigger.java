import java.math.BigInteger;
import java.util.*;

public class powerBigger {

    static BigInteger powerFind(BigInteger a,int b){
        BigInteger result,finalresult;
        // Base case
        if(b==1){
            return a;
        }
        result =powerFind(a, b/2);
        finalresult=result.multiply(result);
        if(b%2==0){
            return finalresult;
        }
        return a.multiply(finalresult);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=powerFind(a,b);
        System.out.println("Power of an elelment is : "+result);
    }
}
