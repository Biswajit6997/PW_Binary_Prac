import java.io.*;

public class PrintWriterEg {
    public static void main(String[] args) throws IOException{
        File f=new File("PW","pw.txt");

        FileWriter fp=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fp);
        pw.println("Biswajit");
        pw.println(100);
        pw.print("pw skills");
        
        pw.close();

    }
}
