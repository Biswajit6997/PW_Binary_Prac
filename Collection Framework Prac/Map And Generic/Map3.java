import java.util.*;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    // If we do not override it will excute the garbage value
    @Override
    public String toString(){
        return name +" "+age+ " "+city;
    }
}

public class Map3 {
    public static void main(String[] args) {
        Student st1 = new Student("Rohan", 18, "Bangalore");
        Student st2 = new Student("Rohit", 19, "Delhi");
        Student st3 = new Student("Ramesh", 22, "Mysore");

        Map mp = new HashMap();
        mp.put(1, st1);
        mp.put(2, st2);
        mp.put(3, st3);
        System.out.println(mp);


        // -------OR-----
        Set s=mp.entrySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }

}
