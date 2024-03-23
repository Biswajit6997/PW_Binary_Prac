import java.util.Set;
import java.util.HashSet;

public class pangram1 {
    public static void main(String[] args) {
        boolean flag = true;
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
    
        Set<Character> alphabet = new HashSet<>();
        // Add all characters from 'a' to 'z' in hashset
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        // Remove every character from the set
        for (int i = 0; i < sentence.length(); i++) {
            alphabet.remove(sentence.charAt(i));
        }
        // If set is empty, then it's a pangram
        if (alphabet.isEmpty()) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
