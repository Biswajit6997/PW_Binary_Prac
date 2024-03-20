
// lec: Ways to compare
// difference bttween .equlas and == 


public class compareString {
    public static void main(String[] args) {
        // String s1="pwskills";
        // String s2=new String("pwskills");
        // System.out.println(s1==s2);//false
        // System.out.println(s1.equals(s2));//true
        String s1="pwskills";
        String s2=new String("pwSkills");
        String s3=new String("pwskills");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s2.equals(s3));//false 
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s2.equalsIgnoreCase(s3));//true

    }
    
}
