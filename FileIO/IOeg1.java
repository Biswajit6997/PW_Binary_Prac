import java.io.File;
import java.io.IOException;

public class IOeg1{
    public static void main(String[] args) throws IOException
     {
        File file1=new File("example.txt");
        System.out.println(file1.exists());//false

        file1.createNewFile();// Create the file
        System.out.println(file1.exists());//true

        
    }
}