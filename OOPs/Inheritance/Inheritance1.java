// package Inheritance;
class Human{// Parent class || Super Class 
    int age;
    void sleep(){
        age=18;
        System.out.println("Human is calling");
        System.out.println(age);

    }
}
class Student extends Human{ // Child class || sub class

}
public class Inheritance1 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.sleep();
        
    }
}
