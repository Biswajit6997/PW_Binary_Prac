// BufferedWriter and fileWriter in java

import java.io.*;

public class BufferWriter_FileWriter {
    public static void main(String[] args) throws IOException{
        // File fp=new File("PW");
        File f=new File("PW","pw.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter br=new BufferedWriter(fw);

        br.write("Java");
        br.newLine();
        br.write(65);
        br.newLine();
        char ch[]={'B','I','S'};
        br.write(ch);
        

        br.close();

    }
}
