
class Student{
    private String name;
    private int age;
    private String city;
    Student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    @Override
    public String toString(){
        return "Name : "+name+" | age : "+age+" |city : "+city;
    }

}

public class IOOperation1 {


    public static void main(String[] args) {
        Student st1=new Student("Virat", 34, "Mumbai");
        System.out.println(st1);
        Student st2=new Student("Sachine", 44, "Delhi");
        System.out.println(st2);

        
    }
}