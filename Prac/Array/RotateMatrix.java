import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateMatrix {

    public static void Rotate(int arr[][]){
        //Step1: Transpose the 2D array
        
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


        //Step -2: Swap right and left index
        for(int i=0;i<m;i++){
            int left_index=0;
            int right_index=n-1;
            while (left_index<right_index) {
                int temp=arr[i][left_index];
                arr[i][left_index]=arr[i][right_index];
                arr[i][right_index]=temp;
                left_index++;
                right_index--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        Rotate(arr);
        for(var matrix:arr){
            System.out.println(Arrays.toString(matrix));
        }

    }
}
