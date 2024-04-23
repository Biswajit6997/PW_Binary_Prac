//i/p:10
//o/p: 10 9 8 7 6 5 4 3 2 1

// package ApnaCollege;
//
public class PrintNumberNto1 {

    static void printnumber(int n) {
        // Base case
        if (n == 1) {
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            printnumber(n - 1);

        }
    }

    public static void main(String[] args) {
        int n = 10;
        printnumber(n);
    }
}
