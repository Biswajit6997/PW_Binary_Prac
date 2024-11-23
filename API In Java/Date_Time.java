import java.util.*;


public class Date_Time {

    public static void main(String[] args) {
        java.util.Date dt=new java.util.Date();// This is also a valid syntax
        // java.util.ArrayList a=new java.util.ArrayList<>();

        // System.out.println(dt);

        Date dt1=new Date();
        System.out.println(dt1);

       long timeInMs= dt1.getTime();
       java.sql.Date dt2=new java.sql.Date(timeInMs);
       System.out.println(dt2);// 2024-11-21

    }
}