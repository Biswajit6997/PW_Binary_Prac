// public class {
    
// }
import java.io.*;
import java.util.*;

class tilingProblemUsingDP  {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(n));
        }
    }
    
}
class Solution {
    static int mod = 1000000007;
    static int numberOfWays(int n) {
        // code here
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        if(n>=2) dp[2] = 2; //for 2*2 floor only two ways we can keep the tiles
        
        int i = 3;
        while(i<=n){
            //Horizontal + Vertical
            dp[i] = (dp[i-2]+dp[i-1])%mod;
            i++;
        }
        return dp[n];
    }
};