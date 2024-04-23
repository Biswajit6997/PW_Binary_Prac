public class SumOfFirstNNatural {

    static int calsum(int n){
        if(n==1){
            return n;
        }
        else{
            return n+calsum(n-1);
        }
    }
    public static void main(String[] args) { 
        int n=5;
        System.out.println("Sum of first "+n+" is: "+calsum(n));
    }
}
