import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterEg {
    public static void main(String[] args) throws Exception {
         
        File fp=new File("PW");
        File file=new File(fp,"Eg1.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file);
        PrintWriter pw =new PrintWriter(fw);
        // pw.write(67);
        // pw.write("\n");

        /******** */
        pw.println("Biswajit");
        pw.println("pw");
        pw.println(100);
        pw.println(50.45);
        pw.println(true);
        pw.close();
        System.out.println("To see the ootput open Eg1.text in PW folder");
    }
}
