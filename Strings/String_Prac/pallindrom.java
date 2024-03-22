import java.util.Scanner;

public class pallindrom {

    // 2nd approach
    static boolean pallindrome(String str1){
        int n=str1.length();
        for(int i=0;i<=n/2;i++){
            if(str1.charAt(i)==str1.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    // 1st approach
    static boolean pallin(String str1) {

        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        if (str2.equals(str1))
        // if(str1==str2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String TO CHECK:");
        Scanner Sc = new Scanner(System.in);
        String str1 = Sc.nextLine();
        // pallin(str1);
        pallindrome(str1);
        // System.out.println(pallin(str1));
        if (true) {
            System.out.println("Palindromic String");

        }
        else{
            System.out.println("Not a pallindromic String");
        }

    }
}
