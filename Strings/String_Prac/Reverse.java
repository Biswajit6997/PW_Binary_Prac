import java.util.Scanner;

public class Reverse {
    // i/p :biswjit
    // o/p : tijwsib
    static String reverse(String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }

        return str2;
    }
    // Before Reversing :pwskills java
    // After Reversing :java pwskills
    static String reverse1(String str1) {
        String str2 = "";
        String sarr[] = str1.split(" ");
        for(int i=sarr.length-1;i>=0;i--){
            str2=str2+sarr[i]+" ";
        }
        return str2;

    }
    // Before Reversing :pwskills java
    // After Reversing :avaj sllikswp
    static String reverse2(String str1){
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i) ;
        }
        return str2;
    }
    // Before Reversing :pwskill java
    // After Reversing :llikswp avaj
    static String reverse3(String str1){
        String str2="";
        String arr[]=str1.split(" ");
        for(String elem:arr){
            for(int i=elem.length()-1;i>=0;i--){
                str2=str2+elem.charAt(i);
            }
            // str2=str2+" ";
            str2+=" ";
        }
        return str2;
    }

    public static void main(String[] args) {

        System.out.println("Enter a String yp reverse it :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Before Reversing :"+str1);
        // System.out.println("After Reversing :"+reverse1(str1));
        // System.out.println("After Reversing :"+reverse2(str1));
        System.out.println("After Reversing :"+reverse3(str1));

    }
}
