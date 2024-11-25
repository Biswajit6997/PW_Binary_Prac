import java.io.IOException;
import java.io.File;

public class FileEg2 {
    public static void main(String[] args) throws IOException {
        File fp=new File("BISWA");
        // System.out.println(fp.isDirectory());
        fp.mkdir();//to create this folder
        System.out.println("dir is refering to directory BISWA : "+fp.isDirectory());

        File fp1=new File(fp,"biswa.txt");// to create a file under BISWA folder
        fp1.createNewFile();// To create biswa.txt
        System.out.println("File is refering to biswa.txt : "+fp1.isFile());
        //

        System.out.println("-------------TO count How many file are exist--------------------------");
        int count=0;
        File f=new File("Biswa");
        String str[]=f.list();
        for(String name :str){
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are : "+count);






    }
}
