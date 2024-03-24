// package Assignment;

import java.util.Arrays;

public class Assign3 {
    public static void main(String[] args) {
        String str="biswajit";
         // Convert the string to an array of characters
        char arr[]=str.toCharArray();
         // Sort the array of characters
        Arrays.sort(arr);
        // Convert the sorted array of characters back to a string
        String sortedStr = new String(arr);
        
        // Print the sorted string
        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + sortedStr);
        // System.out.println(arr);

    }
}
