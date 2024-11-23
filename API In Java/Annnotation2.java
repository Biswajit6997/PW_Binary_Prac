/*
 


 */

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;





@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//
@Retention(RetentionPolicy.RUNTIME)//

@interface CricketPlayer{// annotation is like interface --> just age " @ " lagiya dite hobe
    //  we can create blank interface also 
    // ----OR--
    String country() default "India"; // When we declear any method we have to declear defalult // or jokon use korbo tokon pass korte hobe
    int age() default 34;
}


@CricketPlayer //-->Predefined Annnotatiion
class Virat{
    @CricketPlayer //--> we can use annotation in method for -->ElementType.METHOD
    private int innings;
    private int runs;

    public int getInnings(){
        return innings;
    }
    public void setInnings(int innings){
        this.innings=innings;

    }
    public int getRuns(){
        return runs;
    }
    public void setRuns(int runs){
        this.runs=runs;
    }
}


public class Annnotation2 {
    public static void main(String[] args) {
        Virat v=new Virat();
        v.setInnings(300);
        v.setRuns(20000);

        System.out.println(v.getRuns());
        System.out.println(v.getInnings());
        //-----

        Class c=v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp= (CricketPlayer)a;
        
        String country=cp.country();
        System.out.println(country);
        int age=cp.age();
        System.out.println(age);
            
        


    }
}
