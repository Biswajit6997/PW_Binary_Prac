// Time Complexity: O(2^n)
// Auxiliary Space: O(1)


public class TilingProblem {

    static int tiling(int n){//2 * n(floor Size)
        if(n==0 ||n==1){
            return 1;
        }
        return tiling(n-1)+tiling(n-2);
        // vartical choice
        // int fnm1=tiling(n-1);
        //  horinzontaiily choice
        // int fnm2=tiling(n-2);

        // int finalWays=fnm1+fnm2;
        // return finalWays;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
        
    }
}
