// package Apna College;
/*
 Find Permutations

 i/p: abc
 0/p: abc,acb,bac,bca,cab,cba

 */

public class PermutationEg {
    public static void findPermutation(String str,String ans){
        // Base case:
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // Recursion
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            findPermutation(newstr, ans+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, "");
        
    }
    
}
