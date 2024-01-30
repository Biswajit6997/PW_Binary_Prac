// +  in java
// we can add multiple string using + operator and as well as number also


public class eg3 {

    public static void main(String[] args) {
        String s1="pw";
        String s2="PW"+"Skills";
        String s3="pw"+"java"+"skills";
        String s4=s1+s2;
        System.out.println(s1);//pw
        System.out.println(s2);//PWSkills
        System.out.println(s3);//pwjavaskills
        System.out.println(s4);//pwPWSkills

        String s5="pw"+100+99;
        System.out.println(s5);//pw10099
    }
}