
// Reading data from file to Java Using FileReader

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {
    public static void main(String[] args) throws IOException {
        File fp=new File("PW");
        File file=new File(fp,"Eg.txt");

        FileReader fr=new FileReader(file);// read the file
        int i=fr.read();
        // System.out.println((char)i);
        while (i!=-1) {
            System.out.print(i+"----->");
            System.out.println((char)i);
            i=fr.read();

            
        }
    }
}
