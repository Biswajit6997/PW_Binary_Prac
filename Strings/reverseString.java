// Reverse of the string

//i/p:pwskills
//o/p:sllikswp
import java.util.Scanner;

public class reverseString {

    public static String reverse(String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        return str2;
        // System.out.println(str2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str1 = sc.nextLine();
        // String str1="pwskills";
        System.out.println("Reverse of the String is:" + reverse(str1));

    }

}