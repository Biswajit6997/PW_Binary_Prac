public class string1 {

    public static void main(String[] args) {

        String a="Biswajit";
        System.out.println(a);
        a.concat("Dey");

        //after concat 
        System.out.println("After concating :"+a);//Biswajit
        StringBuilder sb=new StringBuilder();
        sb.append("Dey");
        System.out.println(sb);
    }
}