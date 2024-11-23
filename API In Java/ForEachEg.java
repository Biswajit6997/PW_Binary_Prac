import java.lang.reflect.Array;
import java.util.*;

public class ForEachEg {
    public static void main(String[] args) {
        /*List<Integer>lt=new ArrayList<Integer>();
        lt.add(2);
        lt.add(4);
        lt.add(6);
        lt.add(8);
        lt.add(10);
        System.out.println(lt);*/

        // Another way to create a list 
        List<Integer> lt2=Arrays.asList(3,5,7,9,11);
        System.out.println(lt2);

        // ---Ehanced For each loop-----

        // for(Integer i: lt2){
        //     System.out.print(i+" ");//3 5 7 9 11  
        // }

        // Another way--> Using Consumer Interface
        // i->System.out.print(i) it is lambda expression

        lt2.forEach(i->System.out.print(i));

    }
}
