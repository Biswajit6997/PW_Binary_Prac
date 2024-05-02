public class AlternativeSign1 {
    static int[] alterSeries(int n) {
        int[] series = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            series[i] = alter(i);
        }
        return series;
    }

    static int alter(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // recursive call
        if (n % 2 == 0) { // even
            return alter(n - 1) - n;
        } else { // odd
            return alter(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] series = alterSeries(n);
        for (int i = 0; i <= n; i++) {
            System.out.print(series[i] + " ");
        }
    }
}
