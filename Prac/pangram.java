// pangram means all sentence contain all the 26 words

// public class pangram {

    // public static void main(String[] args) 
    // {
    //    boolean flag=false;
    //     String str="Sphinx of black quartz judge my vow";
    //     // str=str.replace(" ", "");

    //     str=str.toLowerCase();
    //     str=str.replace(" ", "");
    //     char []ch=str.toCharArray();

    //     int ar[]=new int[26];

    //     for(int i=0;i<ch.length;i++)
    //     {
    //         ar[ch[i]-65]++;
    //     }
    //     for(int i=0;i<ar.length;i++)
    //     {
    //         if(ar[i]==0)
    //         {
    //             System.out.println("Its not pangram");
    //             flag=true;
    //         }
    //     }
        
    //     if(flag==false)
    //     {
    //         System.out.println("Its pangram");
    //     }
        
    // }  
    
    // }
    
        // public static void main(String[] args) {
        //     String sentence = generatePangram();
        //     System.out.println("Pangram: " + sentence);
        // }
    
        // public static String generatePangram() {
        //     StringBuilder pangramBuilder = new StringBuilder();
        //     int[] alphabet = new int[26];
    
        //     while (!isPangram(alphabet)) {
        //         char randomChar = (char) ('a' + (int) (Math.random() * 26));
        //         pangramBuilder.append(randomChar);
        //         alphabet[randomChar - 'a']++;
        //     }
    
        //     return pangramBuilder.toString();
        // }
    
        // public static boolean isPangram(int[] alphabet) {
        //     for (int count : alphabet) {
        //         if (count == 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }




        import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pangram {
    public static void main(String[] args) {
        String pangram = generatePangram();
        System.out.println("Pangram: " + pangram);
    }

    public static String generatePangram() {
        String alphabet = "sphinxofblackquartzjudgeyvow";
        List<String> letters = Arrays.asList(alphabet.split(""));
        Collections.shuffle(letters);
        StringBuilder pangramBuilder = new StringBuilder();
        for (String letter : letters) {
            pangramBuilder.append(letter);
        }
        return pangramBuilder.toString();
    }
}

    
    

    


