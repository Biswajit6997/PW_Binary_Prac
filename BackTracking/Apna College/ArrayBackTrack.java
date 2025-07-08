//BackTraking on Arrays :

//  i/p: 1 2 3 4 5 
//  o/p: -1 0 1 2 3 

//T(n) and space ---> O(n)



public class ArrayBackTrack {
    static void changeArray(int arr[],int i,int val){
        // Base case :
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // recursion
        arr[i]=val;
        changeArray(arr, i+1, val+1);// func call step
        arr[i]=arr[i]-2;// backtracking step

    }
    static void printArr(int arr[]){
        for(int i :arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
    
}
