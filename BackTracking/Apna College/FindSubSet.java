// package Apna College;

/*
 Q. Find and Print all subset of a given string

 i/p: "abc"
 o/p: a,b,c,ab,bc,ac,abc

 */

public class FindSubSet {
    static void findsubset(String str, String ans, int i) {
        // Base case:
        if (i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        

        // Yes choice
        findsubset(str, ans + str.charAt(i), i + 1);

        // No Choice
        findsubset(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findsubset(str, "", 0);

    }

}
