// Time complexity is :O(n)
// Space  complexity is :O(1)


public class Duplicatenum {

    public static void duplicate(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number found!! ");
                    System.out.println("Duplicate number is : " +arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,4,7,10};
        duplicate(arr);

    }
    }