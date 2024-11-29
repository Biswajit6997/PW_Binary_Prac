
/*
 
i/p: 1
o/p: 1

i/p: 2
i/p:2

i/p:3
o/p: 3
 */
public class Tiling_Problem {

    static int findways(int n){
        // Base case:
        if(n<=3){
            return n;
        }
        // Recusrsive call
        else{
            return findways(n-1)+findways(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(findways(5));
    }
}