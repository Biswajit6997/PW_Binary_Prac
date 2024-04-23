public class Factorial {

    static int factorial(int n){
        if(n==0||n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Factorial is :"+factorial(n));

    }
}
