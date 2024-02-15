import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sequenceprob {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        Set<E> <Integer>set=new HashSet<>();
        al.add(0);
        al.add(0);
        for(int i=1;i<n;i++){
            int ans=al.get(i-1)-i;
            if(ans>0 && !set.contains(ans)){
                al.add(ans);
                set.add(ans);
            }
            else{
                al.add(al.get(i-1)+i);
                set.add(al.get(i-1)+i);
            }
        }
        return al;
    }
}
