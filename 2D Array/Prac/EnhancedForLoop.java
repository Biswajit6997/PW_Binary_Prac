public class EnhancedForLoop {
    public static void main(String[] args) {
        int arr[]={4,3,12,34};
        // Enhanced for loop
        for(int a:arr){
            System.out.print(a);
        }

        int arr2[][]={
            {1,12,23,4,4},
            {2,3,45,56,45},
            {1,2,3,4,5,6}
        };
        for(int a[]:arr2){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();

        }
    };
}
