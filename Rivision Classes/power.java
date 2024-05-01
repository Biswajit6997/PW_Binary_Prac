public class power {
    static long power(long a, long b) {
        long result, finalresult;
        if (b == 1) {
            return a;
        }
        result = power(a, b / 2);
        finalresult = result * result;
        if (b % 2 == 0) {
            return finalresult;
        }
        return a * finalresult;
    }

    public static void main(String[] args) {
        long a = 2, b = 32;
        System.out.println(power(a, b));

    }
}