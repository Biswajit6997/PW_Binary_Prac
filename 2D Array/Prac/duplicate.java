public class duplicate {
    static int duplicate1(int arr[]){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]!=arr[i+1]){
                i++;
                System.out.println(arr[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        duplicate1(arr);
        
    }
}