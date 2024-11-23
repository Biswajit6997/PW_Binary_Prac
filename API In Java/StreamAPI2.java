// Module -48 --> video -More in Stream API

import java.util.*;
import java.util.stream.*;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(12, 2, 3, 4, 6, 9, 8);

        Stream<Integer> streamdata = lt.stream();

        // System.out.println( streamdata.count());//5
        // Stream<Integer>sorteddata=streamdata.sorted();
        // sorteddata.forEach(i->System.out.print(i+" "));//2 4 6 8 9 12 -> sorted data
        // --------------------------------------

        // Stream<Integer>sorteddata1=streamdata.sorted();
        // Stream<Integer> mapStream=sorteddata1.map(n->n*2);
        // mapStream.forEach(n->System.out.print(n+" "));//4 8 12 16 18 24

        // ------------------------------filter-->sorted-->map-------

        // Stream filterData= streamdata.filter(n->n%2==0);
        // Stream<Integer>sorteddata=filterData.sorted();
        // Stream<Integer> mapStream=sorteddata.map(n->n*2);

        // mapStream.forEach(n->System.out.print(n+" "));

        // -----OR-- ----- 1 line
        Stream filterData = streamdata.filter(n -> n % 2 == 0).sorted().map(n -> n * 4);
        filterData.forEach(i -> System.out.print(i+" "));

    }
}
