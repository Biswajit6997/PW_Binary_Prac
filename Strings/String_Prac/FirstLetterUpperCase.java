// i/p:hi i am biswajit
//o/p :Hi I Am Biswajit


public class FirstLetterUpperCase {

    public static String toPPerCase(String str){
        StringBuilder sb=new StringBuilder("") ;
        char ch=Character.toUpperCase(str.charAt(0));//This line converts the first character of the input string str to uppercase using the Character.toUpperCase() method and assigns it to the variable ch.
        sb.append(ch);//This line appends the uppercase first character (ch) to the StringBuilder object sb.

        for(int i=1;i<str.length();i++){

            if(str.charAt(i)==' ' && i<str.length()-1){//This line checks if the current character is a space (' ') and if the current index i is not at the end of the string (i < str.length() - 1). This condition ensures that the code inside this block doesn't execute when the last character of the string is a space.
        
            
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));//If the condition is met, this block of code appends the space character to the StringBuilder object sb, increments the index i by 1 to skip the space, and then appends the uppercase of the next character to sb.
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();//This line returns the string representation of the StringBuilder object sb.
    }
    public static void main(String[] args) {
        String str="hi,i am biswajit";
        System.out.println(toPPerCase(str));
    }
}
