public class Eg2 {
    public static void main(String[] args) {
        String s1="pwskills";
        String s2="pwskills";
        String s3=new String("pwskills");
        String s4=new String("PWSKILLS");
        System.out.println(s1==s2);
        System.out.println(s2.equals(s3));//true
        System.out.println(s3.equals(s4));//false
        System.out.println(s2.equalsIgnoreCase(s4));//true
    }
}
