package Loop;

/**
 * while_dowhile
 */
public class while_dowhile {

    public static void main(String[] args) {
        int i=0;
        while (i<5) {
            System.out.println ("while loop" + " ");
            i++;
            
        }

        // do-while loop
        do{
            System.out.println("do while loop"+ " ");
            i++;
        }while(i<5);

    }
}