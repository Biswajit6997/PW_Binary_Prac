public class pallindromString {
    public static String PallindromicString(String str1){
      
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }

        if (str1.equals(str2)) {
            System.out.println("Pallindromic String");
            
        }
        else{
            System.out.println("Not a Pallindromic String");
        }
        return str2;

    }


    //Logic by apna college
    public static boolean pallindrom(String str1) {
        int n = str1.length();
        for (int i = 0; i < n / 2; i++) {
            if (str1.charAt(i) == str1.charAt(n - 1 - i)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "racecar";

        // pallindrom(str1);
    PallindromicString(str1);
      /* if (true) {
            System.out.println("Pallindromic String");
        } else {
            System.out.println("Not a pallindromic String");
        } */ 
    }
}
