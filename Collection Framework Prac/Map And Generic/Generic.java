
/*
 Generic :   <>
 it introduce in JDK 5.0


 */

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> ite=new ArrayList<>();
        ite.add(10);
        ite.add(20);
        ite.add(30);
        // ite.add("bis");// this will give u error in Complile time
        System.out.println(ite);
    }
    
}
