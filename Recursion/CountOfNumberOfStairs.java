// Count of Number of Starirs 
// Lec: 
// module: 
// T(n)=O(2n) 
// Space => O(n)

import java.util.Scanner;

public class CountOfNumberOfStairs {
    public static int countStairs(int n){
        if(n<=1){
            return n;
        }
        else{
            return countStairs(n-1)+countStairs(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs:  ");
        int n=sc.nextInt();
        System.out.println("Number of stairs is "+countStairs(n+1));

    }
}
