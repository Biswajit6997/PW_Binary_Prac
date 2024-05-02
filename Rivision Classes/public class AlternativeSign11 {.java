public class AlternativeSign11 {
    static String alterSeries(int n) {
        StringBuilder series = new StringBuilder();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // even
                series.append("-").append(i);
                result -= i;
            } else { // odd
                if (i != 1) {
                    series.append("+");
                }
                series.append(i);
                result += i;
            }
        }
        series.append(" => ").append(result);
        return series.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(alterSeries(n));
    }
}
