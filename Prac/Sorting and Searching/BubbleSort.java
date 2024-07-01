import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    static void bubblesort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int didswwapped=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    didswwapped=1;
                }
            }
            if(didswwapped==0){
                break;
            }
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array :");
        // int n = sc.nextInt();

        // System.out.println("Enter the array elemnent :");
        // int arr[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();

        // }
        int arr[]={10,5,4,7,10,20};

        bubblesort(arr);
        System.out.println("Sorted array is :");
        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
