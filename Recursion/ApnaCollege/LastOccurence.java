public class LastOccurence {

    static int findlast(int arr[],int key,int i){
        if(arr.length==i){
            return i;

        }
        int isfound=findlast(arr, key, i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 12, 31, 2, 4, 5 };
        // int arr[] = {5,5,5,5, 5 };
        System.out.println("Last Index is : "+findlast(arr,5,0));
    }
}
