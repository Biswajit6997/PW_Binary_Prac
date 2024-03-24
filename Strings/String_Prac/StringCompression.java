public class StringCompression {
    // Approach 1
    
    static String compress( String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    // Approach 2
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        // Check if compressed string is shorter than original string
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String str = "aaabbbcc";
        System.out.println("Original string: " + str);
        // System.out.println("Compressed string: " + compressString(str));
        System.out.println("Compressed string: " + compress(str));
    }
}
