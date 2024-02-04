// v 237 : collection class and it's inbuilt methods

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEg {
    public static void main(String[] args) {
      ArrayList<String> al=new ArrayList<String>();
      al.add("Biswajit");
      al.add("Arup");
      al.add("Sourav");
      al.add("Partha");
      System.out.println(al);//[Biswajit, Arup, Sourav, Partha]
      Collections.sort(al);
      System.out.println(al);//[Arup, Biswajit, Partha, Sourav]


      ArrayList<Integer> al1=new ArrayList<Integer>();
      al1.add(200);
      al1.add(100);
      al1.add(300);
      al1.add(500);
      al1.add(400);
      System.out.println(al1);//[200, 100, 300, 500, 400]
      Collections.sort(al1);

      System.out.println(Collections.binarySearch(al1, 500));// return a integer i,e 4




    }
}
