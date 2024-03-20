public class concatMethod {
    public static void main(String[] args) {
        // String s1="pw";
        // s1.concat("Skills");
        // System.out.println(s1);//pw
        // s1=s1.concat("Skills");
        // System.out.println(s1);//pwSkills


        String s1="pwjava";
        String s2=s1.concat("Skills");
        String s3=new String("pwjava");
        s3=s3.concat("Skills");
        System.out.println(s1);//pwjava
        System.out.println(s2);//pwjavaSkills
        System.out.println(s3);//pwjavaSkills
        System.out.println(".........................................................................");
        // + opertator

        String a1="pw";
        String a2="pw"+"java";
        String a3="pw"+"java"+"skills";
        String a4=a1+a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);


    String num="pw"+100+99;
    System.out.println(num);

    }
}
