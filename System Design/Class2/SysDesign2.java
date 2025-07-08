// package Class2;

public class SysDesign2 {
    public static void main(String[] args) {
        boolean jump= true;
        boolean run=true;
        boolean fly=false;
        boolean weapon=true;

        // bad implementiion
        
        if (weapon==true){
            if (weapon) {
                if (jump) {
                    if (run) {
                        if (fly) {
                            System.out.println("Superman");
                        } else {
                            System.out.println("Batman");
                        }
                    } else {
                        System.out.println("Spiderman");
                    }
                } else {
                    System.out.println("Hulk");
                }
            } else {
                System.out.println("Ironman");
                
            }
        } else {
            System.out.println("No Superhero");
        }

        // good implementation
        if(jump &&run && fly && weapon){
            System.out.println("Superman"); 
        } else if (jump && run && !fly && weapon) {
            System.out.println("Batman");   
        } else if (jump && !run && !fly && weapon) {
            System.out.println("Spiderman");    
        } else if (!jump && !run && !fly && weapon) {
            System.out.println("Hulk");

        }
    }
}
