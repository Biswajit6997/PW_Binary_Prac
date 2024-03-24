public class MoreOnString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// 16

        sb.append("abcdefghijklmnop");// by defalult 16
        System.out.println(sb.capacity());// 16

        sb.append("a");
        System.out.println(sb.capacity());// 34--> how many character you acn add
        System.out.println(sb.length());// 17--> how many character are present
        //////////////////////////////////////////////////
        StringBuffer a = new StringBuffer("biswajit");
        System.out.println(a.capacity());// 24-->16+8
        System.out.println(a.charAt(1));// i
        a.setCharAt(1, 'S');
        System.out.println(a);// bSswajit

        // /////////////////////
        StringBuilder sb3=new StringBuilder(150);//capacity will be 150
        System.out.println(sb3.capacity());//150
        sb3.append("java");
        System.out.println(sb3.capacity());//150 e hobe 
        sb3.trimToSize();
        System.out.println(sb3.capacity());//4--> java
        // ////////////////////////////////////
        StringBuilder sb4=new StringBuilder("pwskills java");
        sb4.reverse();
        System.out.println(sb4);//avaj sllikswp
    


    }
}
