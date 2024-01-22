public class InstaceVariable {
    int a=2;
   String name="Sourav";
    public static void main(String[] args) {
        InstaceVariable obj1 =new InstaceVariable();
        InstaceVariable obj2 =new InstaceVariable();
        obj1.name="biswajit";
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}