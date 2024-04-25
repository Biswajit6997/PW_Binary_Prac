public class FriendsPairingProb {

    static int friendspairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        /* 
        // if choice single
        int fnm1 = friendspairing(n - 1);

        // pair ways
        int fnm2 = friendspairing(n - 2);
        int ways = (n - 1)*fnm2;

        // totalways
        int totways = fnm1 + ways;
        return totways;*/

        return friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendspairing(3));

    }
}
