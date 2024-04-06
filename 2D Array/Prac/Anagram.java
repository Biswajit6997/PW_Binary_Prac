import java.util.Arrays;

public class Anagram {
    // static String anagram(String str1){

    // }
    public static void main(String[] args) {
        String str1="School Master";
        String str2="The Classroom";
        // Remove WhiteSpace
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        //Convert it toLowercase or uppercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //Convert to CharArray
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
    //   Sort the array
    Arrays.sort(arr1);
    Arrays.sort(arr2);
  
    if (Arrays.equals(arr1, arr2)) {
        System.out.println("Anagram String");
    }
    else{
        System.out.println("Not a anagram number");
    }

    }
}
