
// Time complexity is :O(n)
// Space Complexity is :O(1)

public class missingelement {

    public static void missingElement(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        // sum of natural number
        int sum_of_naturalnum = ((n + 1) * (n + 2)) / 2;

        // missing element will be sumofnatural number - sum of array
        int missing_element = sum_of_naturalnum - sum;
        System.out.println("Missing element in an array is : " + missing_element);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7 };
        missingElement(arr);

    }

}
// GFG

/*class Solution {
    int missingNumber(int array[], int n) {
        // int m=arrray.length;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        
        int sum_of_naturalno=((n)*(n+1))/2;
        
        int missing_number=sum_of_naturalno-sum;
        // System.out.println("Missing element is "+missing_number);
        // Your Code Here
    return missing_number;
    }
}*/