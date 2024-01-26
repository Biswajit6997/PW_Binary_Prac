//v.196 Hireachy of  Exception class and checked unchacked Exception 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnchackedException {
    public static void main(String[] args) {
        int result=7/0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       try {
        String str= br.readLine();
    } catch (IOException e) {
        
        e.printStackTrace();
    }
    }
    
}
