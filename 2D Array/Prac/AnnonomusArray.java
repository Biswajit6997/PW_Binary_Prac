class Clac {
    public int add(int arr[]) {
        int result = 0;
        for (int n : arr) {
            result = result + n;

        }
        return result;

    }
}

public class AnnonomusArray {
    public static void main(String[] args) {
        Clac c = new Clac();
        // int arr[] = { 1, 2, 3, 4 };
        int result = c.add(new int[]{ 1, 2, 3, 4 });//anonymous array
        System.out.println(result);
    }
}
