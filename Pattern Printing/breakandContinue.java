import java.util.*;

public class breakandContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("You are entering multiple of 10");
                break;
            }
            System.out.println(n);

        } while (true);

    }
}
