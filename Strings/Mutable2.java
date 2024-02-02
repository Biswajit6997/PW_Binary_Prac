// capacity and stringbuffer
public class Mutable2 {
    public static void main(String[] args) {
     

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// 16
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());// 16
        sb.append('q');
        System.out.println(sb.capacity());// 34 capicity=(current +1)*2
    }

}
