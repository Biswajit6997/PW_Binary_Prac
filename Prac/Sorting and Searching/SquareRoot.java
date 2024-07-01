import java.util.Scanner;

public class SquareRoot {


    static int findSquareRoot(int num){
        int low=0,high=num,result=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int val=mid*mid;

            if(val==num){
                // perfect sqare root
                return mid;
            }
            else if(val<num){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root :");
        int n=sc.nextInt();
       System.out.println("The swuare root of the number is :"+findSquareRoot(n));
    
       
       

    }
}
