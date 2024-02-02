
//video 259 BufferedReader and FileReader example

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderAndFileReader {
    public static void main(String[] args) throws Exception {
        File fp = new File("PW");
        File file = new File(fp, "Example1.txt");

        FileReader fr=new FileReader(file);
        BufferedReader bf=new BufferedReader(fr);// read the file


        String line=bf.readLine();
        
        while (line!=null) {
            System.out.println(line);
            line=bf.readLine();
        }


    }
}
