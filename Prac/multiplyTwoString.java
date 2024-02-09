public class multiplyTwoString {
    public static void main(String[] args) {
        String a="0023";
        String b="2";
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                int n=b.length();

                System.out.println(a.charAt(n-i-1)*b.charAt(j));
            }

        }
    }
}
