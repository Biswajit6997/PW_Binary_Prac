public class power {

    // Brute Force Apparoach T(n)=>O(b)
    static int findpower(int a, int b) {

        if (b == 1) {
            return a;
        }
        // Recursive Function
        else {

            return a * findpower(a, b - 1);
        }

    }

    // optimize appraoch T(n)=>O(logn)
    static int findPowerOpt(int a, int b) {
        int result = 0, finalresult = 0;

        if (b == 1) {
            return a;
        } else {

            result = findPowerOpt(a, b / 2);
            finalresult = result * result;
        }
        if (b % 2 == 0) {
            return finalresult;
        } else {
            return a * finalresult;
        }

    }

    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        // System.out.println(findpower(a, b));
        System.out.println(findPowerOpt(a, b));

    }
}
