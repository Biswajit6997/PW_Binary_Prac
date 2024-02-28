public class ArrayException {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
