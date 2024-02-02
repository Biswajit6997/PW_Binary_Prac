// video 258 BufferWriter & FileWriter

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterAndFileWriter {
    public static void main(String[] args) throws IOException {
        File fp=new File("PW");
        File file =new File(fp,"Example1.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bw=new BufferedWriter(fw);// BufferedWriter include the ref of FileWriter

        // append the .txt file
        bw.write("Biswajit");
        bw.newLine();
        bw.write(66);
        bw.newLine();
        char ch[]={'p','w','s','k','i','l','l'};
        bw.write(ch);
        // bw.close();
        System.out.println("To see hr output open the Example.txt file in PW folder");
        bw.flush();




    }
    
}
