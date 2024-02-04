

import java.util.*;
import java.util.Map.*;

class Student {
    private String name;
    private int roll_no;
    private int age;

    Student(String name, int roll_no, int age) {
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return name +"  " + roll_no +"  "  +age;
    }

}



public class Hasmap3
{
    public static void main(String[] args) 
    {

        Student s1 = new Student("biswajit", 43, 21);
        Student s2 = new Student("Partha", 40, 22);
        Student s3 = new Student("Arup", 32, 20);


        Map map=new HashMap();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);

        // System.out.println(map);

        Set set=map.entrySet();
        Iterator itr=set.iterator();

        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
            
        }

        // Set en=map.keySet();
        // Iterator itr1=en.iterator();
        // while (itr1.hasNext()) {
        //     // System.out.println(itr1.next());
        //     Map.Entry data=(Entry)itr1.next();
        //     System.out.println(data.getKey() + " : "+data.getValue());
            
        // }

    }
    
}




