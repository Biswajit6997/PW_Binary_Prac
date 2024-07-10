// Seaech in Rotated Sorted Array

public class Q1 {

    static int search(int arr[], int tar, int si, int ei) {
        if(si>ei){
            return -1;
        }
        
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        // Lies in L1
        if (arr[si] <= arr[mid]) {
               // case a:left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {
                // case b: right
                return search(arr, tar, mid + 1, ei);
            }

        }
        // lie in L2
        else {
            // class c: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid-1, ei);

            }
            else{
                // case d:left
                return search(arr, tar, si, mid-1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(target+"Element present in at idx"+tarIdx);

    }

}
