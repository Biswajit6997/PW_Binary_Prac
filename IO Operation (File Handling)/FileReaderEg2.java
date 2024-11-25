// Reading data from file to jva using File Reader
import java.io.*;


public class FileReaderEg2 {
    public static void main(String[] args)  throws IOException{
        File fp=new File("PW");
        File file=new File(fp,"pw.txt");
        FileReader fd=new FileReader(file);

        // Another way to accesss the all text from pw.txt file

       char ch[]=new char[(int)file.length()];
       fd.read(ch);
       for(char data:ch){
            System.out.println(data);
       }

    }
}
