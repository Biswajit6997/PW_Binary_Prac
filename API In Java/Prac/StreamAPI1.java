package Prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(2,3,5,7,9,10);
        Stream <Integer>st=li.stream();
        st.forEach(i->System.out.println(i));
    }
}
