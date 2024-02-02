//vedio 257 Reading data from file to Java Using FileReader using storing data into array


import java.io.File;
import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;

// import javax.imageio.IIOException;

public class ReadingFileAnother {
    public static void main(String[] args) throws IOException {
        
        File fp=new File("PW");
        File file=new File(fp,"Eg.txt");

        FileReader fr=new FileReader(file);// read the file

        char ch[]=new char[(int)file.length()];// we store the data into an array

        fr.read(ch);//read the data
        for(char data:ch){
            System.out.print(data);
        }

    }
}
