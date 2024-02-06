// Pallindromic string

public class pallindromic {

 static boolean pallindromic1(String str1){
        int n=str1.length();
        for(int i=0;i<str1.length()/2;i++){
            if(str1.charAt(i)==str1.charAt(n-i-1)){
               return true; 
            }
           
        }
        return false;

    }
    public static void main(String[] args) {
        String str="madam";
        pallindromic1(str);
        if(true){
            System.out.println(str +" is a pallindromic string");


        }
        else{
            System.out.println(str+ " is not a pallindromic string");

        }
    }
    
}
