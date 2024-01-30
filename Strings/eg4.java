// All inbuild method in Strings

public class eg4 {
    public static void main(String[] args) {
        String str="Pw Skills Java";
        System.out.println(str.toUpperCase());//PW SKILLS JAVA
        System.out.println(str.toLowerCase());//pw skills java
        System.out.println(str.length());//14
        System.out.println(str.charAt(1));//w
        System.out.println(str.substring(3, 8));//Skill
        System.out.println(str.indexOf("S"));//3
        System.out.println(str.indexOf("a"));//11
        System.out.println(str.lastIndexOf("a"));//13
    }
}
