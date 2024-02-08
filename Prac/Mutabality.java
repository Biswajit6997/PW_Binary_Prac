public class Mutabality {

    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnopq");
        // System.out.println("after adding"+sb.capacity());
        // sb.append("sabcdefghijklmnopr");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());


        // 
        StringBuffer sb1=new StringBuffer(15);
        System.out.println(sb1.capacity());//15
        sb1.append("abcdegertg");
        System.out.println(sb1.capacity());//15
        sb1.trimToSize();
        System.out.println(sb1.capacity());//10
    }
}