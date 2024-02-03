import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Crickter implements Serializable{
    private String name;
    private int age;
    private int runs;

    public Crickter(String name,int age,int runs){
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}


public class SerilazationEg {
    public static void main(String[] args) throws Exception {
        Crickter c=new Crickter("Sachine", 44, 30000);

        FileOutputStream fos=new FileOutputStream("Serilazation.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);

        System.out.println("To see the output see th Seriazation.txt file");

        oos.flush();
        oos.close();
            
      

        
    }
}
