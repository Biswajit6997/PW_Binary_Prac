// Q:WAF to find the first occurence of an element in an array
//i/p :{1,2,3,4,5,6,12,31,2,4} key =2
//o/p:1 --> index of 2 is 1
// T(n)=O(n)
// Space =O(n)

public class firstOccurence {

    static int findFirstOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return findFirstOccurence(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 12, 31, 2, 4, 5 };
        System.out.println("Item found at idx : "+findFirstOccurence(arr, 5, 0));

    }
}
