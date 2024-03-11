
// I/p:1, 2, 3, 4, 5
// o/p:1 3 6 10 15 

public class PrefixSum {
    public static int[] prefix(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int[] result = prefix(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
// public class PrefixSum {
//     public static int[] prefix(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             arr[i] += arr[i-1];
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         int[] result = prefix(arr);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }
