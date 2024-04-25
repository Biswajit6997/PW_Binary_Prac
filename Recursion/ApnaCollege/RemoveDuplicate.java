// Q:Find Duplicate in a Strting

// i/p:appnnacollege
// O/p:apncoleg
//Time Complexity: O(n)
// Space Complexity: O(n)

public class RemoveDuplicate {


    static void remove(String str, int idx, StringBuilder newStr, boolean[] map) {
        // Base Cse
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // duplicate
            remove(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            remove(str, idx + 1, newStr.append(currChar), map);
        }

    }
    public static String removeDuplicates(String str) {
        // Base case: if string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Check if the first character appears later in the string
        if (str.substring(1).contains(String.valueOf(str.charAt(0)))) {
            // Skip the first character and call recursively on the remaining substring
            return removeDuplicates(str.substring(1));
        } else {
            // Keep the first character and call recursively on the remaining substring
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }


    public static void main(String[] args) {
        String str = "appnnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
        // String result = removeDuplicates(str);
        // System.out.println(result);

    }
}
