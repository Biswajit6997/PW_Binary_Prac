
class Human {
    int age;

    Human() {
        System.out.println("Human constacture is calling");
    }

    void sleep() {
        age = 19;
        System.out.println("Human have to good sleep");
        System.out.println(age);
    }
}

class student extends Human {
    void display() {
        System.out.println("The age is " + age);
    }
}

public class Inheritance2 {

    public static void main(String[] args) {
        student stu = new student();
        stu.sleep();
        stu.display();
        // stu.human1();

    }
}