import java.io.File;
import java.io.FileWriter;


//v 255 Writing data ONto file using fileReader
import java.io.IOError;
import java.io.IOException;

public class WriteOperation {
    public static void main(String[] args) throws IOException {
        File fp=new File("PW");
        fp.mkdir();
        File file=new File(fp,"Eg.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file,true);
        fw.write("Biswajit");
        fw.write("\n");
        fw.write("HEllo");
        fw.write("\n");

        fw.write(66);
        fw.write("\n");

        fw.write(97);
        fw.write("\n");

        fw.write(".................");

        fw.write("\n");

        // fw.close();
        fw.flush();
        

        System.out.println("To seen the result open Eg.txt in PW Folder");
    }
}
