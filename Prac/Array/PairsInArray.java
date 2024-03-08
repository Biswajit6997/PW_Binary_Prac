public class PairsInArray {

    public static void Pairs(int arr[]){
        int count=0;//for pairs in the array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;//for total pairs in the array
            }
            System.out.println();
        }
        //For total pairs  of the array
        System.out.println("Total pairs  in the array is : "+count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Pairs(arr);
        
    }
}
