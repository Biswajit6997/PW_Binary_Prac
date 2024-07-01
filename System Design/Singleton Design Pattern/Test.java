public class Test {
    public static void main(String[] args) {
        Jalebi obj = Jalebi.getJelebi();
        System.out.println(obj.hashCode());
        Jalebi obj2 = Jalebi.getJelebi();
        System.out.println(obj.hashCode());

        // *******************************************************
        
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());  
        

    }
}
