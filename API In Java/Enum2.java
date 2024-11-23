import javax.naming.spi.ResolveResult;

public class Enum2 {
    enum Result {
        PASS, FAIL, NR;
        // Automaticlly call ----
        // public static final Result PASS=new Result();

        // public static final Result PASS=new Result();

        // public static final Result PASS=new Result();

        int marks;

        Result() {
            System.out.println("Inside constructor is calling...");
        }

        void setMarks(int marks) {
            this.marks = marks;
        }

        int getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        Result.PASS.setMarks(100);
        int marks = Result.PASS.getMarks();
        System.out.println(marks);//100

        /* Output will be
         * Inside constructor is calling...
         * Inside constructor is calling...
         * Inside constructor is calling...
         * 100
         */

        int marks2=Result.FAIL.getMarks();
        System.out.println(marks2);//0

        Result.NR.setMarks(45);
        int marks3=Result.NR.getMarks();
        System.out.println(marks3);//45

    }
}
