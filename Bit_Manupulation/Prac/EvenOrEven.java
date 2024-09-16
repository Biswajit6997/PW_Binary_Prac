package Prac;

public class EvenOrEven {
    static void CheckEvenOrOdd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given num is ODD");
        }
    }
    public static void main(String[] args) {
        CheckEvenOrOdd(10);
        CheckEvenOrOdd(5);
        
    }
}
