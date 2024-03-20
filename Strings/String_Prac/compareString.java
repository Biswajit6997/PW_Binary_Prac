
// lec: Ways to compare
// difference bttween .equlas and == 


public class compareString {
    public static void main(String[] args) {
        String s1="pwskills";
        String s2=new String("pwskills");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

    }
    
}
