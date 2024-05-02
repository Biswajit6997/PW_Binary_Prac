// i/p: n=5 1-2+3-4+5 =>3

//o/p:3

public class AlternamtiveSign {
    static int alter(int n){
        // Base case
        if(n==0){
            return 0;
        }
        // recursive call
        if(n%2==0){//even
            return alter(n-1)-n;
        }
        else{//odd
            return alter(n-1)+n;
        }
    }
    public static void main(String[] args) {
        System.out.println(alter(5));
        
    }
}
