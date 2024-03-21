import java.util.Scanner;

public class Reverse {

    static String reverse(String str1){
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        return str2;
    }
    public static void main(String[] args) {

        System.out.println("Enter a String yp reverse it :");
        Scanner sc=new Scanner(System.in); 
        String str1=sc.nextLine();

        System.out.println(reverse(str1));
        
    }
}


