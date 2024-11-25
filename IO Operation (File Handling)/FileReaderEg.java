// Reading data from file to jva using File Reader
import java.io.*;


public class FileReaderEg {
    public static void main(String[] args)  throws IOException{
        File fp=new File("PW");
        File file=new File(fp,"pw.txt");
        FileReader fd=new FileReader(file);

        int i=fd.read();
        // System.out.println((char)i); //for accessing first charchater 

        while (i!=-1) {
            System.out.print(i+"--->");
            System.out.println((char)i);
            i=fd.read();//go to next chat to read

            
        }


    }
}
