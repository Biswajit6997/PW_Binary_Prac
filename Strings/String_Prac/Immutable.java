// Immuatble String in Java

public class Immutable {

    public static void main(String[] args) {
        String brand=new String("Pwskills ");
        System.out.println(brand);
        System.out.println(brand.charAt(2));

        String s1=new String("pw");
        String s2=new String("pw");
        System.out.println(s1==s2);//false

        String s11="biswajit";
        String s12="biswajit";
        System.out.println(s11==s12);//true
    }

    
}
