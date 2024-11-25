import java.io.File;
import java.io.IOException;

public class FileEg1 {
    public static void main(String[] args) throws IOException {
        File fi = new File("pw.txt");
        System.out.println(fi.exists());// False
        // To create a file if no exist
        fi.createNewFile();
        System.out.println(fi.exists());// True

        // To Create a Directory --> Folder

        File dir = new File("PW");
        System.out.println(dir.exists());// False
        // If folder not exist
        dir.mkdir();
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.exists());// True
    }
}
