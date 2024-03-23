public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Virat");
        System.out.println(sb);
        sb.append("Kohili");
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("Biswajit") ;
        sb1.append("Dey");
        System.out.println(sb1);
    }
}
