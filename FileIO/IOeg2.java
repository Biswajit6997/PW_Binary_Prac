import java.io.File;
import java.io.IOException;

public class IOeg2 {
    public static void main(String[] args) throws IOException {
        File fp = new File("PWJAVA");
        System.out.println(fp.isDirectory());
        fp.mkdir();// create a new Folder

        File file = new File(fp, "pwskills.txt");// create a new file under PWJAVA folder
        file.createNewFile();
        /******************************************** */
        // Count how many file are exist in the folder
        int count = 0;
        File f = new File("PWJAVA");
        String str[] = f.list();// list all the file 
        for (String name : str) {//for each loop
            count++;
            System.out.println(name);
        }
        System.out.println("No of file are :" + count);

    }
}
