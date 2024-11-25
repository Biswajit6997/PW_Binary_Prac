
import java.io.*;

public class BufferedReader_FileReader {
    public static void main(String[] args) throws IOException {
        File f = new File("PW", "pw.txt");

        FileReader fp = new FileReader(f);
        BufferedReader br = new BufferedReader(fp);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();

        }
        br.close();

    }
}
