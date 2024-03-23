public class new1 {
    public static void main(String[] args) {
        String s="bcadeh";
        String s1="hea";
        // if(s.equals(s1)){
        //     return 
        // }
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        // Count frequencies of characters in s1
        for (char e : s1.toCharArray()) {
            f1[e - 'a']++;
        }

        // Count frequencies of characters in s2
        for (char e : s1.toCharArray()) {
            f2[e - 'a']++;
        }

        // Calculate the absolute difference in frequencies
        int difference = 0;
        for (int i = 0; i < 26; i++) {
            difference += Math.abs(f1[i] - f2[i]);
        }
        System.out.println(difference);
    }
}
