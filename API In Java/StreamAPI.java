import java.util.*;
import java.util.stream.*;;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> lt=Arrays.asList(12,3,6,9,10);

        Stream <Integer>stdate=lt.stream().filter(n->n%2==0).sorted();
        stdate.forEach(i->System.out.println(i));
        // Stream<Integer>sortefData=stdate.sorted();
        // Stream<Integer>filterdata=sortefData.map(n->n*2);
        // filterdata.forEach(n->System.out.println(n));


    }
}
