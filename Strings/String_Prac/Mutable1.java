public class Mutable1 {
    public static void main(String[] args) {
    //    final int a=10;
    //     a=20;
    //     System.out.println(a);

        final StringBuffer sb=new StringBuffer("Virat");
        sb.append("Kohili");
        System.out.println(sb);
        // sb=new StringBuffer("Sachine");//this is not posiible because we cannot change the final value 
        System.out.println(sb);

    }
}
