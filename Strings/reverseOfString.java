// reverse method

import java.util.Scanner;

public class reverseOfString {

    // i/p:pwskills java o/p::sllikswp avaj

    public static String revese1(String str1) {
        String str2 = "";
        String arr[] = str1.split(" ");
        for (String elem : arr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";

        }
        System.out.println("After Reversing :" + str1);
        System.out.println("Before Reversing :" + str2);

        return str2;
    }

    // i/p:pwskills java o/p:java pwskills
    public static String reverse(String str1) {
        String str2 = "";
        String sarr[] = str1.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            str2 = str2 + sarr[i] + " ";
        }
        System.out.println("After Reversing :" + str1);
        System.out.println("Before Reversing :" + str2);
        return str2;

    }

    public static void main(String[] args) {
        // String str1="pwskills java";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str1 = sc.nextLine();
        reverse(str1);
        revese1(str1);

    }
}
