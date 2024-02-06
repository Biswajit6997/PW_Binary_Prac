// pallindromic string 2nd approach


public class pallindromi {
    public static String palli(String str1){
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("Pallindromic String");
        }
        else{
            System.out.println("Not a pallindromic string");
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="madamfe";
        palli(str);
    }
}
