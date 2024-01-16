// Time Complexity :O(n)
// Space Complexity :O(1)

public class pallindromicarray {

    public static void pallindromicArray(int arr[]) {
        int n = arr.length;
        int flag = 0;
        // loop will be go to middile index of the array
        for (int i = 0; i < n / 2; i++) {

            if (arr[i] != arr[n - i - 1]) {// compare the number with the first index with last index
                flag = 1;
                System.out.println("The array is not a pallindromic array");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The array is  a pallindromic array");
        
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3,7,  2, 1 };
        pallindromicArray(arr);

    }
}


