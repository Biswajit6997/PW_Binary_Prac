public class Jalebi{
    // constractor used to create object
    static Jalebi jalebi;
    public Jalebi(){
        // constructor

    }

    // Lazy way of creating singleton Object

    public  static Jalebi getJelebi(){

        synchronized (Jalebi.class){//one thread at a time

            if (jalebi==null) { //will excute only first time 
                jalebi=new Jalebi();
                
            }

        }

        // Jalebi jalebi =new Jalebi();
        return jalebi;
 
    }

}