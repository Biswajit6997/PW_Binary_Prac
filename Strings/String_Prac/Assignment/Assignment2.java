// package Assignment;
//i/p:Think Twice
//o/p:kniht eciwt
public class Assignment2 {
    public static void main(String[] args) {
        String str="Think Twice";
        String str1="";
        
        str=str.toLowerCase();
        
        String arr[]=str.split(" ");
        for(String elem:arr){
            for(int i=elem.length()-1;i>=0;i--)
            {
                str1=str1+elem.charAt(i);
            }
            str1=str1+" ";
        }
        System.out.println(str1);



    }
}
