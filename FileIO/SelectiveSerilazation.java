// 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Crickter implements Serializable{
    String name;
    transient int age;// we use" transient" keyword to not tomparrticaipate in deserilazation
    int runs;

    public Crickter(String name,int age,int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}




public class SelectiveSerilazation {
    public static void main(String[] args) throws Exception {
        // Crickter c=new Crickter("Biswajit",24,200);
        // c.display();

        // FileOutputStream fos=new FileOutputStream("eg2.txt");
        // ObjectOutputStream oos=new ObjectOutputStream(fos);
        // oos.writeObject(c);
        // oos.flush();


        FileInputStream fis=new FileInputStream("eg2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Crickter c=(Crickter)ois.readObject();
        c.display();//Biswajit
                    // 0
                    //200
        
    }
}
