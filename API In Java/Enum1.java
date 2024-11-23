// enum-> java 1.5

public class Enum1 {

    enum Week{
        MON,TUE,WED,THUR,FRI,SATUR,SUN
    }
    public static void main(String[] args) {
        // We can also create enuminside class
        enum Result{
            PASS,FAIl,NR
        }
        Week w=Week.MON;
        System.out.println(w);//MON

        int index=w.ordinal();
        System.out.println(index);//0

        // if we access all the element in array form 

        Week wr[]=Week.values();// it return type array
        for(Week w1:wr)
        {
            System.out.print(w1+" ");//MON TUE WED THUR FRI SATUR SUN 

        }
        
    }
}
