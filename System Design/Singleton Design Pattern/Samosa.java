public class Samosa {
    private static Samosa samosa=new Samosa();

    // Eager way to ceating Singleton Object
    public static Samosa getSamosa(){
        return samosa;
    }

}
