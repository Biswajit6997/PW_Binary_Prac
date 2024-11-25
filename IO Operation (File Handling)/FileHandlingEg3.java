//  Insert data into folder using FileWriter class


import java.io.*;
public class FileHandlingEg3 {
    public static void main(String[] args) throws IOException {
        File dir =new File("PW");
        File f1=new File(dir,"pw.txt");
        f1.createNewFile();

        // To insert data into the pw.txt file
        FileWriter fw=new FileWriter(f1,true);
        fw.write("Hi Biswajit !! How are you");
        fw.write("\n");
        fw.write("PW");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        fw.close();// close() na korle add hobe na
        System.out.println(" please Open pw.txt to see the result");



    }
}
