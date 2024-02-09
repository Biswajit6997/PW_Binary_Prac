import java.util.Random;

public class randomip {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(255);
        int rand_int2 = rand.nextInt(255);
        int rand_int3 = rand.nextInt(255);
        int rand_int4 = rand.nextInt(255);
        String str=rand_int1+"."+rand_int2+"."+rand_int3+"."+rand_int4;
       (int)str.startsWith(01);
    }
}
